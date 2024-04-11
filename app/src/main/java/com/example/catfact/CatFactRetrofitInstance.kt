package com.example.catfact

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CatFactRetrofitInstance {
    private val baseURL = "https://catfact.ninja/";

    private val retrofitClient = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofitClient.create(CatFactsApi::class.java)
}