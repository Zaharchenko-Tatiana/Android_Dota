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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_dota.ui.theme.Android_DotTheme
import com.example.android_dota.ui.theme.Fon


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Android_DotTheme{
                LazyColumn(modifier = Modifier
                    .fillMaxSize()
                    .background(Fon)) {
                    item {
                        Column() {
                            ImageMain()
                            icon()
                            hashtags()
                            text()
                            screenshots()
                            Review()
                            Comments(comments = CommentUI("Auguste Conte",
                                "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                                "February 14, 2019",
                                painterResource(R.drawable.person1)))
                            Vector_comments()
                            Comments(comments = CommentUI("Jang Marcelino",
                                "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                                "February 14, 2019",
                                painterResource(R.drawable.person2)))
                            InstallButton()
                        }
                    }
                }
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Android_DotTheme{
            LazyColumn(modifier = Modifier
                .fillMaxSize()
                .background(Fon)) {
                item {
                    Column() {
                        ImageMain()
                        icon()
                        hashtags()
                        text()
                        screenshots()
                        Review()
                        Comments(comments = CommentUI("Auguste Conte",
                            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                            "February 14, 2019",
                            painterResource(R.drawable.person1)))
                        Vector_comments()
                        Comments(comments = CommentUI("Jang Marcelino",
                            "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”",
                            "February 14, 2019",
                            painterResource(R.drawable.person2)))
                        InstallButton()
                    }
                }
            }
        }
    }
}

