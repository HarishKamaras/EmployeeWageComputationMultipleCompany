package Com.Bridgelabz.EmployeeWageMultipleCompany;


public class EmployeeWageMultipleCompany {
    private static final int WAGE_PER_HOUR = 20;
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int HALF_DAY_HOUR = 5;
    private static final int FULL_DAY_HOUR = 10;
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation Problem");
        int dailyWage = 0;
        int empStatus = (int) (Math.random() * 10) % 3;
        //UC4 Switch statement
        switch (empStatus) {
            case IS_FULL_TIME:
                System.out.println("Employee worked FULL TIME");
                dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                System.out.println("dailywage : "+dailyWage);
                break;
            case IS_PART_TIME:
                System.out.println("Employee worked PART_TIME");
                dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
                System.out.println("dailywage : "+dailyWage);
                break;
            default:
                System.out.println("Employee is Absent");
        }
        }
    }
