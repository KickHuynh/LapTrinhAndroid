package com.example.kotlinpractice.exercises.buoi3

class Bai4_FilterAndTransformExercise {

    fun run() {
        val scores = listOf(4, 5, 7, 9)

        val result = scores
            .filter { score -> score >= 5 }
            .map { score -> "Pass: $score" }

        println(result)
    }
}