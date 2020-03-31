package com.example.bottles;

public class Lyrics {
    public String getVerse(int bottle) {
        int bottleMinusOne = bottle - 1;

        if (bottle == 2) {
            return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                    "Take one down and pass it around, "+ bottleMinusOne +" bottle of beer on the wall.";
        } else if (bottle == 1) {
            return bottle + " bottle of beer on the wall, " + bottle + " bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.";
        } else if (bottle == 0) {
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.";
        } else {
            return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                    "Take one down and pass it around, "+ bottleMinusOne +" bottles of beer on the wall.";
        }
    }
}
