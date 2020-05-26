package com.example.bottles;

import org.springframework.stereotype.Component;

@Component
public class Lyrics {

    public String getVersesFrom(int initialVerse, int finalVerse) {
        StringBuilder builder = new StringBuilder();
        for (int index = initialVerse; index >= finalVerse; index--) {
            builder.append(buildVerse(index));
        }
        return builder.toString();
    }

    private String buildVerse(int bottle) {
        switch (bottle) {
            case 0:
                return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.";
            case 1:
                return bottle + " bottle of beer on the wall, " + bottle + " bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.\n\n";
            case 2:
                return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                        "Take one down and pass it around, "+ (bottle - 1) +" bottle of beer on the wall.\n\n";
            default:
                return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                        "Take one down and pass it around, "+ (bottle - 1) +" bottles of beer on the wall.\n\n";
        }
    }
}
