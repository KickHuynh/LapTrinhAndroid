package com.example.kotlinpractice.exercises.buoi3



class Bai8_FilterObjectDataExercise {
    data class User(
        val name: String,
        val age: Int
    )

    fun run() {
        val users = listOf(
            User("An", 18),
            User("Bao", 22),
            User("Cuong", 17)
        )

        val result = users
            .filter { user -> user.age >= 18 }
            .map { user -> user.name }

        println(result)
    }
}