package com.example.bottles;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LyricsTest {

    @Test
    void shouldReturn99Verse() {
        //given
        String expectedVerse = "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.";
        Lyrics lyrics = new Lyrics();

        //when
        String actualVerse = lyrics.getVerse(99);

        //then
        assertThat(actualVerse).isEqualTo(expectedVerse);
    }

    @Test
    void shouldReturn12Verse() {
        //given
        String expectedVerse = "12 bottles of beer on the wall, 12 bottles of beer.\n" +
                "Take one down and pass it around, 11 bottles of beer on the wall.";
        Lyrics lyrics = new Lyrics();

        //when
        String actualVerse = lyrics.getVerse(12);

        //then
        assertThat(actualVerse).isEqualTo(expectedVerse);
    }

    @Test
    void shouldReturn2Verse() {
        //given
        String expectedVerse = "2 bottles of beer on the wall, 2 bottles of beer.\n" +
                "Take one down and pass it around, 1 bottle of beer on the wall.";
        Lyrics lyrics = new Lyrics();

        //when
        String actualVerse = lyrics.getVerse(2);

        //then
        assertThat(actualVerse).isEqualTo(expectedVerse);
    }

    @Test
    void shouldReturn1Verse() {
        //given
        String expectedVerse = "1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.";
        Lyrics lyrics = new Lyrics();

        //when
        String actualVerse = lyrics.getVerse(1);

        //then
        assertThat(actualVerse).isEqualTo(expectedVerse);
    }

    @Test
    void shouldReturnNoVerse() {
        //given
        String expectedVerse = "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.";
        Lyrics lyrics = new Lyrics();

        //when
        String actualVerse = lyrics.getVerse(0);

        //then
        assertThat(actualVerse).isEqualTo(expectedVerse);
    }
}