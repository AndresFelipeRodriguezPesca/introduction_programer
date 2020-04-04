package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* AUTHOR: Andres Felipe Rodriguez
	DATE: 1/04/2020
	DESCRIPTION: This software calculates the shipping cost  of the
	 */
        Scanner keyboard= new Scanner(System.in);
        int p1,p2,p3,p4,p5,destiny, total_bill;
        f_menu();
        System.out.println("input the price oof the  firsts product");
        p1= keyboard.nextInt();
        System.out.println("input the price of the second product ");
        p2= keyboard.nextInt();
        System.out.println("input the price of the third product ");
        p3= keyboard.nextInt();
        System.out.println("input the price of the fourth product ");
        p4= keyboard.nextInt();
        System.out.println("input the price of the five product");
        p5= keyboard.nextInt();
        System.out.println("input the destiny  (1=North America,  2=central america, 3=south america,4=europe, 5=  asia) ");
        destiny = keyboard.nextInt();
        total_bill=p1+p2+p3+p4+p5+f_parcel_services(destiny);
        System.out.println("the total bill is "+ total_bill);
    }
    public static void f_menu (){
        //description: This function show the menu
        System.out.println("------------------------");
        System.out.println("      soft calculate    ");
        System.out.println("Version 1.0 2020 april 1");
        System.out.println("Created by: felipe rodri");
        System.out.println("------------------------");


    }
    public static int f_parcel_services(int p_destiny){
       //  DESCRIPTION: This software calculates the cost of parcel services
    int valor;
    if(p_destiny==1){
        valor=11;

    } else if (p_destiny== 2){
        valor=10;
    } else if (p_destiny==3){
        valor=12;
    } else if (p_destiny==4){
        valor=24;
    } else if (p_destiny==5){
        valor=27;
    } else{
        System.err.println("ERROR: destiny not found");
        valor=0;
         }
    return valor;
      }
}
