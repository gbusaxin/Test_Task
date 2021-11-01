package com.example.testtask.domain.tables

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TableDatum(

    @SerializedName("Команда")
    @Expose
    var team: String? = null,

    @SerializedName("Игры")
    @Expose
    var games: Int? = 0,

    @SerializedName("В")
    @Expose
    var b: Int? = 0,

    @SerializedName("Н")
    @Expose
    var h: Int? = 0,

    @SerializedName("П")
    @Expose
    var p: Int? = 0,

    @SerializedName("Мячи")
    @Expose
    var ball: String? = null,

    @SerializedName("Очки")
    @Expose
    var scores: Int? = 0

)