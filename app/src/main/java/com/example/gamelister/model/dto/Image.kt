package com.example.gamelister.model.dto

import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("small_url")
    var smallUrl: String? = null
)