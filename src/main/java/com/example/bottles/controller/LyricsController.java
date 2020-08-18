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

    @GetMapping(value = "{bottlesQuantity}")
    public String getLyric(@PathVariable int bottlesQuantity) throws Exception {
        if(bottlesQuantity > 99 || bottlesQuantity < 0) {
            throw new Exception("Invalid number of verses. It must be between 0 and 99.");
        }

        return lyrics.getVersesFrom(bottlesQuantity);
    }
}
