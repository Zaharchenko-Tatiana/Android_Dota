package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun screenshots() {
    Row(
        modifier = Modifier
            .padding(start = 27.dp, top = 15.dp)
            .height(128.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.scrin1), contentDescription = "scr1",
            modifier = Modifier
                .fillMaxHeight()
                .width(240.dp),
            contentScale = ContentScale.FillBounds
        )
        Image(
            painter = painterResource(id = R.drawable.scrin2), contentDescription = "scr2",
            modifier = Modifier
                .fillMaxHeight()
                .width(240.dp)
                .padding(start = 15.dp),
            contentScale = ContentScale.FillBounds
        )
    }
}