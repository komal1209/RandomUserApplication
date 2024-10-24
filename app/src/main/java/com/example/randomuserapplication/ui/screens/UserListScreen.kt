package com.example.randomuserapplication.ui.screens


import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.randomuserapplication.ui.main.UserCard
import com.example.randomuserapplication.viewmodel.UserViewModel
import androidx.compose.foundation.lazy.items
import com.example.randomuserapplication.data.api.RandomUserApiService
import com.example.randomuserapplication.data.repository.UserRepository
import com.example.randomuserapplication.viewmodel.UserViewModelFactory

@Composable
fun UserListScreen(navController: NavController) {
    // Create an instance of UserRepository
    val userRepository = UserRepository() // No parameters needed anymore

    // Create ViewModel using the factory
    val userViewModel: UserViewModel = viewModel(factory = UserViewModelFactory(userRepository))

    // Observe LiveData
    val users by userViewModel.users.observeAsState(emptyList())


    // Fetch users when the screen is loaded
    LaunchedEffect(Unit) {
        userViewModel.fetchUsers(10)
    }

    // Display the list of users in LazyColumn
    LazyColumn(modifier = Modifier.fillMaxSize()) {
        items(users) { user ->
            UserCard(user = user) {
                // Navigate to the UserDetailScreen when a user card is clicked
                navController.navigate("userDetail/${user.name}")
            }
        }
    }
}


