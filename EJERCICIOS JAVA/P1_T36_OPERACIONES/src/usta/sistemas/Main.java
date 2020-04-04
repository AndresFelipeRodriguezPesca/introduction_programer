package usta.sistemas;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/*AUTHOR: Andres Felipe Rodríguez Pesca
	   DATE: 2020/03/12
	   DESCRIPTION:This software realize many mathematics with four numbers
	 */
        Scanner keyboard = new Scanner(System.in);
        int x, y, suma, difference,product, ratio, rest;
        double n, m, sum_double, difference_double, product_double, ratio_double,rest_double ;
        double  sum_int_double, ratio_int_double, rest_int_double, x_double, y_double, n_double, m_double, var_sum, product_var;

        System.out.println("This software realize many mathematics with four numbers");
        System.out.println(" input the first integer number");
        x = keyboard.nextInt();
        System.out.println("input the second integer number");
        y = keyboard.nextInt();
        System.out.println("input the first double number");
        n = keyboard.nextDouble();
        System.out.println("input the second double number");
        m = keyboard.nextDouble();

        suma = x + y;
        System.out.println("The sumatory is: " + suma);
        difference = x - y;
        System.out.println("The difference between two numbers is: " + difference);
        product = x * y;
        System.out.println("The producto is: " + product);
        ratio = x / y;
        System.out.println("The ratio is " + ratio);
        rest = x % y;
        System.out.println("The rest is" + rest);

        sum_double = n + m;
        System.out.println(" The sum of two numbers is " + sum_double);
        difference_double = n - m;
        System.out.println("the difference is " + difference_double);
        product_double = n * m;
        System.out.println("The product is " + product_double);
        ratio_double = n / m;
        System.out.println("the ratio is " + ratio_double);
        rest_double = n % m;
        System.out.println("The rest is " + rest_double);
        sum_int_double = x + n;
        System.out.println("The sum is " + sum_int_double);
        ratio_int_double = y/m;
        System.out.println("The ratio is " + ratio_int_double);
        rest_int_double=y%m;
        System.out.println("The rest is " + rest_int_double);
        x_double = x * 2;
        System.out.println("The double is " + x_double);
        y_double = y * 2;
        System.out.println("The double is " + y_double);
        n_double = n * 2;
        System.out.println("The double is " + n_double);
        m_double = x * 2;
        System.out.println("The double is " + m_double);
        var_sum = x + y + n + m;
        System.out.println("The sum is " + var_sum);
        product_var = x * y * n * m;
        System.out.println("The product is " + product_var);

        System.out.println("thanks");

    }
}