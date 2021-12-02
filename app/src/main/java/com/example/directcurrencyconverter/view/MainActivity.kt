package com.example.directcurrencyconverter.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.directcurrencyconverter.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        setTheme(R.style.AppTheme_NoActionBar);

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}