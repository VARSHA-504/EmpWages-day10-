package com.bl.empwages;

public class EmpWageComputation {

    public static void main(String[] args) {
	    System.out.println("Welcome to Employee wage computation");
        int Is_present = 1;
        double empCheck = Math.floor((Math.random()*100)%2);
        if (empCheck == Is_present)
            System.out.println("Employee is Present ");
        else
            System.out.println("Employee is absent");
    }
}
