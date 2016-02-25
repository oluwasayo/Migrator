/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.models2;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.prodigy4440.entities.Billing;
import com.prodigy4440.entities.BillingMode;
import com.prodigy4440.entities.BusinessDistrict;
import com.prodigy4440.entities.Customer;
import com.prodigy4440.entities.CustomerType;
import com.prodigy4440.entities.OldAccountDetail;
import com.prodigy4440.utils.GeneralUtil;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author prodigy4440
 */
public class UnseparatedData {
  
  @SerializedName("S/N")
  String serialNo;
  @SerializedName("Account")
  String accountNo;
  @SerializedName("Name")
  String name;
  @SerializedName("Address")
  String address1;
  @SerializedName("Address2")
  String address2;
  @SerializedName("Address3")
  String address3;
  @SerializedName("Meter")
  String meterNo;
  @SerializedName("ADC")
  String adc;
  @SerializedName("No Dials")
  String noDials;
  @SerializedName("Tariff")
  String tariff;
  @SerializedName("PresReadDate")
  String presentReadDate;
  @SerializedName("Pres Reading")
  String presentReading;
  @SerializedName("PrevReading")
  String previousReading;
  @SerializedName("LAR")
  String lar;
  @SerializedName("Multiplier")
  String multiplier;
  @SerializedName("Consumption")
  String consumption;
  @SerializedName("PresReadCode")
  String presentReadCode;
  @SerializedName("EnergyCharge")
  String energyCharge;
  @SerializedName("TotalCHarge")
  String totalCharge;
  @SerializedName("VAT")
  String vat;
  @SerializedName("KVARate")
  String kvaRate;
  @SerializedName("KVARead Date")
  String kvaReadDate;
  @SerializedName("KVAMultiplier")
  String kvaMultiplier;
  @SerializedName("KVAConsumption")
  String kvaConsumption;
  @SerializedName("KVARead Code")
  String kvaReadCode;
  @SerializedName("KVADemand Charge")
  String kvaDemandCharge;
  @SerializedName("No Estimate")
  String noEstimate;
  @SerializedName("LARDate")
  String larDate;
  @SerializedName("MMC")
  String mmc;
  @SerializedName("FC")
  String fc;
  @SerializedName("Cycle")
  String cycle;
  @SerializedName("PrevBalance")
  String previousBalance;
  @SerializedName("ClosingBalance")
  String closingBalance;
  @SerializedName("Payment")
  String payment;
  @SerializedName("Adjustment")
  String adjustment;
  @SerializedName("OldAccount")
  String oldAccountNo;
  @SerializedName("Metered Status")
  String meteredStatus;
  @SerializedName("LastPayment")
  String lastPayment;
  @SerializedName("LastDate")
  String lastDate;
  @SerializedName("Fixed")
  String fixed;
  @SerializedName("Status")
  String customerStatus;
  @SerializedName("Govt")
  String govt;
  @SerializedName("institution Code")
  String institutionCode;
  @SerializedName("Organisation Code")
  String organisationCode;

  public UnseparatedData() {
  }

  public String getSerialNo() {
    return serialNo;
  }

  public void setSerialNo(String serialNo) {
    this.serialNo = serialNo;
  }

  public String getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress1() {
    return address1;
  }

