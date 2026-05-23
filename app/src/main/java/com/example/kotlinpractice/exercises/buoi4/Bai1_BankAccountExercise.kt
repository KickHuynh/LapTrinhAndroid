package com.example.kotlinpractice.exercises.buoi4

class BankAccount(
    val accountNumber: String,
    initialBalance: Double
) {
    private var balance: Double = initialBalance

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
            println("Deposit successful: $amount")
        } else {
            println("Deposit failed: Amount must be greater than 0")
        }
    }

    fun withdraw(amount: Double) {
        if (amount <= 0) {
            println("Withdraw failed: Amount must be greater than 0")
        } else if (amount > balance) {
            println("Withdraw failed: Not enough balance")
        } else {
            balance -= amount
            println("Withdraw successful: $amount")
        }
    }

    fun getBalanceInfo(): Double {
        return balance
    }
}

class Bai1_BankAccountExercise {

    fun run() {
        val account = BankAccount(
            accountNumber = "ACC001",
            initialBalance = 1000.0
        )

        println("Account Number: ${account.accountNumber}")
        println("Initial Balance: ${account.getBalanceInfo()}")

        account.deposit(amount = 500.0)
        println("Current Balance: ${account.getBalanceInfo()}")

        account.withdraw(amount = 300.0)
        println("Current Balance: ${account.getBalanceInfo()}")

        account.withdraw(amount = 2000.0)
        println("Current Balance: ${account.getBalanceInfo()}")

        account.deposit(amount = -100.0)
        println("Current Balance: ${account.getBalanceInfo()}")
    }
}