package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp


@Composable
fun icon(){
        Image(
            painter = painterResource(id = R.drawable.ic), contentDescription = "icon",
            modifier = Modifier.padding(top = 330.dp, start = 24.dp).size(170.dp)
        )
}

@Composable
fun title_and_stars() {
    Text(
        text = "DoTA 2",
        modifier = Modifier.padding(start = 160.dp, top = 14.dp),
        Color.White,
        fontWeight = FontWeight.Bold
    )
}
@Composable
fun stars() {
    Row( modifier = Modifier.padding(top = 20.dp)) {
        Image(
            painter = painterResource(id = R.drawable.stars_1), contentDescription = "stars",
            modifier = Modifier.padding(start = 160.dp, top = 365.dp).size(90.dp)
        )

        Text(
            text = "70M",
            modifier = Modifier.padding(top = 400.dp,start = 10.dp),
            Color.DarkGray
        )
    }
}