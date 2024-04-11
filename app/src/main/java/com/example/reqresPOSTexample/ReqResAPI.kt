package com.example.reqresPOSTexample

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ReqResAPI {
    @Headers("Content-Type: application/json")
    @POST("/api/register")
    fun addUser(@Body userData: User): Call<ResponseBody>

    @Headers("Content-Type: application/json")
    @POST("/api/login")
    fun loginUser(@Body userData: User): Call<ResponseBody>
}