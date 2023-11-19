package com.example.android_dota

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_dota.ui.theme.Android_DotaTheme
import com.example.android_dota.ui.theme.Fon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_DotaTheme {
                LazyColumn(modifier = Modifier
                    .fillMaxSize()
                    .background(Fon)) {
                    item {
                        Column() {
                            Box() {
                                Column() {
                                    ImageMain()
                                    title()
                                }
                                icon()
                                stars()
                            }
                            hashtags()
                            text()
                            screenshots()
                            ReviewTitle()
                        }
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Android_DotaTheme {
            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .background(Fon)) {
                item {
                    Column() {
                        Box() {
                            Column() {
                                ImageMain()
                                title()
                            }
                            icon()
                            stars()
                        }
                        hashtags()
                        text()
                        screenshots()
                        ReviewTitle()
                    }
                }
            }
        }
    }


}

