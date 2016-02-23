/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.prodigy4440.models.UnseparatedData;
import com.prodigy4440.entities.Billing;
import com.prodigy4440.entities.Customer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author prodigy4440
 */
public class Migrator {
//
//  /**
//   * @param args the command line arguments
//   */
//  public static void main(String[] args) throws IOException {
//    String tmp_april = "/home/prodigy4440/Desktop/raw/jsons/tmp_april";
//    String april = "/home/prodigy4440/Desktop/raw/jsons/APRIL_2015";
//    String august = "/home/prodigy4440/Desktop/raw/jsons/AUGUST_2015";
//    String february = "/home/prodigy4440/Desktop/raw/jsons/FEBRUARY_2015";
//    String july = "/home/prodigy4440/Desktop/raw/jsons/JULY_2015";
//    String june = "/home/prodigy4440/Desktop/raw/jsons/JUNE_2015";
//    String march = "/home/prodigy4440/Desktop/raw/jsons/MARCH_2015";
//    String may = "/home/prodigy4440/Desktop/raw/jsons/MAY_2015";
//    String november = "/home/prodigy4440/Desktop/raw/jsons/NOVEMBER_2015";
//    String october = "/home/prodigy4440/Desktop/raw/jsons/OCTOBER_2015";
//    String september = "/home/prodigy4440/Desktop/raw/jsons/SEPTEMBER_2015";
//    loadJsonDir(tmp_april);
////    loadJsonDir(august);
////    loadJsonDir(february);
////    loadJsonDir(july);
////    loadJsonDir(june);
////    loadJsonDir(march);
////    loadJsonDir(may);
////    loadJsonDir(november);
////    loadJsonDir(october);
////    loadJsonDir(september);
//  }
//
//  public static void loadJsonDir(String rootPath) throws IOException {
//    Path folder = Paths.get(rootPath);
//    DirectoryStream<Path> filesDir = Files.newDirectoryStream(folder);
//    Iterator<Path> iterator = filesDir.iterator();
//    ExecutorService executor = Executors.newCachedThreadPool();
//
//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("MigratorPU");
//
//    while (iterator.hasNext()) {
//      Path jSonFilePath = iterator.next();
//      JsonReader jsonReader = new JsonReader(new BufferedReader(new FileReader(jSonFilePath.toFile())));
//      Gson gson = new Gson();
//      UnseparatedData unseparatedData [] = gson.fromJson(jsonReader, UnseparatedData[].class);
//      List<UnseparatedData[]> splitToSubArrays = splitToLighterArray(unseparatedData,250);
//      for (int i = 0; i < splitToSubArrays.size(); i++) {
//        final UnseparatedData[] smallArray = splitToSubArrays.get(i);
//        EntityManager em = emf.createEntityManager();
//        em.getTransaction().begin();
//        executor.execute(new Runnable() {
//          @Override
//          public void run() {
//
//            for (int j = 0; j < smallArray.length; j++) {
//              UnseparatedData unseparatedData = smallArray[j];
//              System.out.println("Processing Record : " + j);
//              persistOrUpdate(unseparatedData, em);
//              System.out.println("Done Processing Record : " + j);
//            }
//          }
//        });
//        em.getTransaction().commit();
//      }
//
//    }
//  }
//
//  public static void persistOrUpdate(UnseparatedData unseparatedData, EntityManager em) {
//    if (Objects.isNull(unseparatedData.getAccountNo())) {
//    } else {
//      Customer tmpCustomer = unseparatedData.fetchCustomer();
//      Long count = em.createQuery("SELECT COUNT(c) From Customer c WHERE c.accountNumber = :numb", Long.class).
//              setParameter("numb", tmpCustomer.getAccountNumber()).getResultList().get(0);
//    
//      if (count == 0) {
//        em.persist(unseparatedData.fetchFullCustomer());
//      } else {
//        Customer customer = em.createQuery("SELECT c From Customer c WHERE c.accountNumber = :numb",
//                Customer.class).setParameter("numb", tmpCustomer.getAccountNumber()).getResultList().get(0);
//        Billing billing = unseparatedData.fetchBilling();
//        customer.getBillings().add(billing);
//        billing.setCustomer(customer);
//        customer.getBillings().add(billing);
//        em.merge(customer);
//      }
////      if (em.getTransaction().isActive()) {
////        em.getTransaction().commit();
////      }
//    }
//
//  }
//
//  private static List<UnseparatedData[]> splitToLighterArray(UnseparatedData[] originalArray, int chunkSize) {
//    List<UnseparatedData[]> result = new ArrayList<>();
//    int totalSize = originalArray.length;
//    if (totalSize < chunkSize) {
//      chunkSize = totalSize;
//    }
//    int from = 0;
//    int to = chunkSize;
//
//    while (from < totalSize) {
//      UnseparatedData[] partArray = Arrays.copyOfRange(originalArray, from, to);
//      result.add(partArray);
//      from += chunkSize;
//      to = from + chunkSize;
//      if (to > totalSize) {
//        to = totalSize;
//      }
//    }
//    return result;
//  }
//
//  public static void deleteNonJson(String root) throws IOException {
//    DirectoryStream<Path> rootDir = Files.newDirectoryStream(Paths.get(root));
//    Iterator<Path> iterator = rootDir.iterator();
//    while (iterator.hasNext()) {
//      Path dirPath = iterator.next();
//      DirectoryStream<Path> dir = Files.newDirectoryStream(dirPath);
//      Iterator<Path> innerIterator = dir.iterator();
//      while (innerIterator.hasNext()) {
//        Path filePath = innerIterator.next();
//        String name = filePath.toFile().getName();
//        if (name.endsWith(".json")) {
//
//        } else {
//          Files.delete(filePath);
//        }
//      }
//    }
//  }

}
