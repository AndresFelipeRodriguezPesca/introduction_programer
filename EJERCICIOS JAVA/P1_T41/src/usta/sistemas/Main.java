package usta.sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Felipe rodriguez
	DATE: 26/03/2020
	DESCRIPTION: This software realize many operations with strings
	 */
        Scanner keyboard= new Scanner(System.in);
        String name;
        System.out.println("----------------------------------");
        System.out.println("            SOFTSTRING            ");
        System.out.println("----------------------------------");
        System.out.println("input your name please            ");
        name = keyboard.nextLine();
        if (name.indexOf("gomez ")!= -1) {
            System.out.println("gomez already exists");
        }else{
            System.out.println("gomez doesnt exist");
        }
        System.out.println("The upper name is "+ name.toUpperCase());
        System.out.println(name.replace(  "a", "@"));
        System.out.println(name.substring(7));
    }
}
