package com.ht.managemybills.entities;

import com.ht.managemybills.entities.utils.YearAttributeConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

@Entity
@Table(name = "month_bill")
public class MonthBill {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(
      name = "bill_year",
      columnDefinition = "smallint"
  )
  @Convert(
      converter = YearAttributeConverter.class
  )
  private Year billYear;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Month getBillMonth() {
    return billMonth;
  }

  public void setBillMonth(Month billMonth) {
    this.billMonth = billMonth;
  }

  private String name;

  public Year getBillYear() {
    return billYear;
  }

  public void setBillYear(Year billYear) {
    this.billYear = billYear;
  }

  @Column(
      name = "bill_month",
      columnDefinition = "smallint"
  )
  @Enumerated
  private Month billMonth;

  public void setId(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public MonthBill() {
  }

  public MonthBill(String name, Year billYear, Month billMonth) {
    this.name = name;
    this.billYear = billYear;
    this.billMonth = billMonth;
  }
}
