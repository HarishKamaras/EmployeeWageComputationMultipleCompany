package Com.Bridgelabz.EmployeeWageMultipleCompany;


public class EmployeeWageMultipleCompany {
    private static final int WAGE_PER_HOUR = 20;
    private static final int IS_FULL_TIME = 1;
    private static final int IS_PART_TIME = 2;
    private static final int HALF_DAY_HOUR = 5;
    private static final int FULL_DAY_HOUR = 10;
    public static void main(String[] args) {

        System.out.println("Welcome to Employee wage Computation Problem");
        int dailyWage;
        int empStatus = (int) (Math.random() * 10) % 3;
        if(empStatus==1) {
            System.out.println("Employee present");
            //UC2 calculate Daily wage
            dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
            System.out.println("daily wage : "+dailyWage);
                    }
        else if (empStatus==2) {
            System.out.println("Employee present");
            //UC3 part time calculate Daily wage
            dailyWage = WAGE_PER_HOUR * HALF_DAY_HOUR;
            System.out.println("part time daily wage : "+dailyWage);
        } else{
                System.out.println("Employee Absent");
            }
        }
    }
