package com.example.testtask.domain

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NewsItem(
    @SerializedName("tittle")
    @Expose
     val tittle: String? = null,
    @SerializedName("text")
    @Expose
    val text: String? = null,
    @SerializedName("img")
    @Expose
    val img: String? = null,
    @SerializedName("date")
    @Expose
    val date: String? = null
)
