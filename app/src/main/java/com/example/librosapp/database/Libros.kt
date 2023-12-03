package com.example.librosapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="libros")
data class Libros(
    @PrimaryKey(autoGenerate = true)
    var id:Int=0,
    var titulo:String="",
    var anio_publicacion:String="",
    var autor_libro:String=""
)
