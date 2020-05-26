package com.example.bottles.controller;

import com.example.bottles.Lyrics;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("lyrics")
public class LyricsController {
    private Lyrics lyrics;

    public LyricsController(Lyrics lyrics) {
        this.lyrics = lyrics;
    }

    @GetMapping(value = "{initialBottleVerse}")
    public String getLyric(@PathVariable int initialBottleVerse,
                           @PathVariable int finalBottleVerse) throws Exception {
        if(initialBottleVerse > 99 || initialBottleVerse < 0) {
            throw new Exception("Invalid number of verses. It must be between 0 and 99.");
        }

        return lyrics.getVersesFrom(initialBottleVerse, finalBottleVerse);
    }
}
