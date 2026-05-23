package com.example.kotlinpractice.exercises.buoi3

class Bai13_DataPipelineExercise {

    fun run() {
        val numbers = listOf(1, 2, 3, 4, 5, 6)

        val result = numbers
            .filter { number -> number % 2 == 0 }
            .map { number -> number * 3 }
            .sum()

        println(result)
    }
}