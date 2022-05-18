package com.example.themoviedb.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET


private const val BASE_URL =
    "https://developers.themoviedb.org"

private val retrofit = Retrofit.Builder()

object MovieApi {
    val retrofitService : MovieApiService by lazy {
        retrofit.create(MovieApiService::class.java) }
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(ScalarsConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

}


class MovieApiService {


    interface MovieApiService {
        @GET("photos")
       suspend fun getPhotos()
    }
}




