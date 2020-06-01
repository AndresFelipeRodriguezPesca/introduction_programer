package usta.sistemas;

import java.util.Scanner;

public class Main {
    public static int[][] matrix_votes = new int[123][8];
    public static int[] total_votes = new int[8];
    public static String[] vector_parties = {"liberal", "Conservador", "Alianza Verde", "La u", "Cambio Radical"," Centro Democratico","MIRA", "polo "};
    public static int winner_votes;
    public static int winner_columns;

    public static void main(String[] args) {
    /* Author: Andres felipe rodriguez pesca
    Date: 21/05/2020
    Description:Perform the simulation of a voting process for the Boyacá governorate
    where there are seven (7) candidates from the main political parties in Colombia
    */
        f_menu();
        f_fill_matrix();
        f_total_votes();
        for (int i=0; i<total_votes.length;i++){
            System.out.println(" Politic party "+vector_parties[i]+" total votes "+total_votes[i]);
        }
        f_show_winner_and_Second();
    }

    public static void f_menu() {
        //Description: This method show the menu of this software
        System.out.println("--------------------------");
        System.out.println("|  SoftVotesGovernate    |");
        System.out.println("| Version 1.0 20200521   |");
        System.out.println("| Created by: AFRP       |");
        System.out.println("--------------------------");
    }

    public static void f_fill_matrix() {
        for (int i = 0; i < matrix_votes.length; i++) {
            for (int j = 0; j < matrix_votes[0].length; j++) {
                matrix_votes[i][j] = (int) Math.floor((Math.random() * 1000) + 1);
            }
        }
    }

    public static void f_total_votes() {
        //Description: This method calculate the total votes for every parties
        for (int j = 0; j < matrix_votes[0].length; j++) {
            for (int i = 0; i < matrix_votes.length; i++) {
                total_votes[j] += matrix_votes[i][j];
            }
        }

    }
    public static void f_show_winner_and_Second(){
        //Description:This method walks the vector total_votes
        winner_votes=total_votes[0];
        int loser_votes=total_votes[0],loser_column=0;
        for (int k=1; k<total_votes.length; k++){
            if (winner_votes<total_votes[k]){
                winner_votes=total_votes[k];
                winner_columns=k;
            }
        }
        for (int k=0;k<total_votes.length;k++){
            if (winner_columns!=k){
                if (loser_votes<total_votes[k])
                loser_votes=total_votes[k];
               loser_column=k;
            }
        }
        System.out.println("--------\nThe winner is "+ vector_parties[winner_columns]+ " total votes " +total_votes[winner_columns] );
        System.out.println("The second place is: "+ vector_parties[loser_column]+ " total votes "+ total_votes[loser_column] );
    }


}

