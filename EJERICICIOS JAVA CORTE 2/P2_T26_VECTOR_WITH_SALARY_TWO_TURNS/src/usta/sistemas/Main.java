package usta.sistemas;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/05/04
	Description:Create a program in JAVA that allows storing the salaries of the employees grouped by shift. With such information:
	 */
        f_menu();
        int [] turn_morning= f_salary_turn();
        int [] turn_afternoon=f_salary_turn();
        int salary_total_morning= f_show_salary_morning(turn_morning);
        int salary_total_afternoon= f_show_salary_afternoon(turn_afternoon);
        System.out.println("The total salary ( morning+ afternoon)="+salary_total_afternoon+salary_total_morning);
    }
    public static void f_menu() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║     SoftVectorSalary     ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-04        ║");
        System.out.println("╚══════════════════════════╝");
    }
    public static int [] f_salary_turn(){
        //Description: This method returns the salary  of 8 employees
        int[] salary= new int [8];
        for (int i=0; i<8; i++){
            salary[i]=(int) Math.floor(Math.random()*(2000000-980685)+980685);
        }
        return salary;
    }
    public static int f_show_salary_morning(int[] turn_morning) {
        //Description:This method show the salary by turn morning
        System.out.println("-----------Turn of morning----------");
        int total_Salary = 0;
        for (int i = 0; i < 8; i++) {
            total_Salary += turn_morning[i];
            System.out.println("The salary employed (" + (i + 1) + "):" + turn_morning[i]);
        }
        System.out.println("The total salary  by turn of morning is " + total_Salary);
        return total_Salary;
    }
    public static int f_show_salary_afternoon(int[] turn_afternoon) {
        //Description:This method show the salary by turn morning
        System.out.println("-----------Turn of afternoon----------");
        int total_Salary = 0;
        for (int i = 0; i < 8; i++) {
            total_Salary += turn_afternoon[i];
            System.out.println("The salary employed (" + (i + 1) + "):" + turn_afternoon[i]);
        }
        System.out.println("The total salary  by turn of afternoon is " + total_Salary);
        return total_Salary;
    }
}

