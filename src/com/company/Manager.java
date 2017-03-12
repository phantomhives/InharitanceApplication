package com.company;

/**
 * Created by shusa on 13-Mar-17.
 */
public class Manager extends Employee {

    public Manager(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public double getEarning() {
        return 0;
    }
}
