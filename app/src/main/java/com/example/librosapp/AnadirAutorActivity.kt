package com.example.librosapp

import android.content.Context
import android.os.Bundle
import com.example.librosapp.database.Autores
import com.example.librosapp.database.MisLibrosApp
import com.example.librosapp.databinding.ActivityAnadirAutorBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.exitProcess

class AnadirAutorActivity :ActivityWithMenu() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityAnadirAutorBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.botonAnadirAutor.setOnClickListener {
            var n_autor= binding.editNombre.text.toString()
            var a_autor= binding.editAnio.text.toString()
            var na_autor= binding.editNacionalidad.text.toString()
            CoroutineScope(Dispatchers.IO).launch {
                MisLibrosApp.database.autoresDao().anadirAutor(
                    Autores(
                        nombre_autor = n_autor, anio_nacimiento = a_autor,
                        nacionalidad = na_autor,
                    )
                )
            }
            runOnUiThread { true }
        }
    }
}