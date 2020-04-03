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

    @GetMapping(value = "{bottleQuantity}")
    public String getLyric(@PathVariable int bottleQuantity) throws Exception {
        if(bottleQuantity > 99 || bottleQuantity < 0) {
            throw new Exception("");
        }

        return lyrics.getVerse(bottleQuantity);
    }
}
