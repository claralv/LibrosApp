package com.example.librosapp.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Libros::class, Autores::class],
    version = 1)

abstract class DBLibros: RoomDatabase() {
    abstract fun librosDao(): LibrosDAO
    abstract fun autoresDao(): AutoresDAO
}