  public void setAddress1(String address1) {
    this.address1 = address1;
  }

  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }

  public String getAddress3() {
    return address3;
  }

  public void setAddress3(String address3) {
    this.address3 = address3;
  }

  public String getMeterNo() {
    return meterNo;
  }

  public void setMeterNo(String meterNo) {
    this.meterNo = meterNo;
  }

  public String getAdc() {
    return adc;
  }

  public void setAdc(String adc) {
    this.adc = adc;
  }

  public String getNoDials() {
    return noDials;
  }

  public void setNoDials(String noDials) {
    this.noDials = noDials;
  }

  public String getTariff() {
    return tariff;
  }

  public void setTariff(String tariff) {
    this.tariff = tariff;
  }

  public String getPresentReadDate() {
    return presentReadDate;
  }

  public void setPresentReadDate(String presentReadDate) {
    this.presentReadDate = presentReadDate;
  }

  public String getPresentReading() {
    return presentReading;
  }

  public void setPresentReading(String presentReading) {
    this.presentReading = presentReading;
  }

  public String getPreviousReading() {
    return previousReading;
  }

  public void setPreviousReading(String previousReading) {
    this.previousReading = previousReading;
  }

  public String getLar() {
    return lar;
  }

  public void setLar(String lar) {
    this.lar = lar;
  }

  public String getMultiplier() {
    return multiplier;
  }

  public void setMultiplier(String multiplier) {
    this.multiplier = multiplier;
  }

  public String getConsumption() {
    return consumption;
  }

  public void setConsumption(String consumption) {
    this.consumption = consumption;
  }

  public String getPresentReadCode() {
    return presentReadCode;
  }

  public void setPresentReadCode(String presentReadCode) {
    this.presentReadCode = presentReadCode;
  }

  public String getEnergyCharge() {
    return energyCharge;
  }

  public void setEnergyCharge(String energyCharge) {
    this.energyCharge = energyCharge;
  }

  public String getTotalCharge() {
    return totalCharge;
  }

  public void setTotalCharge(String totalCharge) {
    this.totalCharge = totalCharge;
  }

  public String getVat() {
    return vat;
  }

  public void setVat(String vat) {
    this.vat = vat;
  }

  public String getKvaRate() {
    return kvaRate;
  }

  public void setKvaRate(String kvaRate) {
    this.kvaRate = kvaRate;
  }

  public String getKvaReadDate() {
    return kvaReadDate;
  }

  public void setKvaReadDate(String kvaReadDate) {
    this.kvaReadDate = kvaReadDate;
  }

  public String getKvaMultiplier() {
    return kvaMultiplier;
  }

  public void setKvaMultiplier(String kvaMultiplier) {
    this.kvaMultiplier = kvaMultiplier;
  }

  public String getKvaConsumption() {
    return kvaConsumption;
  }

  public void setKvaConsumption(String kvaConsumption) {
    this.kvaConsumption = kvaConsumption;
  }

  public String getKvaReadCode() {
    return kvaReadCode;
  }

  public void setKvaReadCode(String kvaReadCode) {
    this.kvaReadCode = kvaReadCode;
  }

  public String getKvaDemandCharge() {
    return kvaDemandCharge;
  }

  public void setKvaDemandCharge(String kvaDemandCharge) {
    this.kvaDemandCharge = kvaDemandCharge;
  }

  public String getNoEstimate() {
    return noEstimate;
  }

  public void setNoEstimate(String noEstimate) {
    this.noEstimate = noEstimate;
  }

  public String getLarDate() {
    return larDate;
  }

  public void setLarDate(String larDate) {
    this.larDate = larDate;
  }

  public String getMmc() {
    return mmc;
  }

  public void setMmc(String mmc) {
    this.mmc = mmc;
  }

  public String getFc() {
    return fc;
  }

  public void setFc(String fc) {
    this.fc = fc;
  }

  public String getCycle() {
    return cycle;
  }

  public void setCycle(String cycle) {
    this.cycle = cycle;
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

  public String getPayment() {
    return payment;
  }

  public void setPayment(String payment) {
    this.payment = payment;
  }

  public String getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(String adjustment) {
    this.adjustment = adjustment;
  }

  public String getOldAccountNo() {
    return oldAccountNo;
  }

  public void setOldAccountNo(String oldAccountNo) {
    this.oldAccountNo = oldAccountNo;
  }

  public String getMeteredStatus() {
    return meteredStatus;
  }

  public void setMeteredStatus(String meteredStatus) {
    this.meteredStatus = meteredStatus;
  }

  public String getLastPayment() {
    return lastPayment;
  }

  public void setLastPayment(String lastPayment) {
    this.lastPayment = lastPayment;
  }

  public String getLastDate() {
    return lastDate;
  }

  public void setLastDate(String lastDate) {
    this.lastDate = lastDate;
  }

  public String getFixed() {
    return fixed;
  }

  public void setFixed(String fixed) {
    this.fixed = fixed;
  }

  public String getCustomerStatus() {
    return customerStatus;
  }

  public void setCustomerStatus(String customerStatus) {
    this.customerStatus = customerStatus;
  }

  public String getGovt() {
    return govt;
  }

  public void setGovt(String govt) {
    this.govt = govt;
  }

  public String getInstitutionCode() {
    return institutionCode;
  }

  public void setInstitutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
  }

  public String getOrganisationCode() {
    return organisationCode;
  }

  public void setOrganisationCode(String organisationCode) {
    this.organisationCode = organisationCode;
  }

  @Override
  public int hashCode() {
    int hash = 3;
    hash = 71 * hash + Objects.hashCode(this.serialNo);
    hash = 71 * hash + Objects.hashCode(this.accountNo);
    hash = 71 * hash + Objects.hashCode(this.name);
    hash = 71 * hash + Objects.hashCode(this.address1);
    hash = 71 * hash + Objects.hashCode(this.address2);
    hash = 71 * hash + Objects.hashCode(this.address3);
    hash = 71 * hash + Objects.hashCode(this.meterNo);
    hash = 71 * hash + Objects.hashCode(this.adc);
    hash = 71 * hash + Objects.hashCode(this.noDials);
    hash = 71 * hash + Objects.hashCode(this.tariff);
    hash = 71 * hash + Objects.hashCode(this.presentReadDate);
    hash = 71 * hash + Objects.hashCode(this.presentReading);
    hash = 71 * hash + Objects.hashCode(this.previousReading);
    hash = 71 * hash + Objects.hashCode(this.lar);
    hash = 71 * hash + Objects.hashCode(this.multiplier);
    hash = 71 * hash + Objects.hashCode(this.consumption);
    hash = 71 * hash + Objects.hashCode(this.presentReadCode);
    hash = 71 * hash + Objects.hashCode(this.energyCharge);
    hash = 71 * hash + Objects.hashCode(this.totalCharge);
    hash = 71 * hash + Objects.hashCode(this.vat);
    hash = 71 * hash + Objects.hashCode(this.kvaRate);
    hash = 71 * hash + Objects.hashCode(this.kvaReadDate);
    hash = 71 * hash + Objects.hashCode(this.kvaMultiplier);
    hash = 71 * hash + Objects.hashCode(this.kvaConsumption);
    hash = 71 * hash + Objects.hashCode(this.kvaReadCode);
    hash = 71 * hash + Objects.hashCode(this.kvaDemandCharge);
    hash = 71 * hash + Objects.hashCode(this.noEstimate);
    hash = 71 * hash + Objects.hashCode(this.larDate);
    hash = 71 * hash + Objects.hashCode(this.mmc);
    hash = 71 * hash + Objects.hashCode(this.fc);
    hash = 71 * hash + Objects.hashCode(this.cycle);
    hash = 71 * hash + Objects.hashCode(this.previousBalance);
    hash = 71 * hash + Objects.hashCode(this.closingBalance);
    hash = 71 * hash + Objects.hashCode(this.payment);
    hash = 71 * hash + Objects.hashCode(this.adjustment);
    hash = 71 * hash + Objects.hashCode(this.oldAccountNo);
    hash = 71 * hash + Objects.hashCode(this.meteredStatus);
    hash = 71 * hash + Objects.hashCode(this.lastPayment);
    hash = 71 * hash + Objects.hashCode(this.lastDate);
    hash = 71 * hash + Objects.hashCode(this.fixed);
    hash = 71 * hash + Objects.hashCode(this.customerStatus);
    hash = 71 * hash + Objects.hashCode(this.govt);
    hash = 71 * hash + Objects.hashCode(this.institutionCode);
    hash = 71 * hash + Objects.hashCode(this.organisationCode);
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
    final UnseparatedData other = (UnseparatedData) obj;
    if (!Objects.equals(this.serialNo, other.serialNo)) {
      return false;
    }
    if (!Objects.equals(this.accountNo, other.accountNo)) {
      return false;
    }
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.address1, other.address1)) {
      return false;
    }
    if (!Objects.equals(this.address2, other.address2)) {
      return false;
    }
    if (!Objects.equals(this.address3, other.address3)) {
      return false;
    }
    if (!Objects.equals(this.meterNo, other.meterNo)) {
      return false;
    }
    if (!Objects.equals(this.adc, other.adc)) {
      return false;
    }
    if (!Objects.equals(this.noDials, other.noDials)) {
      return false;
    }
    if (!Objects.equals(this.tariff, other.tariff)) {
      return false;
    }
    if (!Objects.equals(this.presentReadDate, other.presentReadDate)) {
      return false;
    }
    if (!Objects.equals(this.presentReading, other.presentReading)) {
      return false;
    }
    if (!Objects.equals(this.previousReading, other.previousReading)) {
      return false;
    }
    if (!Objects.equals(this.lar, other.lar)) {
      return false;
    }
    if (!Objects.equals(this.multiplier, other.multiplier)) {
      return false;
    }
    if (!Objects.equals(this.consumption, other.consumption)) {
      return false;
    }
    if (!Objects.equals(this.presentReadCode, other.presentReadCode)) {
      return false;
    }
    if (!Objects.equals(this.energyCharge, other.energyCharge)) {
      return false;
    }
    if (!Objects.equals(this.totalCharge, other.totalCharge)) {
      return false;
    }
    if (!Objects.equals(this.vat, other.vat)) {
      return false;
    }
    if (!Objects.equals(this.kvaRate, other.kvaRate)) {
      return false;
    }
    if (!Objects.equals(this.kvaReadDate, other.kvaReadDate)) {
      return false;
    }
    if (!Objects.equals(this.kvaMultiplier, other.kvaMultiplier)) {
      return false;
    }
    if (!Objects.equals(this.kvaConsumption, other.kvaConsumption)) {
      return false;
    }
    if (!Objects.equals(this.kvaReadCode, other.kvaReadCode)) {
      return false;
    }
    if (!Objects.equals(this.kvaDemandCharge, other.kvaDemandCharge)) {
      return false;
    }
    if (!Objects.equals(this.noEstimate, other.noEstimate)) {
      return false;
    }
    if (!Objects.equals(this.larDate, other.larDate)) {
      return false;
    }
    if (!Objects.equals(this.mmc, other.mmc)) {
      return false;
    }
    if (!Objects.equals(this.fc, other.fc)) {
      return false;
    }
    if (!Objects.equals(this.cycle, other.cycle)) {
      return false;
    }
    if (!Objects.equals(this.previousBalance, other.previousBalance)) {
      return false;
    }
    if (!Objects.equals(this.closingBalance, other.closingBalance)) {
      return false;
    }
    if (!Objects.equals(this.payment, other.payment)) {
      return false;
    }
    if (!Objects.equals(this.adjustment, other.adjustment)) {
      return false;
    }
    if (!Objects.equals(this.oldAccountNo, other.oldAccountNo)) {
      return false;
    }
    if (!Objects.equals(this.meteredStatus, other.meteredStatus)) {
      return false;
    }
    if (!Objects.equals(this.lastPayment, other.lastPayment)) {
      return false;
    }
    if (!Objects.equals(this.lastDate, other.lastDate)) {
      return false;
    }
    if (!Objects.equals(this.fixed, other.fixed)) {
      return false;
    }
    if (!Objects.equals(this.customerStatus, other.customerStatus)) {
      return false;
    }
    if (!Objects.equals(this.govt, other.govt)) {
      return false;
    }
    if (!Objects.equals(this.institutionCode, other.institutionCode)) {
      return false;
    }
    if (!Objects.equals(this.organisationCode, other.organisationCode)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "UnseparatedData{" + "serialNo=" + serialNo + ", accountNo=" + accountNo + '}';
  }

  public Customer fetchCustomer() {
    Customer customer = new Customer();
    if (Objects.nonNull(getAccountNo())) {
      customer.setAccountNumber(getAccountNo().replace("/", ""));

    }

    if (Objects.nonNull(getAdc())) {
      customer.setAdc(getAdc());
    }

    if (Objects.nonNull(getAddress1())) {
      customer.setAddress1(getAddress1());
    }

    if (Objects.nonNull(getAddress2())) {
      customer.setAddress2(getAddress2());
    }

    if (Objects.nonNull(getAddress3())) {
      customer.setAddress3(getAddress3());
    }

    if (Objects.nonNull(getCustomerStatus())) {
      customer.setCustomerStatus(getCustomerStatus());
    }

    if (Objects.nonNull(getTariff())) {
      if (getTariff().startsWith("R")) {
        customer.setCustomerType(CustomerType.RESIDENTIAL);
      } else if (getTariff().startsWith("C")) {
        customer.setCustomerType(CustomerType.COMMERCIAL);
      } else if (getTariff().startsWith("D")) {
        customer.setCustomerType(CustomerType.INDUSTRIAL);
      } else if (getTariff().startsWith("A")) {
        customer.setCustomerType(CustomerType.SPECIAL);
      } else if (getTariff().startsWith("S")) {
        customer.setCustomerType(CustomerType.STREET_LIGHTING);
      }
    }

    if (Objects.nonNull(getCycle())) {
      customer.setCycle(getCycle());
    }

    if (Objects.nonNull(getGovt())) {
      customer.setGovt(getGovt());
    }

    if (Objects.nonNull(getInstitutionCode())) {
      customer.setInstitutionCode(getInstitutionCode());
    }

    if (Objects.nonNull(getMeterNo())) {
      customer.setMeterNumber(getMeterNo());
    }

    if (Objects.nonNull(getMeteredStatus())) {
      customer.setMeteredStatus(getMeteredStatus());
    }

    if (Objects.nonNull(getName())) {
      customer.setName(getName());
    }

    if (Objects.nonNull(getOrganisationCode())) {
      customer.setOrganizationCode(getOrganisationCode());
    }

    if (Objects.nonNull(getTariff())) {
      customer.setTariff(getTariff());
    }
    
    customer.setAccountType(BillingMode.OFFLINE_POSTPAID.name());
    customer.setVsoId("1");

    return customer;
  }

  public Billing fetchBilling() {
    Billing billing = new Billing();

    if (Objects.nonNull(getAccountNo())) {
      billing.setAccountNumber(getAccountNo().replace("/", ""));
    }

    if (Objects.nonNull(getAdjustment())) {
      billing.setAdjustment(getAdjustment());
    }

    billing.setBillingMode(BillingMode.OFFLINE_PREPAID);

    if (Objects.nonNull(getLastDate())) {
      billing.setLastDate(GeneralUtil.parseDate(getLastDate()));
    }

    if (Objects.nonNull(getClosingBalance())) {
      billing.setClosingBalance(getClosingBalance());
    }

    if (Objects.nonNull(getConsumption())) {
      billing.setConsumption(getConsumption());
    }

    if (Objects.nonNull(getCustomerStatus())) {
      billing.setCustomerStatus(getCustomerStatus());
    }

    if (Objects.nonNull(getEnergyCharge())) {
      try {
        billing.setEnergyCharge(Double.parseDouble(getEnergyCharge()));
      } catch (NumberFormatException nfe) {

      }
    }

    if (Objects.nonNull(getFc())) {
      billing.setFc(getFc());
    }

    if (Objects.nonNull(getFixed())) {
      billing.setFixed(getFixed());
    }

    if (Objects.nonNull(getKvaConsumption())) {
      billing.setKvaConsumptions(getKvaConsumption());
    }

    if (Objects.nonNull(getKvaDemandCharge())) {
      billing.setKvaDemandCharge(getKvaDemandCharge());
    }

    if (Objects.nonNull(getMultiplier())) {
      billing.setMultiplier(getMultiplier());
    }

    if (Objects.nonNull(getKvaRate())) {
      billing.setKvaRate(getKvaRate());
    }

    if (Objects.nonNull(getKvaReadCode())) {
      billing.setKvaReadCode(getKvaReadCode());
    }

    if (Objects.nonNull(getKvaReadDate())) {
      billing.setKvaReadDate(GeneralUtil.parseDate(getKvaReadDate()));
    }

    if (Objects.nonNull(getLar())) {
      billing.setLar(getLar());
    }

    if (Objects.nonNull(getLarDate())) {
      billing.setLarDate(GeneralUtil.parseDate(getLarDate()));
    }

    if (Objects.nonNull(getLastDate())) {
      billing.setLastDate(GeneralUtil.parseDate(getLastDate()));
    }

    if (Objects.nonNull(getLastPayment())) {
      billing.setLastPayment(getLastPayment());
    }

    if (Objects.nonNull(getMeteredStatus())) {
      billing.setMeteredStatus(getMeteredStatus());
    }

    if (Objects.nonNull(getMeteredStatus())) {
      billing.setMmc(getMmc());
    }

    if (Objects.nonNull(getMultiplier())) {
      billing.setMultiplier(getMultiplier());
    }
    if (Objects.nonNull(getNoDials())) {
      billing.setNodials(getNoDials());
    }
    if (Objects.nonNull(getPayment())) {
      billing.setPayment(getPayment());
    }
    if (Objects.nonNull(getPresentReadCode())) {
      billing.setPresentReadCode(getPresentReadCode());
    }
    if (Objects.nonNull(getPresentReading())) {
      billing.setPresentReading(getPresentReading());
    }
    if (Objects.nonNull(getPresentReadDate())) {
      billing.setPresentReadingDate(GeneralUtil.parseDate(getPresentReadDate()));
    }
    if (Objects.nonNull(getPreviousBalance())) {
      billing.setPreviousBalance(getPreviousBalance());
    }
    if (Objects.nonNull(getTariff())) {
      billing.setTariff(getTariff());
    }
    if (Objects.nonNull(getTotalCharge())) {
      try {
        billing.setTotalCharge(Double.parseDouble(getTotalCharge()));
      } catch (NumberFormatException nfe) {
      }
    }
    if (Objects.nonNull(getVat())) {
      try {
        billing.setVat(Double.parseDouble(getVat()));
      } catch (NumberFormatException nfe) {

      }
    }
    billing.setCreatedDate(new Date());
    return billing;

  }

  public OldAccountDetail fetchOldAccountDetail() {
    OldAccountDetail oldAccountDetail = new OldAccountDetail();

    if (Objects.nonNull(getOldAccountNo())) {
      oldAccountDetail.setAccountNumber(getOldAccountNo());
    }

    if (Objects.nonNull(getName())) {
      oldAccountDetail.setName(getName());
    }

    return oldAccountDetail;
  }

  public Customer fetchFullCustomer(BusinessDistrict bd){
    Customer customer = fetchCustomer();
    customer.setBusinessDistrict(bd);
    Billing billing = fetchBilling();
    OldAccountDetail oldAccountDetail = fetchOldAccountDetail();
    List<Billing> billings = new LinkedList<>();
    billings.add(billing);
    customer.setBillings(billings);
    billing.setCustomer(customer);
    customer.setOldAccountDetail(oldAccountDetail);
    return customer;
  }
  
//  public static void main(String[] args) throws FileNotFoundException {
//    JsonReader reader = new JsonReader(new FileReader(new File("/home/prodigy4440/Desktop/raw/mixed/DECEMBER_2015/AGBARA.json")));
//    Gson gson = new Gson();
//    UnseparatedData[] fromJson = gson.fromJson(reader, UnseparatedData[].class);
//    for (UnseparatedData unseparatedData : fromJson) {
//      System.out.println(unseparatedData.meterNo);
//      System.out.println("----------------------------------------------------------------");
//    }
//  }
}
