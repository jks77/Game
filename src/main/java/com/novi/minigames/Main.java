package com.novi.minigames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // vraag om namen spelers
        Scanner input = new Scanner(System.in);
        System.out.println("Speler1, wat is je naam?");
        String speler1 = /*debug ? "Dennis" :*/ input.nextLine();
        
        Player player1 = new Player(speler1, 'X');
                
        System.out.println("Speler2, wat is je naam");
        String speler2 = input.nextLine();
        
        Player player2 = new Player(speler2, '0');
        
        //int scoreplayerone = 0;
        //int scoreplayertwo = 0;
        //Print Menu
        
        // verzoek spelers om een spel te kiezen
        System.out.println("Welk spel wil je spelen?");
        System.out.println("1: Boter Kaas en Eieren");
        System.out.println("2: Vier op een rij");
        System.out.println("0: Stoppen");
        
        //Scanner game = new Scanner(System.in); (niet gebruikt)
        //Get chosen game
        
        // keuze spel
        int spel = input.nextInt();
        
        // breedte spel tictactoe
        int breedte = 3;
        int aantalVelden = breedte * breedte;
        
        //Start chosen game
        if(spel == 1) {
            //start Tic Tac Toe
            char[] velden = new char[aantalVelden];
            
            // dit maakt array velden[aantalVelden] , bij tictactoe velden[1,2,3,4,5,6,7,8,9];
            for(int i = 0; i < aantalVelden; i++) {
                velden[i] = (char)('1' + i);
            }
            
            // dit maakt het veld in kolommen en rijen
            for(int rij = 0; rij < breedte; rij++) {
                for(int kolom = 0; kolom < breedte; kolom++) {
                    System.out.print(velden[kolom + rij * breedte]);
                    System.out.print(" ");
                }
                System.out.println("");
            }
            
        String huidigeSpeler = player1.getNaam();
        //char kruis = 'X';
        //char rondje = '0';
        
        boolean spelSpeelt = true;
        
        while(spelSpeelt) {
        for(int i = 0; i < aantalVelden; i++) {
            if(huidigeSpeler == player1.getNaam()) {
            // player1 is aan de beurt en mag veld noemen
            System.out.println("Huidige speler is: " + huidigeSpeler);
            System.out.println("Kies een veld: ");
            
            // genoemd nummer wordt in velden array gewijzigd naar 'X'
            int antwoordHuidigeSpeler= input.nextInt();
            velden[antwoordHuidigeSpeler - 1] = player1.getSymbool();
            
            // grid wordt opgebouwd maar nu met gewijzigde 'X'
            for(int rij = 0; rij < breedte; rij++) {
                for(int kolom = 0; kolom < breedte; kolom++) {
                    System.out.print(velden[kolom + rij * breedte]);
                    System.out.print(" ");
                }            
            System.out.println("");
            huidigeSpeler = player2.getNaam();
            }
            }
                        
            else {
            
            // player1 is aan de beurt en mag veld noemen
            System.out.println("Huidige speler is: " + huidigeSpeler);
            System.out.println("Kies een veld: ");
            
            // genoemd nummer wordt in fields array gewijzigd naar '0'
            int antwoordHuidigeSpeler = input.nextInt();
            velden[antwoordHuidigeSpeler - 1] = player2.getSymbool();
            
            // grid wordt opgebouwd maar nu met gewijzigde '0'
            for(int rij = 0; rij < breedte; rij++) {
                for(int kolom = 0; kolom < breedte; kolom++) {
                    System.out.print(velden[kolom + rij * breedte]);
                    System.out.print(" ");
                }
                System.out.println("");
                } 
                huidigeSpeler = player1.getNaam(); 
            }
            if(velden[0] == player1.getSymbool() && velden[1] == player1.getSymbool() && velden[2] == player1.getSymbool() || velden[3] == player1.getSymbool()
                    && velden[4] == player1.getSymbool() && velden[5] == player1.getSymbool() || velden[6] == player1.getSymbool() && velden[7] == player1.getSymbool()
                    && velden[8] == player1.getSymbool()) {
                System.out.println("gefeliciteerd");
                spelSpeelt = false;
                System.out.println(spelSpeelt);
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

    