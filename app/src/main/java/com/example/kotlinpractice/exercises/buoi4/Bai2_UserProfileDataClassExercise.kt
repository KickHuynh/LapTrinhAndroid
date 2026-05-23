package com.example.kotlinpractice.exercises.buoi4

data class UserProfile(
    val id: String,
    val username: String,
    val email: String,
    val isActive: Boolean
)

class Bai2_UserProfileDataClassExercise {

    private fun updateEmail(
        oldProfile: UserProfile,
        newEmail: String
    ): UserProfile {
        return oldProfile.copy(email = newEmail)
    }

    fun run() {
        val oldProfile = UserProfile(
            id = "U001",
            username = "taihuynh",
            email = "old_email@gmail.com",
            isActive = true
        )

        val newProfile = updateEmail(
            oldProfile = oldProfile,
            newEmail = "new_email@gmail.com"
        )

        println("Old Profile:")
        println(oldProfile)

        println("New Profile:")
        println(newProfile)
    }
}