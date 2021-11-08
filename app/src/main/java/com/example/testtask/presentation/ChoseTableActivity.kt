package com.example.testtask.presentation

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.testtask.R
import com.example.testtask.presentation.adapters.TableAdapter

class ChoseTableActivity : AppCompatActivity() {

    var countryId = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chose_table)

    }

    fun onClickToSpain(view: View) {
        val intent = Intent(this,TableActivity::class.java)
        countryId = 2
        intent.putExtra("countryId",countryId)
        startActivity(intent)
    }
    fun onClickToGermany(view: View) {
        val intent = Intent(this,TableActivity::class.java)
        countryId = 3
        intent.putExtra("countryId",countryId)
        startActivity(intent)
    }
    fun onClickToRussia(view: View) {
        val intent = Intent(this,TableActivity::class.java)
        countryId = 1
        intent.putExtra("countryId",countryId)
        startActivity(intent)
    }
    fun onClickToEngland(view: View) {
        val intent = Intent(this,TableActivity::class.java)
        countryId = 0
        intent.putExtra("countryId",countryId)
        startActivity(intent)
    }
}