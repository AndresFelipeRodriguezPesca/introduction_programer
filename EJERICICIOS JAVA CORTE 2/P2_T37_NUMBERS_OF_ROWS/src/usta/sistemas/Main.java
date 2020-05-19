package usta.sistemas;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/16
	Description:
	 */
        int rows = f_menu_total_rows();
        int columns = f_menu_total_columns();
        int[][] matrix_number = new int[rows][columns];
        matrix_number = f_fill_matrix(matrix_number);

        System.out.println("Input the number of the row: ");
        int number_row = keyboard.nextInt();
        int sumatory = 0;
        double average = 0;
        while (number_row >= 0 || number_row < matrix_number.length - 1) {
            for (int j = 0; j < matrix_number[0].length; j++) {
                sumatory += matrix_number[number_row][j];
                System.out.println("\n | " + matrix_number[number_row][j]);
                sumatory+=matrix_number[number_row][j];
            }

                average = sumatory / matrix_number[0].length;
                System.out.println("By number row " + number_row + " the  summatory is " + sumatory + " and  average is " + average);
                System.out.println("Input of the number of the row");
                number_row = keyboard.nextInt();
            }
            System.out.println("Thanks");
        }

        public static int f_menu_total_rows () {
            //Description: This method show the menu of this software
            System.out.println("--------------------------");
            System.out.println("|  SoftTotalRows         |");
            System.out.println("| Version 1.0 20200519   |");
            System.out.println("| Created by: AFRP       |");
            System.out.println("--------------------------");
            System.out.println("Input how many rows do you want in the matrix");
            int total_rows = keyboard.nextInt();
            while (total_rows <= 0) {
                System.err.println("ERROR: The value must greater than zero");
                System.out.println("input again how many total rows do you want ");
                total_rows = keyboard.nextInt();

            }
            return total_rows;

        }

        public static int f_menu_total_columns () {
            //Description: This method show the menu of this software
            System.out.println("--------------------------");
            System.out.println("|  SoftTotalColumns      |");
            System.out.println("| Version 1.0 20200519   |");
            System.out.println("| Created by: AFRP       |");
            System.out.println("--------------------------");
            System.out.println("Input how many columns do you want in the matrix");
            Scanner keyboard = new Scanner(System.in);
            int total_columns = keyboard.nextInt();
            while (total_columns <= 0) {
                System.err.println("ERROR: The value must greater than zero");
                System.out.println("input again how many total rows do you want ");
                total_columns = keyboard.nextInt();
            }
            return total_columns;
        }
        public static int[][] f_fill_matrix ( int[][] matrix_number){
            //Description: This methods fill the matrix
            for (int i = 0; i < matrix_number.length; i++) {
                for (int j = 0; j < matrix_number[0].length; j++) {
                    matrix_number[i][j] = (int) Math.floor((Math.random() * 1000) + 1);

                }
            }
            return matrix_number;
        }
    }


