package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
    /* AUTHOR: Andres Felipe Rodriguez Pesca
	DATE:2020/05/14
	DESCRIPTION:
	 */
        f_menu();
        String[][] matrix_names = {{"maria", "pedro", "JOSE", "camilo", "rodrigo"},
                {"Ana", "Lucia", "Martha", "Juliana", "Patricia"},
                {"Felipe", "ALEXANDER", "soffy", "Carmen", "Augusto"},
                {"Alfredo", "Luis", "Ramiro", "Karen", "ANDREA"}};
        matrix_names = f_replace_vowels(matrix_names);
        System.out.println("-------------show matrix----------");
        for (int i = 0; i < matrix_names.length; i++) {
            System.out.print("\n(" + (i + 1) + ")=");
            for (int j = 0; j < matrix_names[0].length; j++) {
                System.out.print(" | " + matrix_names[i][j] + " ");
            }
        }
    }

    public static void f_menu() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("╔══════════════════════════╗");
        System.out.println("║   SoftConvertWorks       ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-14        ║");
        System.out.println("╚══════════════════════════╝");
        System.out.println("this program creates a 4*5 matrix with the people names");
    }

    public static String[][] f_replace_vowels(String[][] matrix_names) {
        for (int i = 0; i < matrix_names.length; i++) {
            for (int j = 0; j < 5; j++) {
                matrix_names[i][j] = matrix_names[i][j].toUpperCase().replace("A", "@").
                        replace("E", "3").replace("I", "1").
                        replace("O", "®").replace("U", "⌂");
            }
        }
        return matrix_names;
    }
}
