package com.example.customadapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter<String>{

    private final String[] Titles;
    private final String[] Ratings;
    private final int[] Images;

    CustomAdapter(@NonNull Context context, String[] Titles, String[] Ratings, int[] Images) {
        super(context, R.layout.custom_layout, Titles);

        this.Titles = Titles;
        this.Ratings = Ratings;
        this.Images = Images;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater=LayoutInflater.from(getContext());
        @SuppressLint("ViewHolder")

        View customView = inflater.inflate(R.layout.custom_layout, parent,false);

        TextView titleText = customView.findViewById(R.id.movieName);
        ImageView imageView = customView.findViewById(R.id.movieImage);
        TextView ratings = customView.findViewById(R.id.movieRatings);

        titleText.setText(Titles[position]);
        imageView.setImageResource(Images[position]);
        ratings.setText(Ratings[position]);
        
        return customView;
    }
}
