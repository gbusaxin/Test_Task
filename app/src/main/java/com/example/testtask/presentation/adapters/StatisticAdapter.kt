package com.example.testtask.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R
import com.example.testtask.domain.StatisticInfo
import kotlinx.android.synthetic.main.statistic_item.view.*

class StatisticAdapter : RecyclerView.Adapter<StatisticAdapter.StatisticViewHolder>() {

    var statisticList: MutableList<StatisticInfo> = arrayListOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StatisticViewHolder {
        return StatisticViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.statistic_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: StatisticViewHolder, position: Int) {
        var statistic = statisticList[position]
        with(holder) {
            team.text = statistic.team
            tournament.text = statistic.tournament
            strikes.text = statistic.strikes.toString()
            selection.text = statistic.selection.toString()
        }
    }

    override fun getItemCount(): Int {
        return statisticList.size
    }

    class StatisticViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val team = view.team
        val tournament = view.tournament
        val strikes = view.strikes
        val selection = view.selection
    }
}