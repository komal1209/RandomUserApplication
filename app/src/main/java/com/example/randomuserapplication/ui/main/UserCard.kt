package com.example.randomuserapplication.ui.main

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.example.randomuserapplication.data.model.User

@Composable
fun UserCard(user: User, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onClick() }
    ) {
        Row(modifier = Modifier.padding(16.dp)) {
            Image(
                painter = rememberImagePainter(user.picture.large),
                contentDescription = null,
                modifier = Modifier.size(64.dp).clip(CircleShape)
            )
            Column(modifier = Modifier.padding(start = 16.dp)) {
                Text("${user.name.first} ${user.name.last}", style = MaterialTheme.typography.headlineSmall)
                Text("${user.location.street.name}, ${user.location.street.number}", style = MaterialTheme.typography.bodyMedium)
            }
        }
    }
}