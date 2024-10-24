package com.example.randomuserapplication.data.model

import com.google.gson.annotations.SerializedName

// Data Classes
data class RandomUserResponse(
    @SerializedName("results") val results: List<User>
)
data class User(
    val name: Name,
    val location: Location,
    val picture: Picture
)

data class Name(val first: String, val last: String)
data class Location(val street: Street)
data class Street(val number: Int, val name: String)
data class Picture(val large: String)