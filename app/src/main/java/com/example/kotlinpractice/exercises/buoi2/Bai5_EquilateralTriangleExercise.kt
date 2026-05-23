package com.example.kotlinpractice.exercises.buoi2

class Bai5_EquilateralTriangleExercise {
    fun run(a: Int, b: Int, c: Int){
        val checkEquilateralTriangle:(Int, Int, Int)-> Boolean = {x, y, z ->
            x + y > z && x + z > y && y + z > x && x==y && y==z
        }
        if (checkEquilateralTriangle(a, b, c)) {
            println("Yes")
        } else {
            println("No")
        }
    }
}