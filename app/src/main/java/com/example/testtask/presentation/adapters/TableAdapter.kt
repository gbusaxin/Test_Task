package com.example.testtask.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R
import com.example.testtask.domain.tables.TableDatum
import kotlinx.android.synthetic.main.tables_item.view.*

class TableAdapter:RecyclerView.Adapter<TableAdapter.TableViewHolder>() {

    var tableList:List<TableDatum> = listOf()
    set(value) {
        field = value
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TableViewHolder {
         return TableViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.tables_item,parent,false))
    }

    override fun onBindViewHolder(holder: TableViewHolder, position: Int) {
        val team = tableList.get(position)
        with(holder){
            teamName.text = team.team
            games.text = team.games.toString()
            b.text = team.b.toString()
            h.text = team.h.toString()
            p.text = team.p.toString()
            ball.text = team.ball
            scores.text = team.scores.toString()
        }
    }

    override fun getItemCount():Int{
        return tableList.size
    }


    inner class TableViewHolder(view:View):RecyclerView.ViewHolder(view){
        val teamName = view.team
        val games = view.games
        val b = view.b
        val h = view.h
        val p = view.p
        val ball = view.ball
        val scores = view.scores
    }
}