package com.company;


public class SalaryPlusCommissionEmployee {


    private double salary;
    private double commissionRate;
    private double totalSell;


    public SalaryPlusCommissionEmployee(String firstName, String lastName, double salary, double commissionRate, double totalSell) {

        this.salary = salary;
        this.commissionRate = commissionRate;
        this.totalSell = totalSell;
    }


    public double getEarning() {
        return this.salary + (this.commissionRate*this.totalSell)/100;
    }
}
