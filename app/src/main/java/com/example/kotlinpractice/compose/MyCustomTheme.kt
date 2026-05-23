package com.example.kotlinpractice.compose

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

// Thiết lập bảng màu đại diện cho ứng dụng
private val CustomStudentColorScheme = lightColorScheme(
    primary = Color(0xFF4CAF50),       // Màu thương hiệu chính (Xanh lá chuyên nghiệp)
    secondary = Color(0xFFFF9800),     // Màu nhấn phụ
    background = Color(0xFFFFFFF0)     // Màu nền ứng dụng (màu kem dịu mắt)
)

@Composable
fun MyCustomTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = CustomStudentColorScheme,
        content = content
    )
}