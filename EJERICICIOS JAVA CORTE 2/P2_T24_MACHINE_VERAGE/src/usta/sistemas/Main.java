package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodriguez
	DATE: 2020/04/29
	DESCRIPTION: Create a software similar to that of the hot drinks vending machine
	 */
        f_menu();
        int option=f_option();
        if (option==1) {
            f_aromatica();
        }else  if (option==2) {
            f_cafe_negro();
        }else if (option==3) {
            f_cafe_with_leche();
        }else if (option==4) {
            f_capuchino();
        }else{
            f_mocachino();
        }
    }
    public static void f_menu() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║     Producto     ║       Valor      ║        Tiempo      ║");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║   1.Aromatica    ║       $1.300     ║      30 Segundos   ║");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║   2.Cafe Negro   ║       $1.000     ║      30 Segundos   ║");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║ 3.Cafe con leche ║       $1.900     ║      45 Segundos   ║");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║   4.Capuchino    ║       $2.500     ║      60 Segundos   ║");
        System.out.println("║══════════════════════════════════════════════════════════║");
        System.out.println("║   5.Mocachino    ║       $2.700     ║      70 Segundos   ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
    public static int f_option() {
        //Description: This method Input the product to consume
        Scanner keyboard=new Scanner(System.in);
        int opt;
        System.out.println("Input the product to consume");
        opt=keyboard.nextInt();
        while (opt<1 || opt >5){
            System.err.println("ERROR: The option of the product doesn't exist");
            System.out.println("Input again the product to consume");
            opt=keyboard.nextInt();
        }
        return opt;
    }
    public static int f_aromatica(){
        //Description: This method calculate the aromatic
        Scanner  keyboard=new Scanner(System.in);
        int dinner = 0;
        System.out.println("Input the dinner");
        if (dinner>=1300) {
            dinner -= 1300;
            System.out.println("Its aromatic takes 30 seconds, its repay are " + dinner);
        } else {
            dinner = 1300 - dinner;
            System.err.println("ERROR:Don't have enough money, the lack " + dinner);
        }
        return dinner;
    }
    public static int f_cafe_negro() {
        //Description: This method calculate the black coffee
        Scanner keyboard = new Scanner(System.in);
        int dinner;
        System.out.println("Input the dinner");
        dinner = keyboard.nextInt();
        if (dinner >= 1000) {
            dinner -= 1000;
            System.out.println("Its aromatic takes 30 seconds, its repay are " + dinner);
        } else {
            dinner = 1000 - dinner;
            System.err.println("ERROR:Don't have enough money, the lack " + dinner);
        }
        return dinner;
    }
    public static int f_cafe_with_leche(){
        //Description: This method calculate the white coffee
        Scanner keyboard = new Scanner(System.in);
        int dinner;
        System.out.println("Input the dinner");
        dinner = keyboard.nextInt();
        if (dinner >= 1900) {
            dinner -= 1900;
            System.out.println("Its aromatic takes 45 seconds, its repay are " + dinner);
        } else {
            dinner = 1900 - dinner;
            System.err.println("ERROR:Don't have enough money, the lack " + dinner);
        }
        return dinner;
    }
    public static int f_capuchino(){
        //Description: This method calculate the white coffee
        Scanner keyboard = new Scanner(System.in);
        int dinner;
        System.out.println("Input the dinner");
        dinner = keyboard.nextInt();
        if (dinner >= 2500) {
            dinner -= 2500;
            System.out.println("Its aromatic takes 60 seconds, its repay are " + dinner);
        } else {
            dinner = 2500 - dinner;
            System.err.println("ERROR:Don't have enough money, the lack " + dinner);
        }
        return dinner;
    }
    public static int f_mocachino(){
        //Description: This method calculate the white coffee
        Scanner keyboard = new Scanner(System.in);
        int dinner;
        System.out.println("Input the dinner");
        dinner = keyboard.nextInt();
        if (dinner >= 2700) {
            dinner -= 2700;
            System.out.println("Its aromatic takes 70 seconds, its repay are " + dinner);
        } else {
            dinner = 2700 - dinner;
            System.err.println("ERROR:Don't have enough money, the lack " + dinner);
        }
        return dinner;
    }
}
