package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*Author: Andres Felipe Rodriguez Pesca
	Date:2020/04/13
	Description: Build a program that calculates the average height of a group of 5 childen
	 */
        f_menu();
        double sumatory= f_sum_height();
        System.out.println("The sumatory is "+ sumatory+"mts");
        f_average(sumatory);
    }
    public static void f_menu(){
            System.out.println("-----------------------");
            System.out.println("|  SoftAverageHeight  |");
            System.out.println("|Version 1.0 20200413 |");
            System.out.println("|Created by: LFCG     |");
            System.out.println("-----------------------");

        }
    public static double f_sum_height(){
        //Description: This method calculate the sumatory of 5 height
        Scanner keyboard= new Scanner(System.in);
        double sumatory, height1, height2, height3, height4, height5;
        System.out.println("input  first height (mts): ");
        height1= keyboard.nextDouble();
        System.out.println("input the second height (mts):");
        height2= keyboard.nextDouble();
        System.out.println("input the third height (mts): ");
        height3= keyboard.nextDouble();
        System.out.println(" input the fourth height (mts):");
        height4= keyboard.nextDouble();
        System.out.println("input the fifth height (mts):");
        height5= keyboard.nextDouble();
        sumatory= height1+height2+height3+height4+height5;
        return sumatory;
    }
    public static void f_average(double sumatory){
        // Description: This method calcualte the average
        double average= sumatory/5;
        System.out.println("The average is "+ average+"mts");
    }

    }

