package com.example.user.bestsellingmanga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MangaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manga);

        Intent intent = getIntent();
        Manga manga = (Manga) intent.getSerializableExtra("manga");
        Log.d("MangaActivity: ", manga.getTitle());
    }


}
