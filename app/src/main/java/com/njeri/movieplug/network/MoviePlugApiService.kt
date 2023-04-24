package com.njeri.movieplug.network


import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL =
    "https://android-kotlin-fun-mars-server.appspot.com"

private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface MoviePlugApiService{
    @GET("photos")
    fun getMoviePhotos(): String
//    List<MoviesPhoto>
}
object MoviePlugApi {
    val retrofitService : MoviePlugApiService by lazy {
        retrofit.create(MoviePlugApiService::class.java)
    }
}