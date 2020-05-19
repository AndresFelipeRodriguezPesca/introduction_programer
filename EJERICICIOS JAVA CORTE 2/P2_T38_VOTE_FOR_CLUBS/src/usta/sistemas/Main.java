package usta.sistemas;

import java.util.Scanner;

public class Main {
    public static Scanner keyboard= new Scanner(System.in);
    public static int[][] matrix_votes=new int[123][2];

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/04/16
	Description: This software converts kilometers into miles , miles to kilometers, miles into  yards and upsidedown
	 */
        f_menu();
        f_fill_matrix();
        f_show_winner();

    }
    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|  SoftVotesClubsBars    |");
        System.out.println("| Version 1.0 20200519   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }
    public static void f_fill_matrix(){
        //Description; This method fill the matrix
        for (int i=0;i<matrix_votes.length;i++){
            matrix_votes[i][0]=(int) Math.floor((Math.random()*5000)+1);
            matrix_votes[i][1]=(int) Math.floor((Math.random()*5000)+1);
        }
    }
    public static void f_show_winner(){
        //Description:This method show the winner
        int total_yes=0, total_not=0;
        for (int i=0;i<matrix_votes.length;i++){
            total_not+=matrix_votes[i][0];
            total_yes+=matrix_votes[i][1];
        }
        if (total_not==total_yes) {
            System.out.println("YES and NOT are safe " + total_not);
        }else if(total_not>total_yes) {
            System.out.println("The winner is the NOT:" + total_not + " and the loser is total YES: " + total_yes);
        }else{
            System.out.println("The winner is the YES: "+ total_yes+ " and the loser is total NOT: "+ total_not);

        }
    }

}
