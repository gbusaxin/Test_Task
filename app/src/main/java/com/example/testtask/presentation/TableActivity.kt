package com.example.testtask.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.testtask.R
import com.example.testtask.presentation.adapters.TableAdapter
import kotlinx.android.synthetic.main.activity_table.*
import java.lang.Exception

class TableActivity : AppCompatActivity() {

    var countryId = 10
    lateinit var viewModel: AppViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_table)

        val adapter = TableAdapter()
        viewModel = ViewModelProvider(this)[AppViewModel::class.java]
        viewModel.loadTableData()
        viewModel.tableLiveData.observe(this,{
            adapter.tableList = it[countryId]?.datum ?: throw Exception()
            recyclerViewTables.adapter = adapter
        })
        val intent = getIntent().extras
        countryId = intent?.get("countryId") as Int
    }
}