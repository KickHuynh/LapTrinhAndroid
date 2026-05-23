package com.example.kotlinpractice.exercises.buoi4

interface Taxable {
    fun calculateTax(salary: Double): Double
}

abstract class Employee(
    val id: String,
    val name: String
) {
    abstract fun calculateSalary(): Double
}

class FullTimeEmployee(
    id: String,
    name: String,
    private val fixedSalary: Double
) : Employee(id, name), Taxable {

    override fun calculateSalary(): Double {
        return fixedSalary
    }

    override fun calculateTax(salary: Double): Double {
        return salary * 0.10
    }
}

class ContractEmployee(
    id: String,
    name: String,
    private val hourlyRate: Double,
    private val hoursWorked: Double
) : Employee(id, name), Taxable {

    override fun calculateSalary(): Double {
        return hourlyRate * hoursWorked
    }

    override fun calculateTax(salary: Double): Double {
        return salary * 0.05
    }
}

class Bai4_EmployeePayrollExercise {

    fun run() {
        val employees: List<Employee> = listOf(
            FullTimeEmployee(
                id = "E001",
                name = "An",
                fixedSalary = 15000000.0
            ),
            ContractEmployee(
                id = "E002",
                name = "Bao",
                hourlyRate = 100000.0,
                hoursWorked = 80.0
            ),
            FullTimeEmployee(
                id = "E003",
                name = "Cuong",
                fixedSalary = 20000000.0
            )
        )

        for (employee in employees) {
            val salary = employee.calculateSalary()

            if (employee is Taxable) {
                val tax = employee.calculateTax(salary)
                val netSalary = salary - tax

                println("ID: ${employee.id}")
                println("Name: ${employee.name}")
                println("Salary: $salary")
                println("Tax: $tax")
                println("Net Salary: $netSalary")
                println("----------------------")
            }
        }
    }
}