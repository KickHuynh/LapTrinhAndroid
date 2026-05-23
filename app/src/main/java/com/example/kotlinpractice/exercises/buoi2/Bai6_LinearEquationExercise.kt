package com.example.kotlinpractice.exercises.buoi2

class Bai6_LinearEquationExercise {
    private fun solveLinearEquation(a: Double, b: Double): String {
        return if (a == 0.0) {
            if (b == 0.0) {
                "VSN"
            } else {
                "VN"
            }
        } else {
            val x = -b / a

            if (x % 1 == 0.0) {
                x.toInt().toString()
            } else {
                x.toString()
            }
        }
    }

    fun run(a: Double, b: Double) {
        val result = solveLinearEquation(a = a, b = b)

        println("a = $a, b = $b")
        println(result)
    }
}