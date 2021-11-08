package com.example.testtask.domain.tables

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TableDatum(

    @SerializedName("Команда")
    @Expose
    val team: String? = null,

    @SerializedName("Игры")
    @Expose
    val games: Int? = 0,

    @SerializedName("В")
    @Expose
    val b: Int? = 0,

    @SerializedName("Н")
    @Expose
    val h: Int? = 0,

    @SerializedName("П")
    @Expose
    val p: Int? = 0,

    @SerializedName("Мячи")
    @Expose
    val ball: String? = null,

    @SerializedName("Очки")
    @Expose
    val scores: Int? = 0

)