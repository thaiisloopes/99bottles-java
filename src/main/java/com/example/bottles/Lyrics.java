package com.example.bottles;

public class Lyrics {
    public String getVerse(int bottle) {
        int bottleminusOne = bottle -1;
        return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                "Take one down and pass it around, "+ bottleminusOne +" bottles of beer on the wall.";
    }
}
