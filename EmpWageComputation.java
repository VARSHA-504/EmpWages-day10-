package com.bl.empwages;

public class EmpWageComputation {

    public static void main(String[] args) {
        int is_present= 1;
        int is_parttime = 2;
        int hrs = 0 ;
        int wage = 20;
        double empCheck = Math.floor((Math.random()*100)%3);
        if (empCheck == is_present) {
            System.out.println("Employee is Present ");
            hrs = 8;
        }
        else if (empCheck == is_parttime) {
            System.out.println("Employee is Part time ");
            hrs = 4;
        }
        else {
            System.out.println("Employee is absent");
        }
        int salary = wage * hrs;
        System.out.println("The salary is " + salary);
    }
}
