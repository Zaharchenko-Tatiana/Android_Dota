package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_dota.ui.theme.C_text


@Composable
fun icon() {
    Image(
        painter = painterResource(id = R.drawable.ic), contentDescription = "icon",
        modifier = Modifier
            .padding(top = 330.dp, start = 24.dp)
            .size(150.dp)
    )
}

@Composable
fun title() {
    Text(
        text = "DoTA 2",
        modifier = Modifier.padding(start = 160.dp, top = 14.dp),
        Color.White,
        fontWeight = FontWeight.Bold
    )
}

@Composable
fun stars() {
    Row(modifier = Modifier.padding(top = 20.dp)) {
        Image(
            painter = painterResource(id = R.drawable.stars_1), contentDescription = "stars",
            modifier = Modifier
                .padding(start = 160.dp, top = 364.dp)
                .size(90.dp)
        )

        Text(
            text = "70M",
            modifier = Modifier.padding(top = 401.dp, start = 10.dp),
            color = C_text, fontSize = 12.sp
        )
    }
}