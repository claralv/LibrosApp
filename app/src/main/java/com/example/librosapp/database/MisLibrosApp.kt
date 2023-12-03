package com.example.librosapp.database

import android.app.Application
import androidx.room.Room

class MisLibrosApp:Application() {
    companion object {
        lateinit var database: DBLibros
    }

    override fun onCreate() {
        super.onCreate()
        MisLibrosApp.database = Room.databaseBuilder(this, DBLibros::class.java,"DBLibros").build()
    }
}