package com.bl.empwages;

public class EmpWageComputation {
    //Class constants
    int WAGE;
    int MAX_WORKING_DAYS;
    int MAX_WORKING_HRS;
    //class Variables
    int totalHrs = 0;
    int totalDays = 1;

    //Parametrized - Constructor
    EmpWageComputation(int workDays, int workHours, int wage){
        this.WAGE= wage;
        this.MAX_WORKING_DAYS = workDays;
        this.MAX_WORKING_HRS = workHours;
    }

    //update employee work hours
    void setTotalHrs(int x){
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
        return WAGE * this.totalHrs;
    }

    //Random employee choice
    static int empChoice(){
        return (int) Math.floor((Math.random() * 100) % 3);

    }
}
