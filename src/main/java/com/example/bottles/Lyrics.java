package com.example.bottles;

import org.springframework.stereotype.Component;

@Component
public class Lyrics {

    public static final int LAST_VERSE_INDEX = 0;
    public static final int INDEX_OF_FIRST_SPECIFIC_VERSE = 2;

    public String getVerse(int bottle) {
        StringBuilder builder = new StringBuilder();
        for (int index = bottle; index >= LAST_VERSE_INDEX; index--) {
            builder.append(buildVerse(index));
        }
        return builder.toString();
    }

    private String buildVerse(int bottle) {
        return (bottle > INDEX_OF_FIRST_SPECIFIC_VERSE) ?
                buildStandardVerse(bottle) :
                buildSpecificVerse(bottle);
    }

    private String buildStandardVerse(int bottle) {
        return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                "Take one down and pass it around, "+ (bottle - 1) +" bottles of beer on the wall.\n\n";
    }

    private String buildSpecificVerse(int bottle) {
        switch (bottle) {
            case 2:
                return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                        "Take one down and pass it around, "+ (bottle - 1) +" bottle of beer on the wall.\n\n";
            case 1:
                return bottle + " bottle of beer on the wall, " + bottle + " bottle of beer.\n" +
                        "Take one down and pass it around, no more bottles of beer on the wall.\n\n";
            default:
                return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                        "Go to the store and buy some more, 99 bottles of beer on the wall.";
        }
    }
}
