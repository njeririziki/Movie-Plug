package com.njeri.movieplug.screens

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit2.http.GET

class MovieViewModel: ViewModel() {

    init {
        getMoviePhotos()
    }
    fun getMoviePhotos() {
        viewModelScope.launch {
        }
        }
}
