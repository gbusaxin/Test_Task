package com.example.testtask.data

import com.example.testtask.domain.NewsItem
import com.example.testtask.domain.StatisticInfo
import com.example.testtask.domain.tables.TablesInfoList
import io.reactivex.Single
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.http.GET

interface ApiService {

    @GET("news.json")
    fun getNewsJson():Single<List<NewsItem>>

    @GET("data_tournament_tables.json")
    fun getTablesJson():Single<List<TablesInfoList>>

    @GET("data_statistic_defense.json")
    fun getDefenceStatistic():Single<List<StatisticInfo>>

    @GET("data_statistic_attack.json")
    fun getAttackStatistic():Single<List<StatisticInfo>>
}