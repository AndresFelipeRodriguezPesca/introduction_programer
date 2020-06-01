package usta.sistemas;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
	/* AYTHOR: AFRP
	DATE:2020/05/28
	DESCRIPTION:
	 */
        try{
            PrintWriter admin_files= new PrintWriter("C:/Users/Public/Documents/prueba.txt");
            admin_files.println("first line");
            admin_files.println("second line");
            admin_files.close();

        }catch (Exception e){
            System.err.println("ERR: the software is finish because ");
            e.printStackTrace();
        }

    }
}
