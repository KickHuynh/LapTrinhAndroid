package com.example.kotlinpractice.exercises.buoi3

class Bai6_RemoveNullExercise {

    fun run() {
        val names = listOf("An", null, "Bao", null)

        val result = names.filterNotNull()

        println(result)
    }
}