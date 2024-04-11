package com.example.catfact

import com.example.bored.RandomEvent
import retrofit2.http.GET

interface BoredApi {
    @GET("/fact")
    suspend fun getFact(
    ): RandomEvent
}