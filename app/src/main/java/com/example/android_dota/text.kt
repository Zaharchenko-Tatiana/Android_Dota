package com.example.android_dota

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.android_dota.ui.theme.description

@Composable
fun text() {
    Row(modifier = Modifier.padding(start = 27.dp, top = 30.dp, end = 27.dp)) {
        Text(
            text = "Dota 2 is a multiplayer online battle arena (MOBA)" +
                    " game which has two teams of five players compete to collectively" +
                    " destroy a large structure defended by the opposing team known as" +
                    " the \"Ancient\", whilst defending their own.",
            color = description,
            fontSize = 12.sp
        )
    }
}