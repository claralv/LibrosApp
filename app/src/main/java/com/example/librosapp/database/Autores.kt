package com.example.librosapp.database

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity(tableName="autores")
data class Autores(
    @PrimaryKey
    var nombre_autor:String="",
    var anio_nacimiento:String,
    var nacionalidad:String=""
)

