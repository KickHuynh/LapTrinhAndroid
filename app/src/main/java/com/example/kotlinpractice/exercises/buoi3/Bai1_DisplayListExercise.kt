package com.example.kotlinpractice.exercises.buoi3

class Bai1_DisplayListExercise {

    fun run() {
        val products = listOf("Laptop", "Phone", "Tablet")

        for (index in products.indices) {
            println("${index + 1}. ${products[index]}")
        }
    }
}