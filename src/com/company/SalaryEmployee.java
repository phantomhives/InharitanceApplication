package com.company;

public class SalaryEmployee {


        private double salary;


    public SalaryEmployee(String firstName, String lastName, double salary) {

        this.salary = salary;
    }



    public double getEarning() {
        return this.salary;
    }
}