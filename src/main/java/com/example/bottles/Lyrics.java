package com.example.bottles;

public class Lyrics {

    public String getVerse(int bottle) {
        StringBuffer sb = new StringBuffer();
        for (int i = bottle; i >= 0; i--) {
            sb.append(buildVerse(i));
        }
        return sb.toString();
    }

    private String buildVerse(int bottle) {
        int bottleMinusOne = bottle - 1;

        return (bottle > 2) ?
                buildStandardVerse(bottle, bottleMinusOne) :
                buildSpecificVerse(bottle, bottleMinusOne);
    }

    private String buildStandardVerse(int bottle, int bottleMinusOne) {
        return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                "Take one down and pass it around, "+ bottleMinusOne +" bottles of beer on the wall.\n\n";
    }

    private String buildSpecificVerse(int bottle, int bottleMinusOne) {
        if (bottle == 2) {
            return bottle+ " bottles of beer on the wall, "+ bottle + " bottles of beer.\n"+
                    "Take one down and pass it around, "+ bottleMinusOne +" bottle of beer on the wall.\n\n";
        } else if (bottle == 1) {
            return bottle + " bottle of beer on the wall, " + bottle + " bottle of beer.\n" +
                    "Take one down and pass it around, no more bottles of beer on the wall.\n\n";
        } else {
            return "No more bottles of beer on the wall, no more bottles of beer.\n" +
                    "Go to the store and buy some more, 99 bottles of beer on the wall.";
        }
    }
}
