package com.bl.empwages;

public class EmpWageComputation {

    public static void main(String[] args) {
        //Class constants
        final int WAGE = 20;
        final int MAX_WORKING_DAYS = 20;
        final int MAX_WORKING_HRS = 99;
        //class Variables
        int totalHrs = 0;
        int totalDays = 1;

        //update employee work hours
        void setTotalHrs(int x){
            switch (x) {
                case 1 -> this.totalHrs += 8;
                case 2 -> this.totalHrs += 4;
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

        //Driver method
        public static void main(String[] args) {
            //Employee 1 object whose wages need to be calculated.
            empWageComputation emp1 = new empWageComputation();

            //Looping for a month
            while (emp1.totalDays != emp1.MAX_WORKING_DAYS && emp1.totalHrs != emp1.MAX_WORKING_HRS) {
                emp1.totalDays++;
                //Performing check
                int empCheck = empChoice();
                //Operations
                emp1.setTotalHrs(empCheck);
            }

            //Outputs
            System.out.println("Total Working Days are " +emp1.totalDays);
            System.out.println("Total Working Hours are " + emp1.totalHrs);
            System.out.println("The total salary is " + emp1.calSalary());
    }
}
