package com.bl.empwages;

public class CompanyEmpWage extends EmpWageComputation {
    CompanyEmpWage(String name, int workDays, int workHours, int wage) {
        super(name, workDays, workHours, wage);
    }

    //Driver method
    public static void main(String[] args) {
        //    Employee 1 object whose wages need to be calculated.
        CompanyEmpWage company1 = new CompanyEmpWage("IBM" ,25, 110,23);
        CompanyEmpWage company2 = new CompanyEmpWage("Google" ,22, 100,28);

        //Database Object
        EmpWageBuilder tempStorage = new EmpWageBuilder();

        //Adding to storage
        tempStorage.addRecord(company1);
        tempStorage.addRecord(company2);

        //Displaying the entries
        tempStorage.getRecord();
    }
