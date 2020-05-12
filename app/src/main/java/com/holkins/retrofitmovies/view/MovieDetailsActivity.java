package com.holkins.retrofitmovies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.holkins.retrofitmovies.R;
import com.holkins.retrofitmovies.model.Result;

public class MovieDetailsActivity extends AppCompatActivity {

    private Result result;
    private ActivityMovieDetailsBinding activityMovieDetailsBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        activityMovieDetailsBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_movie_details);

        Intent intent = getIntent();

        if (intent != null && intent.hasExtra("movieData")) {

            result = intent.getParcelableExtra("movieData");
            activityMovieDetailsBinding.setResult(result);

        }

    }
}
