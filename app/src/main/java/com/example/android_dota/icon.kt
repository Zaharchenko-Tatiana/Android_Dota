package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_dota.ui.theme.C_text


@Composable
fun icon() {
    Row(modifier = Modifier
        .padding(start = 30.dp)) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(10))
                .background(C_text)

        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16))
                    .padding(3.dp)
                    .background(Color.Black)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic), contentDescription = "icon",
                    modifier = Modifier
                        .padding(17.dp)
                        .size(54.dp)

                )
            }
        }
        Column() {
            Text(
                text = "DoTA 2",
                modifier = Modifier.padding(start = 12.dp, top = 14.dp),
                Color.White,
                fontWeight = FontWeight.Bold
            )
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.stars_1),
                    contentDescription = "stars",
                    modifier = Modifier
                        .padding(start = 12.dp, top = 7.dp)
                )

                Text(
                    text = "70M",
                    modifier = Modifier.padding(top = 7.dp, start = 10.dp),
                    color = C_text, fontSize = 12.sp
                )
            }
        }
    }
}