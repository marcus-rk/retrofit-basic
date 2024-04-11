package com.example.reqresPOSTexample

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ReqresRetrofitInstance {
    private val baseURL = "https://reqres.in/api/";

    private val retrofitClient = Retrofit.Builder()
        .baseUrl(baseURL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofitClient.create(ReqResAPI::class.java)
}