package sistemas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Rodriguez
	DATE: 19/03/2020
	DESCRIPTION:This program calculate the hipotenusa the triangle
	 */
	Scanner keyboard= new Scanner(System.in);
	System.out.println("This program calculate the hipotenusa the triangle, input the first leg (mts): ");
	double c1, c2, hip;
	c1= keyboard.nextDouble();
	System.out.println("input the second leg");
	c2=keyboard.nextDouble();
	hip=Math.sqrt(Math.pow(c1,2)+Math.pow(c2,2));
	System.out.println("This hipotenusa is (mts):"+hip);
    }
}
