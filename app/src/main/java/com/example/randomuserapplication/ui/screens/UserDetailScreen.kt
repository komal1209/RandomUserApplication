package com.example.randomuserapplication.ui.screens

import android.content.res.Resources.Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.randomuserapplication.data.model.User

@Composable
fun UserDetailScreen(userId: String?) {
    // You can retrieve user details here based on userId, maybe via ViewModel
    // For simplicity, let's assume we display the userId

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "User ID: $userId", style = MaterialTheme.typography.headlineSmall)
        // Add more detailed user ifo here
    }
}
