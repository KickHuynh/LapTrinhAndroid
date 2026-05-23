package com.example.kotlinpractice.compose

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun WhyComposeScreen() {
    // Biến thay đổi trạng thái (State) của UI
    var count by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // UI tự động lắng nghe và cập nhật khi giá trị 'count' thay đổi
        Text(text = "Số lần bạn bấm nút: $count", fontSize = 22.sp)

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { count++ }) { // Tăng state, kích hoạt Recomposition tự động
            Text(text = "Tăng biến đếm")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WhyComposeScreenPreview() {
    WhyComposeScreen()
}