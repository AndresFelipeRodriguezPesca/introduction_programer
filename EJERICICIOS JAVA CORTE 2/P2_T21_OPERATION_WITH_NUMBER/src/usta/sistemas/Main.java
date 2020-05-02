package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/13
	Description:Show the mean of positive numbers, the mean of negative numbers and the number of zeros.
	 */
        f_menu();
        f_operations_numbers();

    }

    public static void f_menu() {
        //Description: this method show the menu of this software
        System.out.println("-----------------------");
        System.out.println("|   SoftAverage       |");
        System.out.println("|Version 1.0 20200428 |");
        System.out.println("|Created by: LFCG     |");
        System.out.println("-----------------------");

    }

    public static void f_operations_numbers() {
        //Description: This function ask for ten numbers
        int sumatory_positives = 0, sumatory_negatives = 0, total_zero = 0, number;
        int total_positives=0, total_negatives=0;
        double average_positives=0, average_negatives=0;
        for (int i = 1; i <= 10; i++) {
            number = f_user_number(i);
            if (number < 0) {
                sumatory_negatives -= number;
                total_negatives++;
            }else  if (number>0) {
                sumatory_positives += number;
                total_positives++;
            }else{
                total_zero++;

            }
        }
        if (total_positives>0){
            average_positives=sumatory_positives/total_positives;
        }
        if (total_negatives>0){
            average_negatives=sumatory_negatives/total_negatives;

        }
        System.out.println("The positives average is "+ average_positives);
        System.out.println("The negatives average is "+ average_negatives);
        System.out.println("The total zero number is "+ total_zero);
    }

    public static int f_user_number(int i) {
        //Description:This function returns a number from the user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the number " + i);
        int number = keyboard.nextInt();
        return number;
    }
}
