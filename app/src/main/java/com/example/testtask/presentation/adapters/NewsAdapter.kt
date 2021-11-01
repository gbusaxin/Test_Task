package com.example.testtask.presentation.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testtask.R
import com.example.testtask.domain.NewsItem
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.news_item.view.*


class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    var newsList:List<NewsItem> = listOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        return NewsViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.news_item,parent,false))
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val news = newsList.get(position)
        with(holder) {
            Picasso.get().load(news.img).into( imageViewNewsLogo)
            textViewDate.text = news.date
            textViewMainTextNews.text = news.text
            textViewNewsTitle.text = news.tittle
        }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

     class NewsViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val imageViewNewsLogo = view.imageViewNewsLogo
        val textViewNewsTitle = view.textViewNewsTitle
        val textViewDate = view.textViewDate
        val textViewMainTextNews = view.textViewMainTextNews

    }

}