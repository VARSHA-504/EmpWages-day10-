package com.bl.empwages;

public class EmpWageComputation {

    public static void main(String[] args) {
        //Variables
        int hrs = 0 ;
        int wage = 20;
        //Performing check
        double empCheck = Math.floor((Math.random()*100)%3);
        //Operations
        switch ((int) empCheck) {
            case 1 -> {
                System.out.println("Employee is Present ");
                hrs = 8;
            }
            case 2 -> {
                System.out.println("Employee is Part time ");
                hrs = 4;
            }
            default -> System.out.println("Employee is absent");
        }
        int salary = wage * hrs;
        System.out.println("The salary is " + salary);
    }
}
