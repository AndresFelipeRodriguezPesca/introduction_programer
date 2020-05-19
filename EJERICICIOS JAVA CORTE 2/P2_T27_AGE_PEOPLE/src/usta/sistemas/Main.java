package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/05/04
	Description:determine how many are over 18 and when they are under, Those who are over 60 years old, average age.
	 */
        int total_people=f_menu();
        int[] age_people= f_age_of_people(total_people);
        f_show_age(age_people);
        f_show_over_60(age_people);
        f_show_average_age(age_people);

    }

    public static int f_menu() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║     SoftAgePeople        ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-05        ║");
        System.out.println("╚══════════════════════════╝");

        System.out.println("Input the total number of people");
        Scanner teclado = new Scanner(System.in);
        int total_people = teclado.nextInt();
        while (total_people <= 0) {
            System.err.println("ERROR: That age doesn't exist");
            System.out.println("Input again the total number of people");
            total_people = teclado.nextInt();
        }
        return total_people;
    }

    public static int[] f_age_of_people(int total_people){
        //Description: This function return a vector with the age of people
        int[] age_people= new int[total_people];
        for (int i=0; i<total_people; i++){
         age_people[i]=(int)Math.floor(Math.random()*80+1);
        }
        return age_people;
    }
    public static void f_show_age(int[] age_people){
        //Description: This method show how many are over 18 and when they are under
        int total_people= age_people.length;
        int total_over_18=0, total_under_18=0;
        for (int i=0; i<total_people; i++){
            System.out.println(age_people[i]);
            if (age_people[i]< 18) {
                total_under_18++;
            }else{
                total_over_18++;
            }
        }
        System.out.println("The total people over +18 is:"+ total_over_18);
        System.out.println("The total people under -18  is:"+ total_under_18);
    }
    public static void f_show_over_60(int[] age_people) {
        //Description: This method show how many are over 18 and when they are under
        int total_people = age_people.length;
        int total_over_60 = 0;
        for (int i = 0; i < total_people; i++) {
            System.out.println(age_people[i]);
            if (age_people[i] > 60) {
                total_over_60++;
            }
        }
        System.out.println("The total of people +60 is :" + total_over_60);
    }
    public static void f_show_average_age(int[] age_people){
        //Description: This method show the average of some ages
        int sum_age=0;
        for (int i=0; i<age_people.length; i++){
            sum_age=sum_age+age_people[i];
        }
        double average=sum_age/age_people.length;
        System.out.println("The average is:"+average);
    }
}

