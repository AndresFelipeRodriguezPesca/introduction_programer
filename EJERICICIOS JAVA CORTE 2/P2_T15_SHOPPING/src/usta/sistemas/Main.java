package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/22
	Description: A housewife needs to make the market of the month and only has $ 500,000 pesos
	 */
        f_menu();
        Scanner keyboard = new Scanner(System.in);
        int sumatory = 0, cost_product, total_product = 0;
        do {
            total_product += 1;
            System.out.println("input the cost the product (" + total_product + ")");
            cost_product = keyboard.nextInt();
            sumatory += cost_product;
            System.out.println("the temporary bill is " + cost_product);
        } while (sumatory <= 500000);
        sumatory -= cost_product;
        total_product -= 1;
        System.out.println("total bill " + sumatory + "total product " + total_product);

    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("------------------------");
        System.out.println("|     SoftMakeMarket   |");
        System.out.println("| Version 1.0 20200422 |");
        System.out.println("| Created by: AFRP     |");
        System.out.println("------------------------");
    }
}
