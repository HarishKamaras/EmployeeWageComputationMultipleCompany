package Com.Bridgelabz.EmployeeWageMultipleCompany;

import java.util.Scanner;

public class EmployeeWageMultipleCompany {
    private static final int HALF_DAY_HOUR = 5;
    private static final int FULL_DAY_HOUR = 10;

    private static final int IS_FULL_TIME = 1;

    private static final int IS_PART_TIME = 2;

    public static void wageCompute( String companyName, int WAGE_PER_HOUR, int TOTAL_WORKING_DAYS, int TOTAL_WORKING_HOURS ){
        int dayCount = 1;
        int workingHours = 0;
        int totalWage = 0;
        while (dayCount <= TOTAL_WORKING_DAYS && workingHours <= TOTAL_WORKING_HOURS) {
            int dailyWage = 0;
            int empStatus = (int) (Math.random() * 10) % 3;
            switch (empStatus) {
                case IS_FULL_TIME:
                    System.out.println("Employee worked FULL TIME");
                    workingHours = workingHours + FULL_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case IS_PART_TIME:
                    System.out.println("Employee worked PART_TIME");
                    workingHours = workingHours + HALF_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is Absent");
            }
            totalWage = totalWage + dailyWage;
            System.out.println("Daily Wage for day : " + dayCount + " is " + dailyWage);
            dayCount++;
        }
        System.out.println("********************************");
        System.out.println("The Company Name : "+companyName);
        System.out.println("Total Days : "+ (dayCount-1));
        System.out.println("Total Working Hours : " + workingHours);
        System.out.println("Total wage for a month :" +totalWage);
    }
    public static void main(String[] args) {
        //UC8 Employee Wage Computation for multiple companies
        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the Company Name :");
        String companyName = scan.nextLine();
        System.out.println("enter the wage per hour: ");
        int WAGE_PER_HOUR = scan.nextInt();
        System.out.println("enter the Total Working Days: ");
        int TOTAL_WORKING_DAYS = scan.nextInt();
        System.out.println("enter the Total working hour: ");
        int TOTAL_WORKING_HOURS = scan.nextInt();
        wageCompute(companyName,WAGE_PER_HOUR,TOTAL_WORKING_DAYS, TOTAL_WORKING_HOURS );
    }
}