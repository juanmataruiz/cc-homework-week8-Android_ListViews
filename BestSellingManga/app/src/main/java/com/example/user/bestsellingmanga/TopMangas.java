package com.example.user.bestsellingmanga;

        import java.util.ArrayList;

public class TopMangas {

    private ArrayList<Manga> list;

    public TopMangas() {
        list = new ArrayList<Manga>();
        list.add(new Manga(1, "One Piece", "440 million"));
        list.add(new Manga(2, "Dragon Ball", "240 million"));
        list.add(new Manga(3, "Naruto", "235 million"));
        list.add(new Manga(4, "Case Closed/Detective Conan", "200 million"));
        list.add(new Manga(5, "Golgo 13", "200 million"));
    }

    public ArrayList<Manga> getList() {
        return new ArrayList<Manga>(list);
    }
}
