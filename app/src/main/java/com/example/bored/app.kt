package com.example.bored

import com.example.catfact.RetrofitInstance
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstance()
        val fact = instance.apiService.getFact()
        println(fact)
    }
}