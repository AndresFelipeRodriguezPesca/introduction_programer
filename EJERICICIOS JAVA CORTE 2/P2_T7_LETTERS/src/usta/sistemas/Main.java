package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/16
	Description:This software return the first letter of a word, capitalleter a word and replace vowels to @
	 */
        f_menu();
        int option = f_option();
        if (option == 1) {
            f_firsts_letter();
        } else if (option == 2) {
            f_upper_word();
        }else{
            f_replace_vowels();

        }
    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|     SoftConvertWord    |");
        System.out.println("| Version 1.0 20200416   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }

    public static int f_option() {
        //Description: This method return the option
        System.out.println("Input of the kind op option grades: \n1 - firstletter\n2 -capitalleter\n3 - replace vowels to @");
        Scanner keyboard = new Scanner(System.in);
        int option = keyboard.nextInt();
        while (option < 1 || option > 3) {
            System.err.println("ERR: This option doesn't exist");
            System.out.println("Input of the kind op option grades: \n1 - firstletter\n2 -capitalleter\n3 - replace vowels to @");
            option = keyboard.nextInt();
        }
        return option;
    }

    public static void f_firsts_letter() {
        //Description: This method return the first letter of a word
        System.out.println("input of the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
        while (word.length() < 5) {
            System.err.println("ERR:This wors should");
            System.out.println("input again the word");
            word = keyboard.nextLine();
        }
        char[] letters = word.toCharArray();
        System.out.println("The first lleter is " + letters[0]);
    }

    public static void f_upper_word() {
        //Description: This method turn lowercase to uppercase
        System.out.println("input of the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
        while (word.length() < 5) {
            System.err.println("ERR:This wors should");
            System.out.println("input again the word");
            word = keyboard.nextLine();
        }
        System.out.println("the uppercase is " + word.toUpperCase());

    }

    public static void f_replace_vowels() {
        //Description: This method turn the  replace vowels to @
        System.out.println("input of the word");
        Scanner keyboard = new Scanner(System.in);
        String word = keyboard.next();
        while (word.length() < 5) {
            System.err.println("ERR:This wors should");
            System.out.println("input again the word");
            word = keyboard.nextLine();
        }
        String word2= word.toLowerCase();
        System.out.println("The uppercase is "+ word.replace("a","@").replace("e","@").replace("i","@").replace("o","@").replace("u","@"));


    }
}
