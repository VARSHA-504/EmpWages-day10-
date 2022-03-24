package com.bl.empwages;

public class EmpWageBuilder extends EmpWageComputation {
    int totalWage;
    String nameOfCompany;

    EmpWageBuilder(String name, int workDays, int workHours, int wage) {
        super(workDays, workHours, wage);
        this.nameOfCompany = name;
    }
    void calcTotalWage(){
        while (this.totalDays != this.MAX_WORKING_DAYS && this.totalHrs < this.MAX_WORKING_HRS) {
            this.totalDays++;
            //Performing check
            int empCheck = empChoice();
            //Operations
            this.setTotalHrs(empCheck);
        }
        this.totalWage = calSalary();
        System.out.println(this.nameOfCompany +" - Days Worked: " +this.totalDays);
        System.out.println(this.nameOfCompany +" - Hours Worked: " + this.totalHrs);
        System.out.println(this.nameOfCompany +" - Total wage earned: " + this.totalWage);
        System.out.println("\n");
    }

    //Driver method
    public static void main(String[] args) {
        //Employee 1 object whose wages need to be calculated.
        EmpWageBuilder company1 = new EmpWageBuilder("IBM" ,25, 110,23);
        EmpWageBuilder company2 = new EmpWageBuilder("Google" ,22, 100,28);

        company1.calcTotalWage();
        company2.calcTotalWage();
}
