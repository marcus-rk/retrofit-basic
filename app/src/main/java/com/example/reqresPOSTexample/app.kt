package com.example.reqresPOSTexample

import com.example.Repository
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val repository: Repository = Repository()

        val userSuccess = User("eve.holt@reqres.in", "pistol");
        val userFailed = User("mail@mail.com", "password");

        // Register
        println("Register")
        repository.registerUser(userSuccess)
        repository.registerUser(userFailed)

        // Login
        println("\nLogin")
        repository.loginUser(userSuccess)
        repository.loginUser(userFailed)

        // Random fact
        println("\nRandom Fact")
        println(repository.getRandomFact())
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