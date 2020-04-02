package com.example.bottles.controller;

import com.example.bottles.Lyrics;

public class LyricsController {
    private Lyrics lyrics;

    public LyricsController(Lyrics lyrics) {
        this.lyrics = lyrics;
    }

    public String getLyric(int bottleQuantity) {
        return lyrics.getVerse(bottleQuantity);
    }
}
