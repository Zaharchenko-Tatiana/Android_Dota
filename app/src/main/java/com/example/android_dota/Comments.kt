package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_dota.ui.theme.C_text
import com.example.android_dota.ui.theme.C_text_light

@Composable
fun Comments(comments: CommentUI) {
    Row(modifier = Modifier.padding(start = 27.dp, top = 32.dp, end = 27.dp)){
        Image(
            painter = comments.painterResource,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(36.dp)
                .clip(CircleShape),
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(
            modifier = Modifier
        ) {
            Text(
                text = comments.name,
                fontSize = 16.sp,
                color = Color.White,
            )
            Spacer(modifier = Modifier.height(7.dp))
            Text(
                text = comments.date,
                fontSize = 12.sp,
                color = C_text,
                )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = comments.comment,
                fontSize = 12.sp,
                color = C_text_light,
            )
        }
    }
}
data class CommentUI(
    val name: String,
    val comment: String,
    val date: String,
    val painterResource: Painter,
)