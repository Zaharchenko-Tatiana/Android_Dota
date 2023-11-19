package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_dota.ui.theme.C_text_light

@Composable
fun Review() {
    Box(
        modifier = Modifier.padding(start = 27.dp, top = 20.dp)
    )
    {
        Text(
            text = "Review & Ratings",
            fontSize = 16.sp,
            color = Color.White
        )
    }
    Row(modifier = Modifier.padding(start = 27.dp, top = 12.dp)) {
        Text(
            text = "4.9",
            fontSize = 48.sp,
            color = Color.White
        )
        Column() {
            Image(
                painter = painterResource(id = R.drawable.stars_2), contentDescription = "stars_2",
                modifier = Modifier.padding(top = 17.dp, start = 16.dp)
            )
            Text(
                text = "70M Reviews",
                fontSize = 12.sp,
                modifier = Modifier.padding(top = 8.dp, start = 16.dp),
                color = C_text_light
            )
        }
    }
}