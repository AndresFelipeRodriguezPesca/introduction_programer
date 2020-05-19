package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/05/06
	Description: This software calculates the total of products with IVA included
	 */
        int total_number = f_menu_total_numbers();
        int[] vector_numbers = f_fill_vector(total_number);
        f_show_even_numbers(vector_numbers);
        f_show_odd_numbers(vector_numbers);
    }

    public static int f_menu_total_numbers() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║     SoftOddEven          ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-06        ║");
        System.out.println("╚══════════════════════════╝");
        Scanner keyboard = new Scanner(System.in);
        int total_number;
        do {
            System.out.println("Input the total numbers by greater than zero");
            total_number = keyboard.nextInt();
        } while (total_number <= 0);
        return total_number;
    }

    public static int[] f_fill_vector(int total_number) {
        //Description: This method return a vector with  numbers
        int[] vector_numbers = new int[total_number];
        for (int i = 0; i < total_number; i++) {
            vector_numbers[i] = (int) Math.floor(Math.random() * (1000 - 100 + 1) + 100);
        }
        return vector_numbers;
    }

    public static void f_show_even_numbers(int[] vector_numbers) {
        //Description: This method show the even numbers
        int total_events = 0;
        for (int number : vector_numbers) {
            if ((number % 2) == 0) {
                total_events++;
                System.out.println("Even number = " + number);
            }
        }
        System.out.println("The total events number is " + total_events);
    }

    public static void f_show_odd_numbers(int[] vector_numbers) {
        //Description: This method show the even numbers
        int total_odd = 0;
        for (int number : vector_numbers) {
            if ((number % 2) == 1) {
                total_odd++;
                System.out.println("Odd numbers = " + number);
            }
        }
        System.out.println("The total odd number is " + total_odd);
    }
}
