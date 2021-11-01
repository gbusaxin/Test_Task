package com.example.testtask.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testtask.R
import com.example.testtask.presentation.adapters.StatisticAdapter
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.android.synthetic.main.activity_statistic.*

class StatisticActivity : AppCompatActivity() {

    lateinit var viewModel: AppViewModel
    private var isDefence = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_statistic)
        val adapter = StatisticAdapter()

        viewModel = ViewModelProvider(this)[AppViewModel::class.java]

        buttonDefence.setOnClickListener {
            isDefence = true
            if (isDefence) {
                viewModel.loadDefenceData()
                viewModel.statisticLiveData.observe(this, Observer {
                    adapter.statisticList = ArrayList(it)
                    recyclerViewStatistic.adapter = adapter
                })
                buttonAttack.background = resources.getDrawable(R.drawable.my_button_enabled)
                buttonDefence.background = resources.getDrawable(R.drawable.my_button_style)
            }
        }

        buttonAttack.setOnClickListener {
            isDefence = false
            if (!isDefence) {
                viewModel.loadAttackData()
                viewModel.statisticLiveData.observe(this, Observer {
                    adapter.statisticList = ArrayList(it)
                    recyclerViewStatistic.adapter = adapter
                })
                buttonDefence.background = resources.getDrawable(R.drawable.my_button_enabled)
                buttonAttack.background = resources.getDrawable(R.drawable.my_button_style)
            }
        }

        viewModel = ViewModelProvider(this)[AppViewModel::class.java]
        viewModel.loadAttackData()
        viewModel.statisticLiveData.observe(this, Observer {
            adapter.statisticList = ArrayList(it)
            recyclerViewStatistic.adapter = adapter
        })

    }
}