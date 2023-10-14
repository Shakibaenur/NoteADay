package com.shakibaenur.noteaday.navigation

import androidx.navigation.NavHostController
import com.shakibaenur.noteaday.util.Action
import com.shakibaenur.noteaday.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
    val task: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
}