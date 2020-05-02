package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/13
	Description: Write two functions that allow you to calculate:
	The number of seconds in a given time in hours, minutes and seconds.
	The number of hours, minutes and seconds of a given time in seconds.
	 */
        f_menu();
        int option= f_option();
        if (option==1 ) {
            f_convert_hours_to_second();
        }else if (option==2) {
            f_convert_minutes_to_second();
        }else{
            f_convert_seconds_to_hours_and_minutes();


        }
    }
        public static void f_menu() {
            //Description: This method show the menu of this software
            System.out.println("--------------------------");
            System.out.println("|     SoftConvertTime    |");
            System.out.println("| Version 1.0 20200415  |");
            System.out.println("| Created by: AFRP       |");
            System.out.println("--------------------------");
    }
    public static int f_option(){
        // Description: This method return the option
        System.out.println("input the option of the convert : \n1 - Hours to minutes \n2 -Minutes to seconds\n3 - Seconds to hours and minutes");
        Scanner keyboard= new Scanner(System.in);
        int option= keyboard.nextInt();
        while (option<1 || option>3) {
            System.err.println("ERR: This option does not exist");
            System.out.println("input the option of the convert : \n1 - Hours to minutes \n2 -Minutes to seconds\n3 - Seconds to hours and minutes");
            option = keyboard.nextInt();
        }
        return option;
    }
    public static void f_convert_hours_to_second(){
        //Description: Convert the numbers of seconds in a given time in hours.
        Scanner keyboard= new Scanner(System.in);
        System.out.println(" input the numbers hours to convert ");
        int hours= keyboard.nextInt();
        int seconds= hours*60*60;
        System.out.println("The numbers hours :"+hours+" have "+seconds+"Seconds ");
    }
    public static void f_convert_minutes_to_second(){
        //Description: Convert the minutos to seoonds
        Scanner keyboard= new Scanner(System.in);
        System.out.println(" input the numbers hours to convert ");
        int minutes= keyboard.nextInt();
        int seconds= minutes*60;
        System.out.println("The numbers minutes :"+minutes+" have "+seconds+"Seconds ");
    }
    public static void f_convert_seconds_to_hours_and_minutes(){
        //Description: Convert  seconds to hours and minutes.
        Scanner keyboard= new Scanner(System.in);
        System.out.println(" input the numbers hours to convert ");
        int seconds= keyboard.nextInt();
        int hours= seconds/3600;
        int minutes=(seconds%3600)/60;
        System.out.println("Second equals to :"+ hours+" hours and "+minutes+"minutes ");
    }
}

