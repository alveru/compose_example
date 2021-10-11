package com.example.compose

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.loaded.observe(this, {

            findViewById<ProgressBar>(R.id.loader_indicator).visibility =
                when (it) {
                    true -> {
                        View.GONE
                    }
                    false -> {
                        View.VISIBLE
                    }
                }

        })
    }
}