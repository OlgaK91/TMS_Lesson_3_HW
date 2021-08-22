package com.tms.documents;


import java.util.Date;

public class SupplyContract extends Contract {
    public String supplyType;
    public int supplyAmount;

    @Override
    public void infoToString() {
        System.out.println(supplyType + " " + supplyAmount);
    }

    public SupplyContract() {
        this.supplyAmount = 0;
        this.supplyType = "";
        this.documentDate = new Date();
        this.documentNumber = "";
    }

    public SupplyContract(int supplyAmount, String supplyType, Date documentDate, String documentNumber) {
        this.supplyAmount = supplyAmount;
        this.supplyType = supplyType;
        this.documentDate = documentDate;
        this.documentNumber = documentNumber;
    }

}
