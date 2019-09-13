package com.novi.minigames;

public class Player {
    public String naam;
    private char symbool;
    private int score;
    
    public Player(String naam, char symbool) {
        this.naam = naam;
        this.symbool = symbool;
    }
    
    public String getNaam() {
        return naam;
    }
    
    public char getSymbool() {
        return symbool;
    }
    
    public int getScore() {
        return score;
    }
    
    public void addScore() {
        score++;
    }
}
