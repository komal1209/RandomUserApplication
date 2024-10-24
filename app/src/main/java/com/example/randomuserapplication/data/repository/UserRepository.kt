package com.example.randomuserapplication.data.repository

import android.util.Log
import com.example.randomuserapplication.data.api.RandomUserApiService
import com.example.randomuserapplication.data.api.RetrofitClient
import com.example.randomuserapplication.data.model.RandomUserResponse

class UserRepository {
    private val apiService: RandomUserApiService = RetrofitClient.apiService

    suspend fun getUsers(results: Int): RandomUserResponse {
        // Construct the API URL
        val apiUrl = "https://randomuser.me/api/?results=$results"

        // Log the API URL
        Log.d("UserRepository", "API URL: $apiUrl")

        // Fetch users from the API
        val response = apiService.getRandomUsers(results)

        // Log the response data
        Log.d("UserRepository", "Response Data: $response")

        return response
    }
}