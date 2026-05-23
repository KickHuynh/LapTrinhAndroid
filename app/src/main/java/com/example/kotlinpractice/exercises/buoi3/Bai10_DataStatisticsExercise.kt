package com.example.kotlinpractice.exercises.buoi3

class Bai10_DataStatisticsExercise {

    fun run() {
        val scores = listOf(4, 6, 8, 10)

        val sum = scores.sum()
        val average = scores.average()
        val max = scores.maxOrNull()
        val min = scores.minOrNull()

        println("Sum: $sum")
        println("Average: $average")
        println("Max: $max")
        println("Min: $min")
    }
}