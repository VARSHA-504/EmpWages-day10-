package com.bl.empwages;

public class CompanyEmpWage extends EmpWageComputation {
    CompanyEmpWage(String name, int workDays, int workHours, int wage) {
        super(name, workDays, workHours, wage);
    }

    //Driver method
    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Builder.");

        //Database Object
        EmpWageBuilder tempStorage = new EmpWageBuilder();

        //Adding to storage
        tempStorage.addRecord("IBM" ,25, 110,23);
        tempStorage.addRecord("Google" ,22, 100,28);
        tempStorage.addRecord("Deep_Mind" ,27, 100,34);

        //Displaying the entries
        tempStorage.getRecord();

    }

}