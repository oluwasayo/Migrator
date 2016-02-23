/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.prodigy4440.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author prodigy4440
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

  private static final long serialVersionUID = -2397306335889597195L;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "customer_id")
  private Long customerId;

  @Column(name = "name")
  private String name;

  @Column(name = "vso_id")
  private String vsoId;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "customer_type")
  @Enumerated(EnumType.STRING)
  private CustomerType customerType;

  @Column(name = "customer_status")
  private String customerStatus;

  @Column(name = "account_number")
  private String accountNumber;

  @Column(name = "email")
  private String email;

  @Column(name = "organization_code")
  private String organizationCode;

  @Column(name = "adc")
  private String adc;

  @Column(name = "address_1")
  private String address1;

  @Column(name = "address_2")
  private String address2;

  @Column(name = "address_3")
  private String address3;

  @Column(name = "customer_cycle")
  private String cycle;

  private String tariff;

  @Column(name = "account_type")
  private String accountType;

  @Column(name = "institution_code")
  private String institutionCode;

  @Column(name = "govt")
  private String govt;

  @Column(name = "kcg")
  private String kcg;

  @Column(name = "meter_number")
  private String meterNumber;

  @Column(name = "meter_status")
  private String meteredStatus;

  @Enumerated(EnumType.STRING)
  @Column(name = "business_district")
  private BusinessDistrict businessDistrict;

  @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
  private List<Billing> billings;

  @OneToOne(cascade = CascadeType.ALL)
  private OldAccountDetail oldAccountDetail;
  
  @Column(name = "created_date")
  @Temporal(TemporalType.TIMESTAMP)
  private Date createdDate;

  public Customer() {
  }

  public Customer(String name, CustomerType customerType, String customerStatus,
          String accountNumber,
          String organizationCode, String adc, String address1, String address2, String address3,
          String cycle, String tariff, String accountType, String institutionCode, String govt, String kcg,
          String meterNumber, String meteredStatus, List<Billing> billings, OldAccountDetail oldAccountDetail) {
    this.name = name;
    this.customerType = customerType;
    this.customerStatus = customerStatus;
    this.accountNumber = accountNumber;
    this.organizationCode = organizationCode;
    this.adc = adc;
    this.address1 = address1;
    this.address2 = address2;
    this.address3 = address3;
    this.cycle = cycle;
    this.tariff = tariff;
    this.accountType = accountType;
    this.institutionCode = institutionCode;
    this.govt = govt;
    this.kcg = kcg;
    this.meterNumber = meterNumber;
    this.meteredStatus = meteredStatus;
    this.billings = billings;
    this.oldAccountDetail = oldAccountDetail;
  }

  public Long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Long customerId) {
    this.customerId = customerId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CustomerType getCustomerType() {
    return customerType;
  }

  public void setCustomerType(CustomerType customerType) {
    this.customerType = customerType;
  }

  public String getCustomerStatus() {
    return customerStatus;
  }

  public void setCustomerStatus(String customerStatus) {
    this.customerStatus = customerStatus;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getOrganizationCode() {
    return organizationCode;
  }

  public void setOrganizationCode(String organizationCode) {
    this.organizationCode = organizationCode;
  }

  public BusinessDistrict getBusinessDistrict() {
    return businessDistrict;
  }

  public void setBusinessDistrict(BusinessDistrict businessDistrict) {
    this.businessDistrict = businessDistrict;
  }

  public String getAdc() {
    return adc;
  }

  public void setAdc(String adc) {
    this.adc = adc;
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

  public String getCycle() {
    return cycle;
  }

  public void setCycle(String cycle) {
    this.cycle = cycle;
  }

  public String getTariff() {
    return tariff;
  }

  public void setTariff(String tariff) {
    this.tariff = tariff;
  }

  public String getAccountType() {
    return accountType;
  }

  public void setAccountType(String accountType) {
    this.accountType = accountType;
  }

  public String getInstitutionCode() {
    return institutionCode;
  }

  public void setInstitutionCode(String institutionCode) {
    this.institutionCode = institutionCode;
  }

  public String getGovt() {
    return govt;
  }

  public void setGovt(String govt) {
    this.govt = govt;
  }

  public String getKcg() {
    return kcg;
  }

  public void setKcg(String kcg) {
    this.kcg = kcg;
  }

  public String getMeterNumber() {
    return meterNumber;
  }

  public void setMeterNumber(String meterNumber) {
    this.meterNumber = meterNumber;
  }

  public String getMeteredStatus() {
    return meteredStatus;
  }

  public void setMeteredStatus(String meteredStatus) {
    this.meteredStatus = meteredStatus;
  }

  public List<Billing> getBillings() {
    return billings;
  }

  public void setBillings(List<Billing> billings) {
    this.billings = billings;
  }

  public OldAccountDetail getOldAccountDetail() {
    return oldAccountDetail;
  }

  public void setOldAccountDetail(OldAccountDetail oldAccountDetail) {
    this.oldAccountDetail = oldAccountDetail;
  }

  public String getVsoId() {
    return vsoId;
  }

  public void setVsoId(String vsoId) {
    this.vsoId = vsoId;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public int hashCode() {
    int hash = 7;
    hash = 89 * hash + Objects.hashCode(this.customerId);
    hash = 89 * hash + Objects.hashCode(this.name);
    hash = 89 * hash + Objects.hashCode(this.customerType);
    hash = 89 * hash + Objects.hashCode(this.customerStatus);
    hash = 89 * hash + Objects.hashCode(this.accountNumber);
    hash = 89 * hash + Objects.hashCode(this.organizationCode);
    hash = 89 * hash + Objects.hashCode(this.adc);
    hash = 89 * hash + Objects.hashCode(this.address1);
    hash = 89 * hash + Objects.hashCode(this.address2);
    hash = 89 * hash + Objects.hashCode(this.address3);
    hash = 89 * hash + Objects.hashCode(this.cycle);
    hash = 89 * hash + Objects.hashCode(this.tariff);
    hash = 89 * hash + Objects.hashCode(this.accountType);
    hash = 89 * hash + Objects.hashCode(this.institutionCode);
    hash = 89 * hash + Objects.hashCode(this.govt);
    hash = 89 * hash + Objects.hashCode(this.kcg);
    hash = 89 * hash + Objects.hashCode(this.meterNumber);
    hash = 89 * hash + Objects.hashCode(this.meteredStatus);
    hash = 89 * hash + Objects.hashCode(this.billings);
    hash = 89 * hash + Objects.hashCode(this.oldAccountDetail);
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
    final Customer other = (Customer) obj;
    if (!Objects.equals(this.name, other.name)) {
      return false;
    }
    if (!Objects.equals(this.customerType, other.customerType)) {
      return false;
    }
    if (!Objects.equals(this.customerStatus, other.customerStatus)) {
      return false;
    }
    if (!Objects.equals(this.accountNumber, other.accountNumber)) {
      return false;
    }
    if (!Objects.equals(this.organizationCode, other.organizationCode)) {
      return false;
    }
    if (!Objects.equals(this.adc, other.adc)) {
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
    if (!Objects.equals(this.cycle, other.cycle)) {
      return false;
    }
    if (!Objects.equals(this.tariff, other.tariff)) {
      return false;
    }
    if (!Objects.equals(this.accountType, other.accountType)) {
      return false;
    }
    if (!Objects.equals(this.institutionCode, other.institutionCode)) {
      return false;
    }
    if (!Objects.equals(this.govt, other.govt)) {
      return false;
    }
    if (!Objects.equals(this.kcg, other.kcg)) {
      return false;
    }
    if (!Objects.equals(this.meterNumber, other.meterNumber)) {
      return false;
    }
    if (!Objects.equals(this.meteredStatus, other.meteredStatus)) {
      return false;
    }
    if (!Objects.equals(this.customerId, other.customerId)) {
      return false;
    }
    if (!Objects.equals(this.billings, other.billings)) {
      return false;
    }
    if (!Objects.equals(this.oldAccountDetail, other.oldAccountDetail)) {
      return false;
    }
    return true;
  }

  @Override
  public String toString() {
    return "Customer = " + customerId;
  }
}
