package com.example.kotlinpractice.exercises.buoi3

class Bai3_TransformDataExercise {

    fun run() {
        val scores = listOf(6, 7, 8, 9)

        val result = scores.map { score ->
            "Score: $score"
        }

        println(result)
    }
}