package com.example.librosapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.librosapp.database.MisLibrosApp
import com.example.librosapp.databinding.ActivityMostrarAutorYlibrosBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MostrarAutorYLibrosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityMostrarAutorYlibrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}