package com.cyberfeedforward.gibblygoatgames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.cyberfeedforward.gibblygoatgames.ui.theme.GibblyGoatGamesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainContent()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainContent() {
    GibblyGoatGamesTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {

            },
            bottomBar = {

            }
            ) { innerPadding ->

            MainContent1(
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}


@Composable
fun MainContent1(modifier: Modifier = Modifier) {


    Text(
        text = "Hello",
        modifier = modifier
    )
}

