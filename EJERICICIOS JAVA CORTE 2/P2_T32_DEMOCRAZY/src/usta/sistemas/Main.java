package usta.sistemas;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* Author: Andres Felipe Rodriguez
	Date: 2020/05/07
	Description: Generate votes for N candidates
	 */
        int total_votes = f_menu_total_people();
        int[] vector_votes = f_fill_vectors_votes(total_votes);
        f_show_winner(vector_votes);
        f_show_all_votes(vector_votes);

    }

    public static int f_menu_total_people() {
        System.out.println("╔══════════════════════════╗");
        System.out.println("║     SoftDemocracy        ║");
        System.out.println("║  Maker: Felipe Rodriguez ║");
        System.out.println("║  Date:2020-may-07        ║");
        System.out.println("╚══════════════════════════╝");
        Scanner keyboard = new Scanner(System.in);
        int total_candidates = keyboard.nextInt();
        System.out.println("Input the total people");
        while (total_candidates < 2) {
            System.err.println("ERROR:The total people cant be than 2");
            System.out.println("Input again the total candidates");
        }
        return total_candidates;
    }

    public static int[] f_fill_vectors_votes(int total_votes) {
        //Description: This method return a vector with votes
        int[] vector_votes = new int[total_votes];
        for (int i = 0; i < total_votes; i++) {
            vector_votes[i] = (int) Math.floor(Math.random() * (5000) + 1);
        }
        return vector_votes;
    }

    public static void f_show_winner(int[] vector_votes) {
        //Description:This method show the winner candidate
        int winner_votes = 0, winner_number = 0;
        for (int i = 0; i < vector_votes.length; i++) {
            if (i == 0) {
                winner_votes = vector_votes[i];
            } else {
                if (vector_votes[i] > winner_votes) {
                    winner_votes = vector_votes[i];
                    winner_number = i;

                }

            }
        }
        System.out.println("The winner candidates is: " + winner_number + " with total votes " + winner_votes);
        f_shows_the_second_candidate(vector_votes,winner_number);
    }

    public static void f_shows_the_second_candidate(int[] vector_votes, int winner) {
        //Description: This method show the second candidate
        int second_candidate = 0, second_votes = 0;
        for (int i = 0; i < vector_votes.length; i++) {
            if (winner!=i){
                if (second_votes<vector_votes[i]) {
                    second_votes= vector_votes[i];
                    second_candidate=i;
                }

                }

            }
        System.out.println("The second candidate is: " +second_candidate+ " with total votes = "+second_votes);
        }
        public static void f_show_all_votes( int[] vector_votes ){
        //Description: This method show the total votes
            int total_votes=0;
           for (int i=0; i<vector_votes.length; i++){
               System.out.println("The votes of the candidates ("+(i+1)+") is:"+vector_votes[i]);
           }
            System.out.println("The total votes is: "+ total_votes);
        }
    }
