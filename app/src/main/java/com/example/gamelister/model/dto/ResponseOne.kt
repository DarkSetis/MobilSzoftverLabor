package com.example.gamelister.model.dto

import com.google.gson.annotations.SerializedName

data class ResponseOne(
    @SerializedName("results")
    var results: Game? = null
)