package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean b_funcion=false;
        do {
            try {
                Scanner keyboard = new Scanner(System.in);
                System.out.println("input the total people ");
                int total_people = keyboard.nextInt();
                b_funcion = true;

            }catch (Exception e){
                System.err.println("ERR: This software  allowed only number");

            }
        }while (b_funcion==false);
        }
    }

