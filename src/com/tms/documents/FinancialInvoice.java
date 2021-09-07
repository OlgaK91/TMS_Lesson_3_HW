package com.tms.documents;

import java.util.Date;

public class FinancialInvoice extends Contract {

    private String departmentCode;
    private double totalAmount;

    public FinancialInvoice() {
        this.totalAmount = 0.0;
        this.departmentCode = "";
        this.documentDate = new Date();
        this.documentNumber = "";
    }

    public FinancialInvoice(double totalAmount, String departmentCode, Date documentDate, String documentNumber) {
        this.totalAmount = totalAmount;
        this.departmentCode = departmentCode;
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }

    @Override
    public void infoToString() {
        System.out.println("Dep." + departmentCode + " total amount " + totalAmount);

    }
}
