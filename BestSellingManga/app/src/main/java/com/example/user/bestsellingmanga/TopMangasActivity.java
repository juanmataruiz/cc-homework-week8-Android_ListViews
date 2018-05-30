package com.example.user.bestsellingmanga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopMangasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_mangas);

        TopMangas topMangas = new TopMangas();
        ArrayList<Manga> list = topMangas.getList();

        TopMangasAdapter mangasAdapter = new TopMangasAdapter(this, list);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(mangasAdapter);
    }

    public void onListItemView(View listItem) {
        Manga manga = (Manga) listItem.getTag();
        Log.d("Manga Title: ", manga.getTitle());

        Intent intent = new Intent(this, MangaActivity.class);
        intent.putExtra("manga", manga);
        startActivity(intent);

    }
}
