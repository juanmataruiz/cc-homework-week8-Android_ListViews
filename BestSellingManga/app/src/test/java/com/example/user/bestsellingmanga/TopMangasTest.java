package com.example.user.bestsellingmanga;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TopMangasTest {

    @Test
    public void getListOfMangas() {
        TopMangas topMangas = new TopMangas();
        assertEquals(5, topMangas.getList().size());
    }
}
