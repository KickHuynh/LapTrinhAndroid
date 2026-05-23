package com.example.kotlinpractice

import com.example.kotlinpractice.exercises.buoi2.Bai1_LoveMessageExercise
import com.example.kotlinpractice.exercises.buoi2.Bai2_SumSquareExercise
import com.example.kotlinpractice.exercises.buoi2.Bai3_GreetingExercise
import com.example.kotlinpractice.exercises.buoi2.Bai4_AddDivideExercise
import com.example.kotlinpractice.exercises.buoi2.Bai5_EquilateralTriangleExercise
import com.example.kotlinpractice.exercises.buoi2.Bai6_LinearEquationExercise
import com.example.kotlinpractice.exercises.buoi2.Bai7_SumPrimeInRangeExercise
import com.example.kotlinpractice.exercises.buoi3.Bai10_DataStatisticsExercise
import com.example.kotlinpractice.exercises.buoi3.Bai11_HandleNullApiDataExercise
import com.example.kotlinpractice.exercises.buoi3.Bai13_DataPipelineExercise
import com.example.kotlinpractice.exercises.buoi3.Bai1_DisplayListExercise
import com.example.kotlinpractice.exercises.buoi3.Bai2_SearchDataExercise
import com.example.kotlinpractice.exercises.buoi3.Bai3_TransformDataExercise
import com.example.kotlinpractice.exercises.buoi3.Bai4_FilterAndTransformExercise
import com.example.kotlinpractice.exercises.buoi3.Bai5_FindElementExercise
import com.example.kotlinpractice.exercises.buoi3.Bai6_RemoveNullExercise
import com.example.kotlinpractice.exercises.buoi3.Bai7_GroupDataExercise
import com.example.kotlinpractice.exercises.buoi3.Bai8_FilterObjectDataExercise
import com.example.kotlinpractice.exercises.buoi3.Bai9_FilterAndSortExercise
import com.example.kotlinpractice.exercises.buoi4.Bai1_BankAccountExercise
import com.example.kotlinpractice.exercises.buoi4.Bai2_UserProfileDataClassExercise
import com.example.kotlinpractice.exercises.buoi4.Bai3_DatabaseConfigCompanionExercise
import com.example.kotlinpractice.exercises.buoi4.Bai4_EmployeePayrollExercise
import org.junit.Test

class RunExerciseTest {

    @Test
    fun runBuoi2Bai1() {
        val bai1 = Bai1_LoveMessageExercise()
        bai1.runLoveMessageExercise()
    }

    @Test
    fun runBuoi2Bai2() {
        val bai2 = Bai2_SumSquareExercise()
        bai2.run()
    }

    @Test
    fun runBuoi2Bai3() {
        val bai3 = Bai3_GreetingExercise()
        bai3.run()
    }

    @Test
    fun runBuoi2Bai4() {
        val bai4 = Bai4_AddDivideExercise()
        bai4.run(a = 10, b = 2)
    }

    @Test
    fun runBuoi2Bai5() {
        val bai5 = Bai5_EquilateralTriangleExercise()

        bai5.run(a = 5, b = 8, c = 10)
        bai5.run(a = 5, b = 5, c = 5)
    }

    @Test
    fun runBuoi2Bai6() {
        val bai6 = Bai6_LinearEquationExercise()

        bai6.run(a = 3.0, b = 6.0)
        bai6.run(a = 0.0, b = 0.0)
        bai6.run(a = 0.0, b = 5.0)
    }

    @Test
    fun runBuoi2Bai7() {
        val bai7 = Bai7_SumPrimeInRangeExercise()
        bai7.run(m = 1, n = 8)
    }

    @Test
    fun runBuoi3Bai1() {
        val bai1 = Bai1_DisplayListExercise()
        bai1.run()
    }

    @Test
    fun runBuoi3Bai2() {
        val bai2 = Bai2_SearchDataExercise()
        bai2.run()
    }

    @Test
    fun runBuoi3Bai3() {
        val bai3 = Bai3_TransformDataExercise()
        bai3.run()
    }

    @Test
    fun runBuoi3Bai4() {
        val bai4 = Bai4_FilterAndTransformExercise()
        bai4.run()
    }

    @Test
    fun runBuoi3Bai5() {
        val bai5 = Bai5_FindElementExercise()
        bai5.run()
    }

    @Test
    fun runBuoi3Bai6() {
        val bai6 = Bai6_RemoveNullExercise()
        bai6.run()
    }

    @Test
    fun runBuoi3Bai7() {
        val bai7 = Bai7_GroupDataExercise()
        bai7.run()
    }

    @Test
    fun runBuoi3Bai8() {
        val bai8 = Bai8_FilterObjectDataExercise()
        bai8.run()
    }

    @Test
    fun runBuoi3Bai9() {
        val bai9 = Bai9_FilterAndSortExercise()
        bai9.run()
    }

    @Test
    fun runBuoi3Bai10() {
        val bai10 = Bai10_DataStatisticsExercise()
        bai10.run()
    }

    @Test
    fun runBuoi3Bai11() {
        val bai11 = Bai11_HandleNullApiDataExercise()
        bai11.run()
    }

    @Test
    fun runBuoi3Bai13() {
        val bai13 = Bai13_DataPipelineExercise()
        bai13.run()
    }

    @Test
    fun runBuoi4Bai1() {
        val bai1 = Bai1_BankAccountExercise()
        bai1.run()
    }

    @Test
    fun runBuoi4Bai2() {
        val bai2 = Bai2_UserProfileDataClassExercise()
        bai2.run()
    }

    @Test
    fun runBuoi4Bai3() {
        val bai3 = Bai3_DatabaseConfigCompanionExercise()
        bai3.run()
    }

    @Test
    fun runBuoi4Bai4() {
        val bai4 = Bai4_EmployeePayrollExercise()
        bai4.run()
    }
}