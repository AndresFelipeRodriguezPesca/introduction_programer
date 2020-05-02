package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/27
	Description: A program that generates a random number from 1 to 100 is required. An assistant will say a number,
	if it is equal to the random number you are informed that you have won,
	otherwise change the assistant with a new number until the winning number is found.

	 */
        f_menu();
        int random=f_random_number();
        int number_user=f_input();
        int attemps=5;
        while (number_user != random && attemps>1){
            attemps--;
            System.err.println("The number is different than the generated number (attemps = ("+attemps+")");
            System.out.println("Try again, attemps ("+attemps+")");
            number_user=f_input();
        }

       if (attemps >1) {
           System.out.println("Congratulations, you win a olimpo burger with the number (" + random + ")");
       }else {
           System.out.println("Sorry you, lost The random number was " +random);
        }
    }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("------------------------");
        System.out.println("|     SoftBurger       |");
        System.out.println("| Version 1.0 20200427 |");
        System.out.println("| Created by: AFRP     |");
        System.out.println("------------------------");
    }
    public static int f_random_number(){
        //Description: This function creates the random method
        int number= (int) Math.floor(Math.random()*100+1);
        if (number<50) {
            System.out.println("Hint 1: The number is minor than 50");
        }else{
            System.out.println("Hint 1 The number is greater than 50");

        }
        if (number % 2==0) {
            System.out.println("Hint 2: The number is pair");
        }else{
            System.out.println("Hint 2:The number is odd");

        }
        return number;
    }
    public static int f_input(){
        //Description: this function asks the user for the number
        Scanner keyboard= new Scanner(System.in);
        int input;
        System.out.println("Type the number to compare (0-100)");
        input=keyboard.nextInt();

        while (input<0  || input>101 ){
            System.err.println("ERR:The input must be between 0 and 100 n retry");
            input=keyboard.nextInt();
    }
        return input;

    }

}
