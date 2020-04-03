package com.example.bottles.controller;

import com.example.bottles.Lyrics;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.HttpClientErrorException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LyricsControllerTest {

    private Lyrics lyrics;
    private LyricsController lyricsController;

    @BeforeEach
    void setUp() {
        lyrics = mock(Lyrics.class);
        lyricsController = new LyricsController(lyrics);
    }

    @Test
    void shouldReturnAllRequiredVerses() throws Exception {
        String expectedResponse = "6 bottles of beer on the wall, 6 bottles of beer.\n" +
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
        when(lyrics.getVerse(6)).thenReturn(expectedResponse);

        String actualResponse = lyricsController.getLyric(6);

        assertThat(actualResponse).isEqualTo(expectedResponse);
    }

    @Test
    void throwsAnExceptionWhenItsANumberBiggerThan99() {
        assertThatThrownBy(() -> lyricsController.getLyric(100))
                .isInstanceOf(Exception.class)
                .hasMessage("Invalid number of verses. It must be between 0 and 99.");
    }

    @Test
    void throwsAnExceptionWhenItsANumberSmallerThan0() {
        assertThatThrownBy(() -> lyricsController.getLyric(-1))
                .isInstanceOf(Exception.class)
                .hasMessage("Invalid number of verses. It must be between 0 and 99.");
    }
}
