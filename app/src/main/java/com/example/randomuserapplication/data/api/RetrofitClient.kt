package com.example.randomuserapplication.data.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://randomuser.me/api/" // Base URL of the API

    // Create the Retrofit instance
    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // Create an instance of RandomUserApiService
    val apiService: RandomUserApiService = retrofit.create(RandomUserApiService::class.java)
}