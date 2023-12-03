package com.example.librosapp.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface AutoresDAO {

    @Insert
    fun anadirAutor(autor:Autores)
}

