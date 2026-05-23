package com.example.kotlinpractice.exercises.buoi3

class Bai5_FindElementExercise {

    fun run() {
        val users = listOf("An", "Bao", "Cuong")

        val result = users.find { user ->
            user == "Bao"
        } ?: "Not found"

        println(result)
    }
}