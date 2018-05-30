package com.example.user.bestsellingmanga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class TopMangasAdapter extends ArrayAdapter<Manga> {

    public TopMangasAdapter(Context context, ArrayList<Manga> mangas) {
        super(context,0, mangas);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.mangas_items, parent, false);
        }

        Manga currentManga = getItem(position);

        TextView ranking = listItemView.findViewById(R.id.ranking);
        ranking.setText(currentManga.getRanking().toString());

        TextView title = listItemView.findViewById(R.id.title);
        title.setText(currentManga.getTitle().toString());

        TextView year = listItemView.findViewById(R.id.mangaSold);
        year.setText(currentManga.getNumberOfCopiesSold().toString());

        listItemView.setTag(currentManga);

        return listItemView;
    }


}
