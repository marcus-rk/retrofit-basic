package com.example.bored

import com.example.catfact.CatFact
import retrofit2.http.GET

interface BoredApi {
    @GET("/activity")
    suspend fun getEvent(
    ): RandomEvent
}