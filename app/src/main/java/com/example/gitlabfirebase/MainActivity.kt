package com.example.gitlabfirebase

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gitlabfirebase.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val key = BuildConfig.API_KEY
        binding.tvMain.text = "API_KEY = $key"
    }
}