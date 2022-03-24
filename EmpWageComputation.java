package com.bl.empwages;

public class EmpWageComputation {

    public static void main(String[] args) {
        int hrs;
        int wage = 20;
        int total_hrs = 0;
        int salary = 0;
        int maxWorkingDays = 20;
        int total_days = 0;
        int maxWorkingHrs = 99;
        //Looping for a month
        while (total_days < maxWorkingDays && total_hrs <= maxWorkingHrs) {
            total_days++;
            //Performing check
            double empCheck = Math.floor((Math.random() * 100) % 3);
            //Operations
            switch ((int) empCheck) {
                case 1 -> hrs = 8;
                case 2 -> hrs = 4;
                default -> hrs = 0;
            }
            total_hrs += hrs;
            salary = wage * total_hrs;
        }
        System.out.println("Total Working Days are " +total_days);
        System.out.println("Total Working Hours are " + total_hrs);
        System.out.println("The total salary is " + salary);
    }
}
