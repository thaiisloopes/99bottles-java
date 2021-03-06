package com.example.bottles;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LyricsTest {

    private Lyrics lyrics;

    @BeforeEach
    void setUp() {
        lyrics = new Lyrics();
    }

    @Test
    void shouldReturn99Verse() {
        String expectedVerse = "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.";

        String actualVerse = lyrics.getVersesFrom(99);

        assertThat(actualVerse).contains(expectedVerse);
    }

    @Test
    void shouldReturn12Verse() {
        String expectedVerse = "12 bottles of beer on the wall, 12 bottles of beer.\n" +
                "Take one down and pass it around, 11 bottles of beer on the wall.";

        String actualVerse = lyrics.getVersesFrom(12);

        assertThat(actualVerse).contains(expectedVerse);
    }

    @Test
    void shouldReturn2Verse() {
        String expectedVerse = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.";

        String actualVerse = lyrics.getVersesFrom(2);

        assertThat(actualVerse).contains(expectedVerse);
    }

    @Test
    void shouldReturn1Verse() {
        String expectedVerse = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.";

        String actualVerse = lyrics.getVersesFrom(1);

        assertThat(actualVerse).contains(expectedVerse);
    }

    @Test
    void shouldReturnNoVerse() {
        String expectedVerse = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";

        String actualVerse = lyrics.getVersesFrom(0);

        assertThat(actualVerse).contains(expectedVerse);
    }

    @Test
    void shouldReturnAllRequiredVerses() {
        String expectedVerse = "6 bottles of beer on the wall, 6 bottles of beer.\n" +
                "Take one down and pass it around, 5 bottles of beer on the wall.\n" +
                "\n" +
                "5 bottles of beer on the wall, 5 bottles of beer.\n" +
                "Take one down and pass it around, 4 bottles of beer on the wall.\n" +
                "\n" +
                "4 bottles of beer on the wall, 4 bottles of beer.\n" +
                "Take one down and pass it around, 3 bottles of beer on the wall.\n" +
                "\n" +
                "3 bottles of beer on the wall, 3 bottles of beer.\n" +
                "Take one down and pass it around, 2 bottles of beer on the wall.\n" +
                "\n" +
                "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.\n" +
                "\n" +
                "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";

        String actualVerse = lyrics.getVersesFrom(6);

        assertThat(actualVerse).isEqualTo(expectedVerse);
    }
}