package com.example.catfact

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = CatFactRetrofitInstance()
        val fact = instance.apiService.getFact()
        println(fact)
    }
}