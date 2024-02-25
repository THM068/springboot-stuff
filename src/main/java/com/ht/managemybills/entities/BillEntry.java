package com.ht.managemybills.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class BillEntry {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public LocalDate getPurchaseDate() {
    return purchaseDate;
  }

  public void setPurchaseDate(LocalDate purchaseDate) {
    this.purchaseDate = purchaseDate;
  }

  public MonthBill getMonthBill() {
    return monthBill;
  }

  public void setMonthBill(MonthBill monthBill) {
    this.monthBill = monthBill;
  }

  private String description;
  private BigDecimal amount;

  private LocalDate purchaseDate;

  public BillEntry() {
  }

  public BillEntry(String description, BigDecimal amount, LocalDate purchaseDate) {
    this.description = description;
    this.amount = amount;
    this.purchaseDate = purchaseDate;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @ManyToOne
  @JoinColumn(name = "month_bill")
  private MonthBill monthBill;

  public Long getId() {
    return id;
  }
}
