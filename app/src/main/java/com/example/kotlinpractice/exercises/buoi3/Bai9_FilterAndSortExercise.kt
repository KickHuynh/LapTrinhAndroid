package com.example.kotlinpractice.exercises.buoi3



class Bai9_FilterAndSortExercise {
    data class Product(
        val name: String,
        val price: Double
    )

    fun run() {
        val products = listOf(
            Product("Laptop", 1000.0),
            Product("Phone", 500.0),
            Product("Tablet", 300.0)
        )

        val result = products
            .filter { product -> product.price > 400 }
            .sortedByDescending { product -> product.price }
            .map { product -> product.name }

        println(result)
    }
}