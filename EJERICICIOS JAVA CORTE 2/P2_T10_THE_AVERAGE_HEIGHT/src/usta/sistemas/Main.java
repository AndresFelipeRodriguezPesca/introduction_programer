package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    /* Author: Andres Felipe Rodriguez
	Date: 2020/04/20
	Description: This software calculates teh average height of a group of N children and generatedthe average
     */
        f_menu();
        int total_children = f_total_children();
        double sumatory=0, average;
        for (int i = 1; i <= total_children; i = i + 1){
            sumatory=sumatory+f_height_child(i);

            }
            average=sumatory/total_children;
            System.out.println("The average is "+ average);



        }


    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|     SoftAverageHeight  |");
        System.out.println("| Version 1.0 20200420   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }

    public static int f_total_children() {
        //Description:This method return the total children
        System.out.println("input the total children to calculate the height");
        Scanner keyboard = new Scanner(System.in);
        int children = keyboard.nextInt();
        while (children < 1) {
            System.err.println("ERR: The value should be greater  than zero ");
            System.out.println("input the again the total children to calculate the height");
            children = keyboard.nextInt();
        }
        return children;

    }

    public static double f_height_child(int i) {
        //description: This method return the height of a child
        System.out.println("input the  height  (mts) of a child (" + i + "):");
        Scanner keyboard = new Scanner(System.in);
        double height = keyboard.nextDouble();
        while (height < 0.2 || height > 2) {// 20 cm o 2 m
            System.err.println("ERR:The values should be between 0.2 and 2 mts ");
            System.out.println("input the again the height (mts) of child (" + i + "):");
            height = keyboard.nextDouble();
        }
        return height;
    }


}3
