package usta.sistemas;
import  java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR:Andres felipe rodriguez pesca
	DATE:2020/03/12
	DESCRIPTION: This software realice of sumatory by three numbers and average thems
	 */
	Scanner keyboard= new Scanner(System.in);
	int v1, v2, v3, sumatory;
	double average;
	System.out.println("this sotware realice of sumatory of three numbers and average, input  the first numbers");
	v1=keyboard.nextInt();
	System.out.println("input the second number");
	v2=keyboard.nextInt();
	System.out.println("input the third number");
	v3=keyboard.nextInt();
	sumatory=v1+v2+v3;
    average=sumatory/3;
    System.out.println("the sumatory is"+ sumatory+"and the average is"+ average);
    5

    }
}
