package com.company;

public class CommissionEmployee extends Employee {

    private double commissionRate;
    private double totalSell;

    public CommissionEmployee(String firstName, String lastName, double commissionRate, double totalSell) {
        super(firstName, lastName);
        this.commissionRate = commissionRate;
        this.totalSell = totalSell;
    }

    public double getEarning() {
        return (this.commissionRate*this.totalSell)/100;
    }
}
