package com.example.testtask.presentation

import android.app.Application
import android.app.UiModeManager
import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.example.testtask.R
import kotlinx.android.synthetic.main.activity_settings.*
import java.util.prefs.AbstractPreferences

class SettingsActivity : AppCompatActivity() {

    lateinit var uiMode:UiModeManager
    lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        uiMode = getSystemService(UI_MODE_SERVICE) as UiModeManager
        sharedPreferences = getSharedPreferences("theme_data", Context.MODE_PRIVATE)

        switchTheme.setOnCheckedChangeListener{button, isChecked ->
            if (isChecked){
                uiMode.nightMode = UiModeManager.MODE_NIGHT_NO
                Toast.makeText(this,"Light mode",Toast.LENGTH_SHORT).show()
            }else{
                uiMode.nightMode = UiModeManager.MODE_NIGHT_YES
                Toast.makeText(this,"Night mode",Toast.LENGTH_SHORT).show()
            }
        }

        buttonRandomBackground.setOnClickListener{
            val random = (Math.random() * 2).toInt()
            when(random){
                1 -> {
                    baseContext.setTheme(R.style.Theme_TestTask)
                recreate()
                }
                2 -> {
                    baseContext.setTheme(R.style.Theme_TestTask1)
                    recreate()
                }
                3 -> {
                    baseContext.setTheme(R.style.Theme_TestTask2)
                    recreate()
                }

            }

        }
    }
}