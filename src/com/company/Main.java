package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        SalaryEmployee salaryEmployee = new SalaryEmployee("md","kula",5000);
        System.out.println(salaryEmployee.getFullName());
        System.out.println(salaryEmployee.getEarning());


        System.out.println("==========================");

        CommissionEmployee commissionEmployee =new CommissionEmployee("md","sumon",5,10000);
        System.out.println(commissionEmployee.getFullName());
        System.out.println(commissionEmployee.getEarning());

        System.out.println("==========================");

        SalaryPlusCommissionEmployee salaryPlusCommissionEmployee =new SalaryPlusCommissionEmployee("sus","sar",20000,6,2000);
        System.out.println(salaryPlusCommissionEmployee.getFullName());
        System.out.println(salaryPlusCommissionEmployee.getEarning());

        System.out.println("==========================");

    }
}
