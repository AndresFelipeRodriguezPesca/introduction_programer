package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		/* AUTHOR: Andres felipe Rodríguez Pesca
	DATE: 20202/03/12
	DESCRIPTION: This software adds  input two variable and adds
	 */
        Scanner keyboard = new Scanner(System.in);
        int v1, v2, suma;
        System.out.println("This software adds two variable, input the first variable ");
        v1=keyboard.nextInt();
        System.out.println("Input the second variable ");
        v2=keyboard.nextInt();
        suma=v1+v2;
        System.out.println("The sumatory is: "+suma);
    }
}
