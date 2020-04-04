package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* AUTHOR: Felipe Rodriguez
        DATE:30/03/2020
        DESCRIPTION: This software  realize many operations with strings
         */
        Scanner keyboard= new Scanner(System.in);
        String name;
        System.out.println("╔=============================╗");
        System.out.println("║ StringSoft USTA 2020        ║");
        System.out.println("║ Versión 1.0                 ║");
        System.out.println("║ Created by Felipe rodriguez ║");
        System.out.println("╚=============================╝");

        System.out.println("input your name please ");
        name=keyboard.nextLine();
        if (name.length()<6){
            System.out.println("ERROR: the name is too short, you must enter the full name");
        }
        if (name.length()>20){
            System.out.println("ERROR: the name is too long, you only have to enter your full name");
        }
        System.out.println(name.replace("a", "@").replace("e","3").replace("i","1").replace("o","0"));
    }
}
