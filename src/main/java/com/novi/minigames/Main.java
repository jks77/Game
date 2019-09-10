package com.novi.minigames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Get name of player 1
        Scanner input = new Scanner(System.in);
        
       // boolean debug = false;
        
       /*Player John = new Player("frits", '0');
       John.name = "John";
       
       Player player2 = new Player("John", 'x');
       Player.getName();
       
       TicTacToe Jan = new TicTacToe();*/
       
        System.out.println("Speler1, wat is je naam?");
        String speler1 = /*debug ? "Dennis" :*/ input.nextLine();
        
        //Get name of player 2 
        System.out.println("Speler2, wat is je naam");
        String speler2 = input.nextLine();
          
        //int scoreplayerone = 0;
        //int scoreplayertwo = 0;
        //Print Menu
        
        System.out.println("Welk spel wil je spelen?");
        System.out.println("1: Boter Kaas en Eieren");
        System.out.println("2: Vier op een rij");
        System.out.println("0: Stoppen");
        
        //Scanner game = new Scanner(System.in); (niet gebruikt)
        //Get chosen game
        int spel = input.nextInt();
        
        int breedte = 3;
        int aantalVelden = breedte * breedte;
        
        //boolean spelBezig = true;
        //Start chosen game
        if(spel == 1) {
            //start Tic Tac Toe
            char[] velden = new char[9];
            
            // dit maakt array fields[] = [1,2,3,4,5,6,7,8,9];
            for(int i = 0; i < aantalVelden; i++) {
                velden[i] = (char)('1' + i);
            }
            
            // dit maakt de grid in kolommen en rijen
            for(int rij = 0; rij < breedte; rij++) {
                for(int kolom = 0; kolom < breedte; kolom++) {
                    System.out.print(velden[kolom + rij * breedte]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
            
        String huidigeSpeler = speler1;
        char cross = 'X';
        char round = '0';

        for(int i = 0; i < aantalVelden; i++) {
            if(huidigeSpeler == speler1) {
            // player1 is aan de beurt en mag veld noemen
            System.out.println("Huidige speler is: " + huidigeSpeler);
            System.out.println("Kies een veld: ");
            
            // genoemd nummer wordt in fields array gewijzigd naar 'X'
            int antwoordHuidigeSpeler= input.nextInt();
            velden[antwoordHuidigeSpeler - 1] = cross;
            
            // grid wordt opgebouwd maar nu met gewijzigde 'X'
            for(int rij = 0; rij < breedte; rij++) {
                for(int kolom = 0; kolom < breedte; kolom++) {
                    System.out.print(velden[kolom + rij * breedte]);
                    System.out.print(" ");
                }
                System.out.println("");
                huidigeSpeler = speler2;
            } 
            }
            else {
            // player1 is aan de beurt en mag veld noemen
            System.out.println("Huidige speler is: " + huidigeSpeler);
            System.out.println("Kies een veld: ");
            
            // genoemd nummer wordt in fields array gewijzigd naar '0'
            int antwoordHuidigeSpeler = input.nextInt();
            velden[antwoordHuidigeSpeler - 1] = round;
            
            // grid wordt opgebouwd maar nu met gewijzigde '0'
            for(int rij = 0; rij < breedte; rij++) {
                for(int kolom = 0; kolom < breedte; kolom++) {
                    System.out.print(velden[kolom + rij * breedte]);
                    System.out.print(" ");
                }
                System.out.println("");
                huidigeSpeler = speler1;
            }
            }
        }
    }
}
}
    /*if(gridTic[i] == 3) {
                      System.out.println();
                    }
                    if(gridTic[i] == 6) {
                      System.out.println();
                }
            }*/
            /*if(chosengame == 2) {
                // start Four in a row
            }
            if(chosenGame == 0) {
                //  exit
            }
*/          /*
            switch(chosenGame) {
            case 1:
                //Print board
                char[] fields = new char[9];
                for(int i = 0; i < 9; i++) {
                    fields[i] = (char)('1' + i);
                }
                
                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(fields[j + i * 3]);
                    }
                    */
                
                //Use:  Dots and/or numbers for fields 
                //      X's and O's for player pawns
                
                //Print current player
                
                //Get chosen field
                //Change field to current player pawn (X or O)
                
                //If game is won
                    //Print board
                    //Winner gets a point
                    //Print scores
                    //Go back to menu
                
                //If game is not won
                    //Switch players
                    //Start next turn

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jankrijn
 */

    