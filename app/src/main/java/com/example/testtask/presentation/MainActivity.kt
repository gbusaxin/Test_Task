package com.example.testtask.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.example.testtask.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


    }

    fun onClickToNews(view: View) {
        startActivity(Intent(this@MainActivity,NewsActivity::class.java))
    }

    fun onClickToTable(view: View) {
        startActivity(Intent(this@MainActivity,ChoseTableActivity::class.java))
    }

    fun onClickToStatistic(view: View) {
        startActivity(Intent(this@MainActivity,StatisticActivity::class.java))
    }

    fun onClickToSettings(view: View) {
        startActivity(Intent(this@MainActivity,SettingsActivity::class.java))

    }


}