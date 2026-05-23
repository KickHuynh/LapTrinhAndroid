package com.example.kotlinpractice.exercises.buoi3

class Bai11_HandleNullApiDataExercise {
    data class ApiUser(
        val name: String?,
        val age: Int?
    )

    fun run() {
        val users = listOf(
            ApiUser("An", 18),
            ApiUser(null, 20),
            ApiUser("Bao", null)
        )

        val validUsers = users.filter { user ->
            user.name != null && user.age != null
        }

        println(validUsers)
    }
}