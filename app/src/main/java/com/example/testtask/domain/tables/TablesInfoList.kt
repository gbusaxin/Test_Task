package com.example.testtask.domain.tables

import com.google.gson.JsonObject
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class TablesInfoList(
//    @SerializedName("data")
//    @Expose
//    var team: List<TableDatum>? = null

    @SerializedName("data")
    @Expose
    val datum: List<TableDatum>? = null
)