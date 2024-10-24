package com.example.randomuserapplication.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.randomuserapplication.ui.screens.UserDetailScreen
import com.example.randomuserapplication.ui.screens.UserListScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApp()
        }
    }
}

@Composable
fun MyApp() {
    // Define a NavController
    val navController = rememberNavController()

    // Define the NavHost with startDestination and route handling
    NavHost(navController = navController, startDestination = "userList") {
        // UserListScreen route
        composable("userList") {
            UserListScreen(navController = navController)
        }

        // UserDetailScreen route
        composable("userDetail/{userId}") { backStackEntry ->
            val userId = backStackEntry.arguments?.getString("userId")
            UserDetailScreen(userId)
        }
    }
}





