package com.example.testtask.domain

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class StatisticInfo(

    @SerializedName("Команда")
    @Expose
    val team: String? = null,

    @SerializedName("Турнир")
    @Expose
    val tournament: String? = null,

    @SerializedName("Удары з.и.")
    @Expose
    val strikes: Double = 0.0,

    @SerializedName("Отборы з.и.")
    @Expose
    val selection: Double = 0.0

//    @SerializedName("Перехваты з.и.")
//    @Expose
//    val catch :Float,
//
//    @SerializedName("Фолы з.и.")
//    @Expose
//    val fall :Float,
//
//    @SerializedName("Офсайды з.и.")
//    @Expose
//    val offSide :Float,
//
//    @SerializedName("Рейтинг")
//    @Expose
//    val rating :Float

)