package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/05/04
	Description:
	 */
        int total_numbers = f_menu();
        int[] vector_numbers = f_fill_vector_numbers(total_numbers);
        f_show_bigger_number(vector_numbers);
        f_show_minor_number(vector_numbers);
    }

    public static int f_menu() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║     SoftVectorSalary     ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-04        ║");
        System.out.println("╚══════════════════════════╝");
        System.out.println("Input the total number");
        Scanner teclado = new Scanner(System.in);
        int total_number = teclado.nextInt();
        while (total_number <= 0) {
            System.err.println("ERROR:The value can't be minor  or same zero");
            System.out.println("Input again the total number");
            total_number = teclado.nextInt();
        }
        return total_number;
    }

    public static int[] f_fill_vector_numbers(int total_numbers) {
        //Description: This fill the vector
        Scanner teclado = new Scanner(System.in);
        int[] vector = new int[total_numbers];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Input the integer number (" + (i + 1) + ")");
            vector[i] = teclado.nextInt();
        }
        return vector;
    }

    public static void f_show_bigger_number(int[] vector_numbers) {
        //Description:Show the bigger number in vector
        int bigger_number = 0;
        for (int i = 0; i < vector_numbers.length; i++) {
            if (i == 0) {
                bigger_number = vector_numbers[i];
            } else {
                if (bigger_number < vector_numbers[i]) {
                    bigger_number = vector_numbers[i];
                }
            }
        }
        System.out.println("The bigger number is:" + bigger_number);
    }

    public static void f_show_minor_number(int[] vector_numbers) {
        //Description:Show the bigger number in vector
        int minor_number = 0;
        for (int i = 0; i < vector_numbers.length; i++) {
            if (i == 0) {
                minor_number = vector_numbers[i];
            } else {
                if (minor_number > vector_numbers[i]) {

                    minor_number = vector_numbers[i];
                }
            }
            System.out.println("the vector [" + i + "]"+vector_numbers[i]);
        }
        System.out.println("The minor number is:" + minor_number);
    }
}

