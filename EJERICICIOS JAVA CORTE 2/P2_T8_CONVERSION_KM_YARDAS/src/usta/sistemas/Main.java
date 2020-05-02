package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/16
	Description: This software converts kilometers into miles , miles to kilometers, miles into  yards and upsidedown
	 */
        f_menu();
        int option = f_option();
        if (option==1) {
            f_kilometers_to_miles();
        }else if (option==2) {
            f_kilometers_to_yards();
        }else if (option==3) {
            f_miles_to_kilometers();
        }else{
            f_yard_to_kilometers();
        }

    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|  SoftConvertDistances  |");
        System.out.println("| Version 1.0 20200416   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }

    public static int f_option() {
        //Description: This method return the option
        System.out.println("Input of the  option of the convert : \n1 - kilometers to miles\n2 -kilometers to yards\n3 - miles into kilometers\n4- yard to kilometers");
        Scanner keyboard= new Scanner(System.in);
        int option= keyboard.nextInt();
        while (option<1 ||option> 4){
            System.err.println("ERR: This option doesn't exist");
            System.out.println("Input of the  option of the convert : \n1 - kilometers to miles\n2 -kilometers to yards\n3 - miles into kilometers\n4- yard to kilometers ");
            option=keyboard.nextInt();
        }
        
        return option;
    }

    public static void f_kilometers_to_miles() {
        //Description: This method converts kilometers into miles
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double miles = kilometers * 0.6214;
        System.out.println("the  miles are " + miles);
    }

    public static void f_kilometers_to_yards() {
        //Description: This method converts kilometers into yards
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in kilometers (km)");
        double kilometers = keyboard.nextDouble();
        double yards = kilometers * 1093.6;
        System.out.println("the yards are " + yards + "(yd)");

    }

    public static void f_miles_to_kilometers() {
        //Description: This method converts  miles into kilometers
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in kilometers (km)");
        double miles = keyboard.nextDouble();
        double kilometers = miles / 0.62137;
        System.out.println("the kilometers are " + kilometers + "(km)");
    }

    public static void f_yard_to_kilometers() {
        //Description: This method converts yards into kilometers
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the value in kilometers (km)");
        double yards = keyboard.nextDouble();
        double kilometers = yards / 1093.6;
        System.out.println("the kilometers are " + kilometers + "(km)");
    }

    }
