package com.example.reqresPOSTexample

import kotlinx.coroutines.runBlocking
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.awaitResponse

fun main() {
    runBlocking {
        val api = RetrofitInstance()
        val userSuccess = User("eve.holt@reqres.in", "pistol");
        val userFailed = User("mail@mail.com", "password");

        println("Register")
        val response1 = api.apiService.addUser(userSuccess).awaitResponse()
        if (response1.isSuccessful) {
            println("Succes:" + response1.body()?.string())
        } else {
            println("Error ${response1.code()}: ${response1.errorBody()?.string()}")
        }

        val response2 = api.apiService.addUser(userFailed).awaitResponse()
        if (response2.isSuccessful) {
            println("Succes:" + response2.body()?.string())
        } else {
            println("Error ${response2.code()}: ${response2.errorBody()?.string()}")
        }

        // Login
        println("\nLogin")
        val response3 = api.apiService.loginUser(userSuccess).awaitResponse()
        if (response3.isSuccessful) {
            println("Succes:" + response3.body()?.string())
        } else {
            println("Error ${response3.code()}: ${response3.errorBody()?.string()}")
        }

        val response4 = api.apiService.loginUser(userFailed).awaitResponse()
        if (response4.isSuccessful) {
            println("Succes:" + response4.body()?.string())
        } else {
            println("Error ${response4.code()}: ${response4.errorBody()?.string()}")
        }
    }

    //Below is one way of handling the response concurrently by the retrofit framework
    /*
    val response = api.apiService.addUser(user).enqueue(object : Callback<ResponseBody> {
        override fun onResponse(call: Call<ResponseBody>, response: Response<ResponseBody>) {
            println(response.body()?.string())
        }

        override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
        }
    })
     */
}