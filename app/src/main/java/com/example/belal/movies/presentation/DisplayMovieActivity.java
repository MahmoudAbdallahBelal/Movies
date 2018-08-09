package com.example.belal.movies.presentation;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.belal.movies.R;
import com.example.belal.movies.presentation.movies_list.MoviesListFragment;

public class DisplayMovieActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_movie);

        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.constrain_container, new MoviesListFragment());
        ft.commit();


    }
}
