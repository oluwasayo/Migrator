/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author prodigy4440
 */
@Entity
@Table(name = "billing")
public class Billing implements Serializable {

  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "billing_id")
  private Long billingId;

  @Temporal(javax.persistence.TemporalType.DATE)
  @Column(name = "billing_date")
  private Date billingDate;

  @Column(name = "billing_mode")
  @Enumerated(EnumType.STRING)
  private BillingMode billingMode;
  
  @Column(name = "account_number")
  private String accountNumber;

  @Column(name = "present_reading")
  private String presentReading;

  @Temporal(javax.persistence.TemporalType.DATE)
  @Column(name = "present_reading_date")
  private Date presentReadingDate;

  @Column(name = "present_code")
  private String presentReadCode;

  @Column(name = "previous_balance")
  private String previousBalance;

  @Column(name = "closing_balance")
  private String closingBalance;

  @Column(name = "customer_status")
  private String customerStatus;

  @Column(name = "consumption")
  private String consumption;

  @Column(name = "energy_charge")
  private Double energyCharge;

  @Column(name = "fc")
  private String fc;

  @Column(name = "fixed")
  private String fixed;

  @Column(name = "kva_consumptions")
  private String kvaConsumptions;

  @Column(name = "kva_demand_chage")
  private String kvaDemandCharge;

  @Column(name = "kva_multiplier")
  private String kvaMultiplier;

  @Column(name = "kva_rate")
  private String kvaRate;

  @Column(name = "lar")
  private String lar;
  
  private String payment;
  
  @Column(name = "vat")
  private Double vat;
  
  @Column(name = "adjustment")
  private String adjustment;
  
  @Temporal(TemporalType.DATE)
  @Column(name = "kva_read_date")
  private Date kvaReadDate;
  
  @Column(name = "kva_read_code")
  private String kvaReadCode;

  @Column(name = "lar_date")
  @Temporal(TemporalType.DATE)
  private Date larDate;

  @Column(name = "last_date")
  @Temporal(TemporalType.DATE)
  private Date lastDate;

  @Column(name = "last_payment")
  private String lastPayment;

  @Column(name = "metered_status")
  private String meteredStatus;

  @Column(name = "mmc")
  private String mmc;

  @Column(name = "multiplier")
  private String multiplier;

  @Column(name = "nodials")
  private String nodials;

  @Column(name = "no_estimates")
  private String noEstimates;

  @Column(name = "status_code")
  private String statusCode;

  @Column(name = "tariff")
  private String tariff;
  
  @Column(name = "total_charge")
  private Double totalCharge;

  @ManyToOne
  @JoinColumn(name = "customer_id")
  private Customer customer;
  
  @Column(name = "created_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  public Billing() {
  }

  public Long getBillingId() {
    return billingId;
  }

  public void setBillingId(Long billingId) {
    this.billingId = billingId;
  }

  public Date getBilllingDate() {
    return billingDate;
  }

  public void setBilllingDate(Date billlingDate) {
    this.billingDate = billlingDate;
  }

  public BillingMode getBillingMode() {
    return billingMode;
  }

  public void setBillingMode(BillingMode billingMode) {
    this.billingMode = billingMode;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getPresentReading() {
    return presentReading;
  }

  public void setPresentReading(String presentReading) {
    this.presentReading = presentReading;
  }

  public Date getPresentReadingDate() {
    return presentReadingDate;
  }

  public void setPresentReadingDate(Date presentReadingDate) {
    this.presentReadingDate = presentReadingDate;
  }

  public Double getTotalCharge() {
    return totalCharge;
  }

  public void setTotalCharge(Double totalCharge) {
    this.totalCharge = totalCharge;
  }
  
  

  public String getPresentReadCode() {
    return presentReadCode;
  }

  public void setPresentReadCode(String presentReadCode) {
    this.presentReadCode = presentReadCode;
  }

  public String getPreviousBalance() {
    return previousBalance;
  }

  public void setPreviousBalance(String previousBalance) {
    this.previousBalance = previousBalance;
  }

  public String getClosingBalance() {
    return closingBalance;
  }

  public void setClosingBalance(String closingBalance) {
    this.closingBalance = closingBalance;
  }

  public String getCustomerStatus() {
    return customerStatus;
  }

  public void setCustomerStatus(String customerStatus) {
    this.customerStatus = customerStatus;
  }

  public String getConsumption() {
    return consumption;
  }

  public void setConsumption(String consumption) {
    this.consumption = consumption;
  }

  public Double getEnergyCharge() {
    return energyCharge;
  }

  public void setEnergyCharge(Double energyCharge) {
    this.energyCharge = energyCharge;
  }

  public String getFc() {
    return fc;
  }

  public void setFc(String fc) {
    this.fc = fc;
  }

  public String getFixed() {
    return fixed;
  }

  public void setFixed(String fixed) {
    this.fixed = fixed;
  }

  public String getKvaConsumptions() {
    return kvaConsumptions;
  }

  public void setKvaConsumptions(String kvaConsumptions) {
    this.kvaConsumptions = kvaConsumptions;
  }

  public String getKvaDemandCharge() {
    return kvaDemandCharge;
  }

  public void setKvaDemandCharge(String kvaDemandCharge) {
    this.kvaDemandCharge = kvaDemandCharge;
  }

  public String getKvaMultiplier() {
    return kvaMultiplier;
  }

  public void setKvaMultiplier(String kvaMultiplier) {
    this.kvaMultiplier = kvaMultiplier;
  }

  public String getKvaRate() {
    return kvaRate;
  }

  public void setKvaRate(String kvaRate) {
    this.kvaRate = kvaRate;
  }

  public String getLar() {
    return lar;
  }

  public void setLar(String lar) {
    this.lar = lar;
  }

  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  public Double getVat() {
    return vat;
  }

  public void setVat(Double vat) {
    this.vat = vat;
  }

  public String getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(String adjustment) {
    this.adjustment = adjustment;
  }

  public Date getKvaReadDate() {
    return kvaReadDate;
  }

  public void setKvaReadDate(Date kvaReadDate) {
    this.kvaReadDate = kvaReadDate;
  }

  public String getKvaReadCode() {
    return kvaReadCode;
  }

  public void setKvaReadCode(String kvaReadCode) {
    this.kvaReadCode = kvaReadCode;
  }

  public Date getLarDate() {
    return larDate;
  }

  public void setLarDate(Date larDate) {
    this.larDate = larDate;
  }

  public Date getLastDate() {
    return lastDate;
  }

  public void setLastDate(Date lastDate) {
    this.lastDate = lastDate;
  }

  public String getLastPayment() {
    return lastPayment;
  }

  public void setLastPayment(String lastPayment) {
    this.lastPayment = lastPayment;
  }

  public String getMeteredStatus() {
    return meteredStatus;
  }

  public void setMeteredStatus(String meteredStatus) {
    this.meteredStatus = meteredStatus;
  }

  public String getMmc() {
    return mmc;
  }

  public void setMmc(String mmc) {
    this.mmc = mmc;
  }

  public String getMultiplier() {
    return multiplier;
  }

  public void setMultiplier(String multiplier) {
    this.multiplier = multiplier;
  }

  public String getNodials() {
    return nodials;
  }

  public void setNodials(String nodials) {
    this.nodials = nodials;
  }

  public String getNoEstimates() {
    return noEstimates;
  }

  public void setNoEstimates(String noEstimates) {
    this.noEstimates = noEstimates;
  }

  public String getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }

  public String getTariff() {
    return tariff;
  }

  public void setTariff(String tariff) {
    this.tariff = tariff;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Date getBillingDate() {
    return billingDate;
  }

  public void setBillingDate(Date billingDate) {
    this.billingDate = billingDate;
  }

  public Date getCreatedDate() {
    return createdDate;
  }

  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 67 * hash + Objects.hashCode(this.billingDate);
    hash = 67 * hash + Objects.hashCode(this.accountNumber);
    hash = 67 * hash + Objects.hashCode(this.presentReadCode);
    hash = 67 * hash + Objects.hashCode(this.consumption);
    hash = 67 * hash + Objects.hashCode(this.fc);
    hash = 67 * hash + Objects.hashCode(this.fixed);
    hash = 67 * hash + Objects.hashCode(this.kvaRate);
    hash = 67 * hash + Objects.hashCode(this.larDate);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Billing other = (Billing) obj;
    if (!Objects.equals(this.billingMode, other.billingMode)) {
      return false;
    }
    if (!Objects.equals(this.accountNumber, other.accountNumber)) {
      return false;
    }
    if (!Objects.equals(this.presentReadCode, other.presentReadCode)) {
      return false;
    }
    if (!Objects.equals(this.consumption, other.consumption)) {
      return false;
    }
    if (!Objects.equals(this.kvaDemandCharge, other.kvaDemandCharge)) {
      return false;
    }
    if (!Objects.equals(this.lar, other.lar)) {
      return false;
    }
    if (!Objects.equals(this.noEstimates, other.noEstimates)) {
      return false;
    }
    if (!Objects.equals(this.billingId, other.billingId)) {
      return false;
    }
    if (!Objects.equals(this.billingDate, other.billingDate)) {
      return false;
    }
    if (!Objects.equals(this.presentReading, other.presentReading)) {
      return false;
    }
    return true;
  }

  
  @Override
  public String toString() {
    return "Billing = " + billingId;
  }
  
}
