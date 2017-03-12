package com.company;

public class SalaryEmployee extends Employee {

    private double salary;

    public SalaryEmployee(String firstName, String lastName, double salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public double getEarning() {
        return this.salary;
    }
}