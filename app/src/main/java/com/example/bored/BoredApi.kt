package com.example.bored

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface BoredApi {
    @GET("/api/activity")
    suspend fun getEvent(
    ): RandomEvent

    @GET("/api/activity")
    suspend fun getEventByParticipants(
        @Query("participants") participants: Int
    ): RandomEvent

    @GET("/api/activity")
    suspend fun getEventByAccessibilityAndPriceRange(
        @Query("accessibility") accessibility: Double,
        @Query("minprice") minprice: Double,
        @Query("maxprice") maxprice: Double,
    ): Call<ResponseBody>
}