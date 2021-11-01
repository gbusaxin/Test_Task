package com.example.testtask.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testtask.R
import com.example.testtask.presentation.adapters.NewsAdapter
import kotlinx.android.synthetic.main.activity_news.*

class NewsActivity : AppCompatActivity() {

    lateinit var viewModel: AppViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        val adapter = NewsAdapter()
        viewModel = ViewModelProvider(this).get(AppViewModel::class.java)
        viewModel.loadNewsData()
        viewModel.newsLiveData.observe(this, Observer {
            adapter.newsList = it
            recyclerViewNews.adapter = adapter
        })




    }
}

