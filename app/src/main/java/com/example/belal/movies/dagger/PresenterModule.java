package com.example.belal.movies.dagger;




import android.content.Context;

import com.example.belal.movies.presentation.movies_list.MoviesListPresenter;
import com.example.belal.movies.presentation.movies_list.MoviesListView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


//this class created to put  providers for Presenters

@Module
public class PresenterModule {


    @Provides
    @Singleton
    MoviesListPresenter provideMoviePresenterPresenter(Context context) {
        return new MoviesListPresenter(context);
    }




}

