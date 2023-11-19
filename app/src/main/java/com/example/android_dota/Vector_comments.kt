package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun Vector_comments() {
    Row(modifier = Modifier.padding(top = 24.dp, start = 37.dp, end = 37.dp)) {
        Image(
            painter = painterResource(id = R.drawable.vector),
            contentDescription = "Vector",
            modifier = Modifier
                .fillMaxHeight()
                .width(300.dp),
            contentScale = ContentScale.FillBounds
        )
    }
}