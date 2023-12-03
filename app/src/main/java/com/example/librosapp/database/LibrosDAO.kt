package com.example.librosapp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LibrosDAO {

    @Insert
    fun addLibro(libro:Libros)

}
