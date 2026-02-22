package com.cyberfeedforward.emptyactivity.ui.navigation

sealed class AppDestination(
    val route: String,
    val label: String
) {
    data object Home : AppDestination(
        route = "home",
        label = "Home"
    )

    data object Games : AppDestination(
        route = "games",
        label = "Games"
    )

    data object Profile : AppDestination(
        route = "profile",
        label = "Profile"
    )

    companion object {
        val bottomNavDestinations: List<AppDestination> = listOf(Home, Games, Profile)
    }
}
