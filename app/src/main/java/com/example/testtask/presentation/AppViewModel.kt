package com.example.testtask.presentation

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.testtask.data.ApiFactory
import com.example.testtask.domain.NewsItem
import com.example.testtask.domain.StatisticInfo
import com.example.testtask.domain.tables.TablesInfoList
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class AppViewModel(application: Application) : AndroidViewModel(application) {

    val newsLiveData = MutableLiveData<List<NewsItem>>()

    val tableLiveData = MutableLiveData<List<TablesInfoList?>>()
    val compositeDisposable = CompositeDisposable()
    val statisticLiveData = MutableLiveData<List<StatisticInfo>>()

    fun loadAttackData() {
        val disposable = ApiFactory.apiService.getAttackStatistic()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                for (i in 0 until it.size) {
                    statisticLiveData.value = it
                }
                Log.d("VIEWMODEL_STAT", "successSSSsss : ${statisticLiveData.value}")
            }, {

            })
        compositeDisposable.add(disposable)
    }

    fun loadDefenceData() {
        val disposable = ApiFactory.apiService.getDefenceStatistic()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                for (i in 0 until it.size) {
                    statisticLiveData.value = it
                }
                Log.d("VIEWMODEL_STAT", "successSSS : $it")
            }, {
                Log.d("VIEWMODEL_STAT", "FAIL_FAIL : $it")
            })
        compositeDisposable.add(disposable)
    }

    fun loadNewsData() {
        val disposable = ApiFactory.apiService.getNewsJson()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                for (i in 0 until it.size) {
                    newsLiveData.value = it
                }
                Log.d("VIEWMODEL_NEWS", "success : $it")
            }, {
                Log.d("VIEWMODEL_NEWS", "fail : $it")
            })
        compositeDisposable.add(disposable)
    }

    fun loadTableData() {
        val disposable = ApiFactory.apiService.getTablesJson()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                tableLiveData.value = it
                Log.e("VIEWMODEL_TABLE_LOAD",it.toString())
            },
                {
                    Log.d("VIEWMODEL_TABLE_LOAD", it.message.toString())
                })
        compositeDisposable.add(disposable)
        }

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.dispose()
    }

}