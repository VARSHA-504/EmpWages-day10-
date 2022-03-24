package com.bl.empwages;

public class EmpWageComputation {

    public static void main(String[] args) {
        int Is_present = 1;
        int wage = 20;
        int hrs = 8;
        int salary = wage*hrs;
        double empCheck = Math.floor((Math.random()*100)%2);
        if (empCheck == Is_present)
            System.out.println("Employee is Present ");
        else
            System.out.println("Employee is absent");
        System.out.println("The daily wage is " + salary);
    }
}
