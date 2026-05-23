package com.example.kotlinpractice.exercises.buoi3

class Bai7_GroupDataExercise {

    fun run() {
        val names = listOf("An", "Bao", "Binh", "Cuong")

        val result = names.groupBy { name ->
            name.first()
        }

        result.forEach { (key, value) ->
            println("$key -> $value")
        }
    }
}