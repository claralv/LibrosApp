package com.example.librosapp

import android.os.Bundle
import com.example.librosapp.database.Libros
import com.example.librosapp.database.MisLibrosApp
import com.example.librosapp.databinding.ActivityAnadirLibroBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnadirLibroActivity : ActivityWithMenu() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding= ActivityAnadirLibroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.botonAnadir.setOnClickListener {
            var tit = binding.editTitulo.text.toString()
            var anio = binding.editAnio.text.toString()
            var aut = binding.editAutor.text.toString()
            CoroutineScope(Dispatchers.IO).launch {
                MisLibrosApp.database.librosDao().addLibro(
                    Libros(
                        titulo = tit,
                        anio_publicacion = anio,
                        autor_libro = aut
                    )
                )
            }
            runOnUiThread { true }
        }
    }




}