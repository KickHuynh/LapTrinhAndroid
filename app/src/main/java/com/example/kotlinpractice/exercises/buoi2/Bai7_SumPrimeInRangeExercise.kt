package com.example.kotlinpractice.exercises.buoi2

class Bai7_SumPrimeInRangeExercise {

    private fun sumPrimeInRange(m: Int, n: Int): Int {

        fun isPrime(number: Int): Boolean {
            if (number < 2) {
                return false
            }

            for (i in 2 until number) {
                if (number % i == 0) {
                    return false
                }
            }

            return true
        }

        var sum = 0

        for (i in m..n) {
            if (isPrime(i)) {
                sum += i
            }
        }

        return sum
    }

    fun run(m: Int, n: Int) {
        val result = sumPrimeInRange(m = m, n = n)

        println("m = $m, n = $n")
        println(result)
    }
}