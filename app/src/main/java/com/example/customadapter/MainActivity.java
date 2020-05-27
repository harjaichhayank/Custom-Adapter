package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    int[] moviePosters = {R.drawable.movie_1,R.drawable.movie_2,R.drawable.movie_3,
            R.drawable.movie_4,R.drawable.movie_5,R.drawable.movie_6,
            R.drawable.movie_7,R.drawable.movie_8,R.drawable.movie_9,R.drawable.movie_10,};
    String[] movieTitles;
    String[] movieRatings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieTitles = getResources().getStringArray(R.array.Top_10_movies);
        movieRatings = getResources().getStringArray(R.array.Movie_ratings);

        CustomAdapter adapter = new CustomAdapter(this, movieTitles, movieRatings, moviePosters);
        listView = findViewById(R.id.List_view);
        listView.setAdapter(adapter);
    }
}
