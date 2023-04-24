package com.njeri.movieplug

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.njeri.movieplug.ui.theme.MoviePlugTheme
import retrofit2.http.GET

@Composable
fun MoviePlugApp(){

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MoviePlugTheme {
        MoviePlugApp()
    }
}