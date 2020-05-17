package com.example.gamelister.model.dto

import com.google.gson.annotations.SerializedName

data class ResponseList(
    @SerializedName("results")
    var results: List<Game>? = null
)