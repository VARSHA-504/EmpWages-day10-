package com.bl.empwages;

public class EmpWageComputation {
    //Class constants
    int DAILY_WAGE;
    int MAX_WORKING_DAYS;
    int MAX_WORKING_HRS;
    String nameOfCompany;
    //class Variables
    int totalHrs = 0;
    int totalDays = 1;
    int totalWage;

    //Parametrized - Constructor
    EmpWageComputation(String name, int workDays, int workHours, int wage){
        this.DAILY_WAGE = wage;
        this.MAX_WORKING_DAYS = workDays;
        this.MAX_WORKING_HRS = workHours;
        this.nameOfCompany = name;
        calcTotalWage();
    }

    //update employee work hours
    void setHrs(int x){
        switch (x) {
            case 1 -> {
                if (this.totalHrs <= this.MAX_WORKING_HRS) {
                    this.totalHrs += 8;
                }
            }
            case 2 -> {
                if (this.totalHrs <= this.MAX_WORKING_HRS) {
                    this.totalHrs += 4;
                }
            }
            default -> { }
        }
    }

    //Calculate employee salary
    int calSalary(){
        return DAILY_WAGE * this.totalHrs;
    }

    //Random employee choice
    static int empChoice(){
        return (int) Math.floor((Math.random() * 100) % 3);
    }

    //Wage Builder
    void calcTotalWage(){
        while (this.totalDays != this.MAX_WORKING_DAYS && this.totalHrs < this.MAX_WORKING_HRS) {
            this.totalDays++;
            //Performing check
            int empCheck = empChoice();
            //Operations
            this.setHrs(empCheck);
        }
        this.totalWage = calSalary();

    }
}
