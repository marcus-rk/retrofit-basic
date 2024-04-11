package com.example.bored

import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {
        val instance = RetrofitInstance()

        val fact = instance.apiService.getEvent()
        println("Random fact\n$fact")

        print("\nInsert amount of participants: ")
        val participantsInput = readlnOrNull()?.toInt()
        val factByParticipants = instance.apiService.getEventByParticipants(participantsInput!!)
        println(factByParticipants)
    }
}