package com.example.kotlinpractice.exercises.buoi4

class DatabaseConfig private constructor(
    val url: String,
    val maxConnections: Int
) {
    companion object {

        fun createProductionConfig(): DatabaseConfig {
            return DatabaseConfig(
                url = "jdbc:mysql://production-server:3306/app_db",
                maxConnections = 100
            )
        }

        fun createTestConfig(): DatabaseConfig {
            return DatabaseConfig(
                url = "jdbc:mysql://localhost:3306/test_db",
                maxConnections = 5
            )
        }
    }

    fun showInfo() {
        println("URL: $url")
        println("Max Connections: $maxConnections")
    }
}

class Bai3_DatabaseConfigCompanionExercise {

    fun run() {
        val productionConfig = DatabaseConfig.createProductionConfig()
        val testConfig = DatabaseConfig.createTestConfig()

        println("Production Config:")
        productionConfig.showInfo()

        println()

        println("Test Config:")
        testConfig.showInfo()

        // Dòng dưới sẽ lỗi nếu mở comment vì constructor là private
        // val config = DatabaseConfig("custom-url", 10)
    }
}