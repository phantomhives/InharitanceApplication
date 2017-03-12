package com.company;

public class CommissionEmployee {


    private double commissionRate;
    private double totalSell;

    public CommissionEmployee(String firstName, String lastName, double commissionRate, double totalSell) {

        this.commissionRate = commissionRate;
        this.totalSell = totalSell;
    }



    public double getEarning() {
        return (this.commissionRate*this.totalSell)/100;
    }
}
