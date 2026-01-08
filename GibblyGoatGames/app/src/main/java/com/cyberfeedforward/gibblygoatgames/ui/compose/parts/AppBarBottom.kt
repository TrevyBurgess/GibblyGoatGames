package com.cyberfeedforward.gibblygoatgames.ui.compose.parts

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.cyberfeedforward.gibblygoatgames.R

@Composable
fun AppBarBottom(
) {
    val navHome = stringResource(R.string.nav_home)
    val navGames = stringResource(R.string.nav_games)

    NavigationBar(
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary,
    ) {
        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Filled.Home,
                    contentDescription = navHome
                )
            },
            label = {
                Text(text = navHome)
            },
            selected = false,
            onClick = {

            },
        )

        NavigationBarItem(
            icon = {
                Icon(
                    imageVector = Icons.Rounded.Face,
                    contentDescription = navGames
                )
            },
            label = {
                Text(text = navGames)
            },
            selected = true,
            onClick = {

            },
        )
    }
}