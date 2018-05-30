package com.example.user.bestsellingmanga;

import java.io.Serializable;

public class Manga implements Serializable {

    private Integer ranking;
    private String title;
    private String mangaSold;

    public Manga(Integer ranking, String title, String mangaSold) {
        this.ranking = ranking;
        this.title = title;
        this.mangaSold = mangaSold;
    }

    public Integer getRanking() {
        return ranking;
    }

    public String getTitle() {
        return title;
    }

    public String getNumberOfCopiesSold() {
        return mangaSold;
    }
}
