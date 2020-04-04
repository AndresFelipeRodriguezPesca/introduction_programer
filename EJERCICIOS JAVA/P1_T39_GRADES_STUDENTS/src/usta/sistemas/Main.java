package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* author: andresrodríguez pesca
	date: 24/03/2020
	description: this software realize  calculates the grade final of a student
	 */
	 Scanner keyboard= new Scanner(System.in);

	 double grade1, grade2, grade3, grade4, gradefinal;
	 System.out.println("software gradesoft: calculate the final ");
	 System.out.println("do you need input de firsts  grade (20%) ");
	 grade1=keyboard.nextDouble();
	 System.out.println("do you need input de second  grade (25%) ");
	 grade2 =keyboard.nextDouble();
	 System.out.println("do you need input de third grade (25%) ");
	 grade3 =keyboard.nextDouble();
	 System.out.println("do you need input de fourth  grade (30%), the grade between  ");
	 grade4 =keyboard.nextDouble();
     // OR || y AND = &&
	 if (grade1<0 || grade1>5||
         grade2<0 || grade2>5||
         grade3<0 || grade3>5||
         grade4<0 || grade4>5){
         System.err.println("ERROR: the grades no are between 0 to 5 ");
     }else {
	     gradefinal=(grade1*0.20)+(grade2*0.25)+(grade3*0.25)+(grade4*0.30);
         System.out.println("The final  grade is "+ gradefinal);
     }

    }
}
