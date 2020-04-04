package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodríguez Pesca
	   DATE: 2020/03/12
	   DESCRIPTION: This software prints two birth years and their difference
	 */
	Scanner keyboard= new Scanner(System.in);
	int year1, year2, difference;
        System.out.println("This software prints two years days and their difference, input the first year");
        year1=keyboard.nextInt();
        System.out.println(" input the second year ");
        year2=keyboard.nextInt();
        difference=year1-year2;
        System.out.println("the difference between the two years is "+ difference+ "years");

    }
}
