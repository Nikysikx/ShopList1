package com.example.myapplication.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModel

    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(ViewModel::class.java)
        viewModel.liveData.observe(this) {
            Log.d("MainActivity", it.toString())
            if(count == 0) {
                count++
                val item = it[0]
                viewModel.delete(item)
            }
        }
    }
}