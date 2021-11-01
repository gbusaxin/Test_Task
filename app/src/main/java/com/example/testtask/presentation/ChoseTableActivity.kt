package com.example.testtask.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testtask.R
import com.example.testtask.presentation.adapters.TableAdapter

class ChoseTableActivity : AppCompatActivity() {

    lateinit var viewModel: AppViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_table)

        val adapter = TableAdapter()

        viewModel = ViewModelProvider(this).get(AppViewModel::class.java)
        viewModel.loadTableData()
        viewModel.tableLiveData.observe(this, Observer {

        })


    }
}