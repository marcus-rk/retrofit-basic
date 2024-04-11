package com.example

import com.example.catfact.CatFact
import com.example.catfact.CatFactRetrofitInstance
import com.example.reqresPOSTexample.ReqresRetrofitInstance
import com.example.reqresPOSTexample.User
import retrofit2.awaitResponse

class Repository (
    private val reqresRetrofitInstance: ReqresRetrofitInstance = ReqresRetrofitInstance(),
    private val catFactRetrofitInstance: CatFactRetrofitInstance = CatFactRetrofitInstance()
) {
    suspend fun registerUser(user: User) {
        val response = reqresRetrofitInstance.apiService.addUser(user).awaitResponse()
        if (response.isSuccessful) {
            println("Succes:" + response.body()?.string())
        } else {
            println("Error ${response.code()}: ${response.errorBody()?.string()}")
        }
    }

    suspend fun loginUser(user: User) {
        val response = reqresRetrofitInstance.apiService.loginUser(user).awaitResponse()
        if (response.isSuccessful) {
            println("Succes:" + response.body()?.string())
        } else {
            println("Error ${response.code()}: ${response.errorBody()?.string()}")
        }
    }

    suspend fun getRandomFact(): CatFact {
        return catFactRetrofitInstance.apiService.getFact()
    }

}