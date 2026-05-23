package com.example.kotlinpractice.exercises.buoi3

class Bai12_SearchSortTransformExercise {
    data class Product(
        val name: String,
        val price: Double
    )

    fun run() {
        val products = listOf(
            Product("Laptop", 1000.0),
            Product("Phone", 500.0),
            Product("Tablet", 300.0),
            Product("Lamp", 50.0)
        )

        val result = products
            .filter { product ->
                product.name.contains("La", ignoreCase = true)
            }
            .sortedBy { product ->
                product.price
            }
            .map { product ->
                "Product: ${product.name} - ${product.price}"
            }

        println(result)
    }
}