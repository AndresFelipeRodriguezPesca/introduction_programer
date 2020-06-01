package usta.sistemas;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	/*AUTHOR: Andres Felipe  Rodriguez;
	DATE: 25/03/2020
	DESCRIPTION:this software leps determine if you have coronavirus
	 */
		Scanner keyboard = new Scanner(System.in);
		int age, cough, fever, body_pain, difficulty_breathing;

		System.out.println("---------------------------------------------------------------");
		System.out.println("                          Dr. Coronavirus                      ");
		System.out.println("---------------------------------------------------------------");
		System.out.println("this software leps determine if you have coronavirus (COVID-19)");
		System.out.println("Created by: Andres Felipe Rodriguez Pesca");
		System.out.println("----------------------------------------------------------------");


		System.out.println("determine if you have coronavirus");
		System.out.println("enter the patient's age");
		age = keyboard.nextInt();
		System.out.println("do you have a cough, yes(1) no(0)");
		cough = keyboard.nextInt();
		System.out.println("do you have a fever ");
		fever = keyboard.nextInt();
		System.out.println("do you have body pain  yes(1) no(0)");
		body_pain = keyboard.nextInt();
		System.out.println("Do you have difficulty breathing,yes(1) no(0)");
		difficulty_breathing = keyboard.nextInt();

		if (cough == 1 && fever <= 38 && difficulty_breathing == 0 && body_pain == 1 && age < 60) {
			System.err.println("the user only has certain symptoms but does not present covid 19");
		} else {

			if (cough == 1 && fever > 38 && difficulty_breathing == 1 && body_pain == 1) {
				System.err.println("The user can have COVID19 and must remain isolated and strictly follow the health instructions");
			} else {

			}
			if (cough == 1 && fever > 38 && difficulty_breathing == 1 && body_pain == 1 && age > 60) {
				System.err.println("you should immediately contact your EPS.");
			} else {

			}

		}
	}
}