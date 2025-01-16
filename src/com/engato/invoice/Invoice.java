package com.engeto.invoice;

/**
 * Class for operation with invoices
 * Author: Tomáš Kaplan
 * Date: 2025-01-16
 */

import java.math.BigDecimal;
import java.time.LocalDate;


public class Invoice {

    private int invoiceNumber = 20250001;
    private String customerName;
    private LocalDate invoiceDate = LocalDate.now();
    private BigDecimal totalAmount = new BigDecimal("1250.00");
    private double packageWeight = 25.5;

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }
}
