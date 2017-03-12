package com.company;


public class SalaryPlusCommissionEmployee {

    private String firstName;
    private String lastName;
    private double salary;
    private double commissionRate;
    private double totalSell;


    public SalaryPlusCommissionEmployee(String firstName, String lastName, double salary, double commissionRate, double totalSell) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.commissionRate = commissionRate;
        this.totalSell = totalSell;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public double getEarning() {
        return this.salary + (this.commissionRate*this.totalSell)/100;
    }
}
