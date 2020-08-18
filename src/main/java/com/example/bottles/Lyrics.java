package com.example.bottles;

import org.springframework.stereotype.Component;

@Component
public class Lyrics {

    public String getVersesFrom(int initialVerse) {
        StringBuilder builder = new StringBuilder();
        for (int index = initialVerse; index >= 0; index--) {
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
            default:
                return bottle + " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                        "Take one down and pass it around, " + (bottle - 1) + " " + container(bottle - 1) + " of beer on the wall.\n\n";
        }
    }

    private String container(int numberOfBottles) {
        return (numberOfBottles == 1) ? "bottle" : "bottles";
    }

}
