/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.service;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.prodigy4440.config.Months;
import com.prodigy4440.config.ProcessFile;
import com.prodigy4440.entities.Billing;
import com.prodigy4440.entities.BillingMode;
import com.prodigy4440.entities.BusinessDistrict;
import com.prodigy4440.entities.Customer;
import com.prodigy4440.models.UnseparatedData;
import com.prodigy4440.utils.GeneralUtil;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Objects;
import javax.ejb.Asynchronous;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author prodigy4440
 */
@Stateless
public class Service {

  private static final Logger LOG = LoggerFactory.getLogger(Service.class);

  @PersistenceContext
  private EntityManager em;

  @Asynchronous
  public void migrate() {
    ProcessFile processFile = getNextProcessingFile();
    if (Objects.nonNull(processFile)) {

      if (processFile.getFilePath().contains("DECEMBER_2015")
              | processFile.getFilePath().contains("JANUARY_2016")) {
        processFile2(processFile);
      } else {
        processFile(processFile);
      }
    }
  }

  public ProcessFile getNextProcessingFile() {
    List<ProcessFile> processFiles = em.createQuery("SELECT p FROM ProcessFile p WHERE p.status = :status",
            ProcessFile.class).setParameter("status", ProcessFile.Status.PROCESSING).getResultList();
    if (processFiles.isEmpty()) {
      List<ProcessFile> pfs = em.createQuery("SELECT p FROM ProcessFile p WHERE p.status = :status",
              ProcessFile.class).setParameter("status", ProcessFile.Status.UNPROCESS).getResultList();
      if (pfs.isEmpty()) {
        return null;
      } else {
        return pfs.get(0);
      }
    } else {
      return processFiles.get(0);
    }
  }

  public void processFile(ProcessFile processFile) {
    try {
      String filePath = processFile.getFilePath();
      JsonReader reader = new JsonReader(new BufferedReader(new FileReader(filePath)));
      final UnseparatedData unseparatedData[] = new Gson().fromJson(reader, UnseparatedData[].class);

      int start = 0;
      if (Objects.nonNull(processFile.getCurrentId())) {
        start = processFile.getCurrentId();
      }
      int index = start;
      int count = 0;

      for (int i = start; i < unseparatedData.length; i++) {
        UnseparatedData un = unseparatedData[i];
        LOG.info("Processing Record : " + un.getSerialNo());
        BusinessDistrict bd = GeneralUtil.computeDistrict(filePath);
        persistOrUpdate(un, bd, em);
        LOG.info("Done Processing Record : " + un.getSerialNo());
        count++;
        index = i;
        if (count == 1000) {
          processFile.setStatus(ProcessFile.Status.PROCESSING);
          processFile.setCurrentId(i);
          em.merge(processFile);
          break;
        }
      }

      if (index == unseparatedData.length) {
        processFile.setCurrentId(index);
        processFile.setStatus(ProcessFile.Status.PROCESSED);
        em.merge(processFile);
      }
    } catch (FileNotFoundException ex) {
      LOG.info("Error loading file from path, ", ex.getMessage());
    }
  }

  public void processFile2(ProcessFile processFile) {
    try {
      String filePath = processFile.getFilePath();
      JsonReader reader = new JsonReader(new BufferedReader(new FileReader(filePath)));
      final com.prodigy4440.models2.UnseparatedData unseparatedData[]
              = new Gson().fromJson(reader, com.prodigy4440.models2.UnseparatedData[].class);

      int start = 0;
      if (Objects.nonNull(processFile.getCurrentId())) {
        start = processFile.getCurrentId();
      }
      int index = start;
      int count = 0;

      for (int i = start; i < unseparatedData.length; i++) {
        com.prodigy4440.models2.UnseparatedData un = unseparatedData[i];
        LOG.info("Processing Record : " + un.getSerialNo());
        BusinessDistrict bd = GeneralUtil.computeDistrict(filePath);
        persistOrUpdate2(un, bd, em);
        LOG.info("Done Processing Record : " + un.getSerialNo());
        count++;
        index = i;
        if (count == 1000) {
          processFile.setStatus(ProcessFile.Status.PROCESSING);
          processFile.setCurrentId(i);
          em.merge(processFile);
          break;
        }
      }

      if (index == unseparatedData.length) {
        processFile.setCurrentId(index);
        processFile.setStatus(ProcessFile.Status.PROCESSED);
        em.merge(processFile);
      }
    } catch (FileNotFoundException ex) {
      LOG.info("Error loading file from path, ", ex.getMessage());
    }
  }

  public void persistOrUpdate(UnseparatedData unseparatedData, BusinessDistrict bd, EntityManager em) {
    if (Objects.isNull(unseparatedData.getAccountNo())) {
    } else {
      Customer tmpCustomer = unseparatedData.fetchCustomer();
      tmpCustomer.setBusinessDistrict(bd);
      tmpCustomer.setAccountType(BillingMode.OFFLINE_POSTPAID.name());
      Long count = em.createQuery("SELECT COUNT(c) From Customer c WHERE c.accountNumber = :numb", Long.class).
              setParameter("numb", tmpCustomer.getAccountNumber()).getResultList().get(0);

      if (count == 0) {
        em.persist(unseparatedData.fetchFullCustomer(bd));
      } else {
        Customer customer = em.createQuery("SELECT c From Customer c WHERE c.accountNumber = :numb",
                Customer.class).setParameter("numb", tmpCustomer.getAccountNumber()).getResultList().get(0);
        Billing billing = unseparatedData.fetchBilling();
        customer.getBillings().add(billing);
        billing.setCustomer(customer);
        customer.getBillings().add(billing);
        em.merge(customer);
      }
    }

  }

  public void persistOrUpdate2(com.prodigy4440.models2.UnseparatedData unseparatedData, BusinessDistrict bd,
          EntityManager em) {
    if (Objects.isNull(unseparatedData.getAccountNo())) {
    } else {
      Customer tmpCustomer = unseparatedData.fetchCustomer();
      tmpCustomer.setBusinessDistrict(bd);
      tmpCustomer.setAccountType(BillingMode.OFFLINE_POSTPAID.name());
      Long count = em.createQuery("SELECT COUNT(c) From Customer c WHERE c.accountNumber = :numb", Long.class).
              setParameter("numb", tmpCustomer.getAccountNumber()).getResultList().get(0);

      if (count == 0) {
        em.persist(unseparatedData.fetchFullCustomer(bd));
      } else {
        Customer customer = em.createQuery("SELECT c From Customer c WHERE c.accountNumber = :numb",
                Customer.class).setParameter("numb", tmpCustomer.getAccountNumber()).getResultList().get(0);
        Billing billing = unseparatedData.fetchBilling();
        customer.getBillings().add(billing);
        billing.setCustomer(customer);
        customer.getBillings().add(billing);
        em.merge(customer);
      }
    }

  }

  public void populateJsonPaths() {
    Months months = new Months();
    months.addNewEntry(em);
  }

}
