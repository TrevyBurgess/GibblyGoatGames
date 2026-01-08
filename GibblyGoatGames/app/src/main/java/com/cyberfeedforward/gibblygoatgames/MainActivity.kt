package com.cyberfeedforward.gibblygoatgames

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.cyberfeedforward.gibblygoatgames.ui.compose.parts.AppBarBottom
import com.cyberfeedforward.gibblygoatgames.ui.compose.parts.AppBarTop
import com.cyberfeedforward.gibblygoatgames.ui.compose.parts.AppNavHost
import com.cyberfeedforward.gibblygoatgames.ui.theme.GibblyGoatGamesTheme
import com.cyberfeedforward.gibblygoatgames.viewmodels.MainViewModel

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
    val viewModel = viewModel<MainViewModel>()

    GibblyGoatGamesTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize(),
            topBar = {
                val context = LocalContext.current
                val shareMessage = R.string.share_message

                AppBarTop(
                    shareActivity = {
                        viewModel.shareActivity(
                            context,
                            shareMessage,
                        )
                    }
                )
            },
            bottomBar = {
                AppBarBottom()
            }
            ) { innerPadding ->

            val navController: NavHostController = rememberNavController()
            AppNavHost(
                navController = navController,
                modifier = Modifier.padding(innerPadding)
            )
        }
    }
}