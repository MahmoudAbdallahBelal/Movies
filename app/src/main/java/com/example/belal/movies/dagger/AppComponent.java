package com.example.belal.movies.dagger;


import com.example.belal.movies.presentation.DisplayMovieActivity;
import com.example.belal.movies.presentation.movies_list.MoviesListFragment;
import com.example.belal.movies.presentation.movies_list.MoviesListPresenter;

import javax.inject.Singleton;

import dagger.Component;


// this class created for register who need inject
@Singleton
@Component(modules = {AppModule.class, NetworkModule.class,PresenterModule.class})
public interface AppComponent {

   // void inject(DisplayMovieActivity displayMovieActivity );

    //register main activity it will need objects for injection
    void inject(MoviesListFragment moviesListFragment);

    //register MainPresenter it will need objects for injection
    void inject(MoviesListPresenter moviesListPresenter);


}
