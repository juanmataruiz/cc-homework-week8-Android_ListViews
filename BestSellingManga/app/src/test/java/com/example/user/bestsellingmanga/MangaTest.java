package com.example.user.bestsellingmanga;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MangaTest {

    Manga manga;

    @Before
    public void setup() {
        manga = new Manga(21, "Hajime no Ippo", "$94 million");
    }

    @Test
    public void getMangaRanking() {
        assertEquals((Integer) 21, manga.getRanking());
    }

    @Test
    public void getMangaTitle() {
        assertEquals("Hajime no Ippo", manga.getTitle());
    }

    @Test
    public void getMangaNumberOfCopiesSold() {
        assertEquals("$94 million", manga.getNumberOfCopiesSold());
    }
}
