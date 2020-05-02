package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodriguez
	DATE: 2020/ 04/ 13
	DESCRIPTION: This software calculates the area of circle, square or triangle
	 */
        f_menu();
        Scanner teclado = new Scanner(System.in);
        int opt = teclado.nextInt();
        if (opt < 1 || opt > 3) {
            System.err.println("ERR: This option does not exist");
        } else {
            if (opt == 1) {
                // llamar la funcion del area del circulo
                f_area_circle();
            } else if (opt == 2) {
                // Llamar la funcion del area del cuadrado
                f_are_square();
            } else {
                //llamar la funcion del triangulo
                f_area_triangle();

            }
        }
    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("------------------------");
        System.out.println("|   SoftAreaFiguras    |");
        System.out.println("| Version 1.0 20200414 |");
        System.out.println("| Created by: AFRP     |");
        System.out.println("------------------------");
        System.out.println("this software calculates the area of a: \n1 -circle\n2 -square\n3 -triangle");


    }

    public static void f_area_circle() {
        //Description: This method calculate area of circle
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tho calculate the area of cricle is necessary the radius, input this value (cm)");
        double radius = teclado.nextDouble();
        double area = (radius * radius) * 3.141517;
        System.out.println("The area of circle is " + area + "(cm)");

    }

    public static void f_are_square() {
        //Description: This method calculate area of square
        Scanner teclado = new Scanner(System.in);
        System.out.println("To calculate the area of square is necessary the side, input this value (cm)");
        double side = teclado.nextDouble();
        double area = (side * side);
        System.out.println("The area of square" + area + "(cm)");

    }

    public static void f_area_triangle() {
        //Description: This method calculate area of triangle
        Scanner teclado = new Scanner(System.in);
        System.out.println("To calculate the area of triangle is necessary the base and height, input the value base (cm)");
        double base, height, area;
        base = teclado.nextDouble();
        System.out.println("input the height");
        height = teclado.nextDouble();
        area = (base * height) / 2;
        System.out.println("The area of square is " + area + "(cm)");
    }
}
