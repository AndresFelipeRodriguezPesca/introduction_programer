package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodriguez
	DATE:19/03/2020
	DESCRIPTION:This program calculate the volumen of cilinder
	 */
	Scanner keyboard=new Scanner(System.in);
	System.out.println("This program calculate the volumen of cilinder, input the height(mts):");
	double height, radius, volumen;
	height=keyboard.nextDouble();
	System.out.println("input the radius(mts):");
	radius=keyboard.nextDouble();
	volumen=3.1416*Math.pow(radius,2)*height;
	System.out.println("The volumen is (mts):"+volumen);

    }
}
