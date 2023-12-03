package com.example.librosapp

import android.os.Bundle
import com.example.librosapp.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}