package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodriguez Pesca
	DATE:2020/05/13
	DESCRIPTION: Determine how much was the percentage of those who rated the food a
	 */
        int total_students = f_menu_total_students();
        int[][] rates_matrix = f_fill_rates_matrix(total_students);
        f_show_bad_rates(rates_matrix);
        f_show_regular_rates(rates_matrix);
        f_show_excellent_rates(rates_matrix);

    }

    public static int f_menu_total_students() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║   SoftRatesFoods         ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-13        ║");
        System.out.println("╚══════════════════════════╝");
        System.out.println("Input  who many students do you want by rate food");
        int total_students = keyboard.nextInt();
        while (total_students <= 0) {
            System.err.println("ERROR: The value must greater than zero");
            System.out.println("Input again who many students do you want by rate food");
            total_students = keyboard.nextInt();
        }
        return total_students;
    }

    public static int[][] f_fill_rates_matrix(int total_students) {
        //Description:This method returns a matrix with rates of N students
        int[][] rate_matrix = new int[total_students][20];
        for (int i = 0; i < total_students; i++) {
            for (int j = 0; j < 20; j++) {
                rate_matrix[i][j] = (int) Math.floor((Math.random() * 10) + 1);
            }
        }
        return rate_matrix;
    }

    public static void f_show_bad_rates(int[][] rates_matrix) {
        //Description: This method show the bad rates (<=3)
        int total_bad_rates = 0;
        for (int i = 0; i < rates_matrix.length; i++) {
            for (int j = 0; j < 20; j++) {
                if (rates_matrix[i][j] <= 3) {
                    total_bad_rates++;
                }
            }
        }
        double percent = (total_bad_rates * 100) / (rates_matrix.length * 20);
        System.out.println("Total bad rates (<=3): " + total_bad_rates + ", percent: % " + percent);
    }

    public static void f_show_regular_rates(int[][] rates_matrix) {
        //Description: This method show the bad rates (<=6)
        int total_regular_rates = 0;
        for (int i = 0; i < rates_matrix.length; i++) {
            for (int j = 0; j < 20; j++) {
                if (rates_matrix[i][j] >= 4 && rates_matrix[i][j] <= 6) {
                    total_regular_rates++;
                }
            }
        }
        double percent = (total_regular_rates * 100) / (rates_matrix.length * 20);
        System.out.println("Total regular rates (4=> <=6): " + total_regular_rates + ", percent: % " + percent);
    }
    public static void f_show_excellent_rates(int[][] rates_matrix) {
        //Description: This method show the bad rates (>=7)
        int total_excellent_rates = 0;
        for (int i = 0; i < rates_matrix.length; i++) {
            for (int j = 0; j < 20; j++) {
                if (rates_matrix[i][j] >=7) {
                    total_excellent_rates++;
                }
            }
        }
        double percent = (total_excellent_rates * 100) / (rates_matrix.length * 20);
        System.out.println("Total regular rates (>=7): " + total_excellent_rates + ", percent: % " + percent);
    }
}
