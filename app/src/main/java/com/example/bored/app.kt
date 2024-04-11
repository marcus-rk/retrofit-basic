package com.example.bored

import kotlinx.coroutines.runBlocking
import retrofit2.awaitResponse

fun main() {
    runBlocking {
        val instance = RetrofitInstance()

        val fact = instance.apiService.getEvent()
        println("Random fact\n$fact")

        print("\nInsert amount of participants: ")
        val participantsInput = readlnOrNull()?.toInt()
        val factByParticipants = instance.apiService.getEventByParticipants(participantsInput!!)
        println(factByParticipants)

        /*
        println("\nRandom fact by accessibility and price-range")
        print("Insert accessibility: ")
        val accessibilityInput = readlnOrNull()?.toDouble()
        print("Insert min-price: ")
        val minPriceInput = readlnOrNull()?.toDouble()
        print("Insert max-price: ")
        val maxPriceInput = readlnOrNull()?.toDouble()

        try {
            val factByAccessibilityAndPriceRangeResponse = instance.apiService.getEventByAccessibilityAndPriceRange(
                accessibilityInput!!,
                minPriceInput!!,
                maxPriceInput!!
            ).awaitResponse()

            println(factByAccessibilityAndPriceRangeResponse.toString())
            println(factByAccessibilityAndPriceRangeResponse.message())
            println(factByAccessibilityAndPriceRangeResponse.isSuccessful)

            if (factByAccessibilityAndPriceRangeResponse.isSuccessful) {
                println("Success!")
                println(factByAccessibilityAndPriceRangeResponse.body()?.string())
            } else {
                println("Failure")
            }
        } catch (e: Exception) {
            println("Request failed: ${e.message}")
        }
         */

    }
}