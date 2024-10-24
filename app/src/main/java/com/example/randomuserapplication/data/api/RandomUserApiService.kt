package com.example.randomuserapplication.data.api

import com.example.randomuserapplication.data.model.RandomUserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserApiService {
    @GET("/")
    suspend fun getRandomUsers(@Query("results") results: Int): RandomUserResponse
}