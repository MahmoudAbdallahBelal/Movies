package com.example.belal.movies.presentation.movies_list;

import android.content.Context;
import android.graphics.Color;

import com.example.belal.movies.dagger.DaggerApplication;
import com.example.belal.movies.data.movie_response.MoviesResponse;
import com.example.belal.movies.presentation.base.BasePresenter;
import com.example.belal.movies.presentation.base.BaseView;

import java.util.List;

/**
 * Created by belal on 8/9/18.
 */

public interface MoviesListView extends  BaseView {

    void  showSuccessMessage(String message);
    void  showErrorMessage(String message);
    void  showMoviesList(MoviesResponse moviesResponse);



    public  interface MoviesPresenter extends BasePresenter<MoviesListView> {


       void returnMoviesList();

    }


}
