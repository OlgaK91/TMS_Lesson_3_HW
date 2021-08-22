package com.tms.documents;

import java.util.Date;

public class EmployeeContract extends Contract {

    public Date beginDate;
    public Date endDate;
    public String employeeName;

    @Override
    public void infoToString() {
        System.out.println(employeeName + " contract from " + beginDate + " to " + endDate);
    }

    public EmployeeContract() {
        this.beginDate = new Date();
        this.endDate = new Date();
        this.employeeName = "";
        this.documentDate = new Date();
        this.documentNumber = "";
    }

    public EmployeeContract(Date beginDate, Date endDate, String employeeName, Date documentDate, String documentNumber) {
        this.beginDate = beginDate;
        this.endDate = endDate;
        this.employeeName = employeeName;
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }
}
