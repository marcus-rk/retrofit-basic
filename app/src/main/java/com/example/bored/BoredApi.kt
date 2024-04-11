package com.example.bored

import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface BoredApi {
    @GET("/api/activity")
    suspend fun getEvent(
    ): RandomEvent

    @GET("/api/activity")
    suspend fun getEventByParticipants(
        @Query("participants") participants: Int
    ): RandomEvent
}