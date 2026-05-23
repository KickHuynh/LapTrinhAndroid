package com.example.kotlinpractice.exercises.buoi3

class Bai2_SearchDataExercise {

    private val users = listOf("An", "Bao", "Cuong", "David")

    fun search(keyword: String): List<String> {
        return users.filter { user ->
            user.contains(keyword, ignoreCase = true)
        }
    }

    fun run() {
        val result = search(keyword = "a")
        println(result)
    }
}