package com.example.kotlinpractice.exercises.buoi2

class Bai4_AddDivideExercise {
    private fun printResult(a: Int, b: Int) {
        println("a + b = ${a + b}")

        if (b != 0) {
            println("a / b = ${a / b}")
        } else {
            println("a / b = Khong the chia cho 0")
        }
    }

    fun run(a: Int, b: Int) {
        printResult(a = a, b = b)
    }
}