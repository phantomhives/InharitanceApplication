package com.company;

public abstract class Employee {

    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public final String getFullName(){

        return this.firstName + " " + this.lastName;
    }

    public abstract double getEarning();
}
