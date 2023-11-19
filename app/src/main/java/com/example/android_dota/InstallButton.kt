package com.example.android_dota

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_dota.ui.theme.button

@Composable
fun InstallButton() {
    Row(modifier = Modifier
        .padding(start = 27.dp, end = 27.dp, top = 40.dp)
        .height(64.dp))
    {
        Button(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(12),
            colors = ButtonDefaults.buttonColors(button),
            onClick = {/* TODO */ })
        {
            Text(
                text = "Install",
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
    Spacer(modifier = Modifier.height(38.dp))
}