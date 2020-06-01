package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {

            Scanner keyboard = new Scanner(System.in);
            System.out.println(" input the first number");
            int number1 = keyboard.nextInt();
            System.out.println(" input the second number");
            int number2 = keyboard.nextInt();

            int number3 = number1 + number2;
            System.out.println("the sum is:" + number3);
        } catch (Exception e) {
            System.err.println("ERR: The software allow only number not words" + e.toString());
        }
    }
}
