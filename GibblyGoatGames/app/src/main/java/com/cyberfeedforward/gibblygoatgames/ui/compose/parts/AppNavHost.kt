package com.cyberfeedforward.gibblygoatgames.ui.compose.parts

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cyberfeedforward.gibblygoatgames.ui.compose.screens.GamesScreen
import com.cyberfeedforward.gibblygoatgames.ui.compose.screens.HomeScreen
import com.cyberfeedforward.gibblygoatgames.R

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
) {
    val navHome = stringResource(R.string.nav_home)
    val navGames = stringResource(R.string.nav_games)

    NavHost(
        navController = navController,
        startDestination = navHome,
        modifier = modifier
    ) {
        composable(route = navHome) {
            HomeScreen()
        }
        composable(route = navGames) {
            GamesScreen()
        }
    }
}