package com.example.android_dota

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource


@Composable
fun ImageMain() {

    Image(
        painter = painterResource(id = R.drawable.main_img), contentDescription = "Main_im",
        contentScale = ContentScale.FillWidth,
        alignment = Alignment.BottomCenter,
        modifier = Modifier.fillMaxWidth()

    )

}