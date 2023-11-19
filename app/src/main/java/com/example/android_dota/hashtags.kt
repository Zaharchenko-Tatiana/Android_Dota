package com.example.android_dota

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_dota.ui.theme.Hasht_fon
import com.example.android_dota.ui.theme.Hasht_text

@Composable
fun hashtags() {
    Row(modifier = Modifier.fillMaxWidth().padding(top = 16.dp)) {
        Box(
            modifier = Modifier
                .padding(start = 30.dp)
                .clip(RoundedCornerShape(100))
                .background(Hasht_fon),
        ) {
            Text(
                text = "MOBA",
                modifier = Modifier.padding(5.dp),
                color = Hasht_text, fontSize = 10.sp
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 10.dp)
                .clip(RoundedCornerShape(100))
                .background(Hasht_fon),
        ) {
            Text(
                text = "MULTIPLAYER",
                modifier = Modifier.padding(5.dp),
                color = Hasht_text, fontSize = 10.sp
            )
        }
        Box(
            modifier = Modifier
                .padding(start = 10.dp)
                .clip(RoundedCornerShape(100))
                .background(Hasht_fon),
        ) {
            Text(
                text = "STRATEGY",
                modifier = Modifier.padding(5.dp),
                color = Hasht_text, fontSize = 10.sp
            )
        }
    }
}