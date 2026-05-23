package com.example.kotlinpractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlinpractice.compose.MyCustomTheme
import com.example.kotlinpractice.compose.WhyComposeScreen
import com.example.kotlinpractice.exercises.buoi2.Bai1_LoveMessageExercise
import com.example.kotlinpractice.ui.theme.Class_KotlinPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Dùng Theme để bọc ứng dụng
            MyCustomTheme {
                WhyComposeScreen()
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Class_KotlinPracticeTheme {
        Greeting("Android")
    }
}