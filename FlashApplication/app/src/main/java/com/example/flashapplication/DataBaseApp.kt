package com.example.flashapplication

import android.app.Application
import androidx.room.Room

class DataBaseApp : Application(){

    val room = Room
        .databaseBuilder(this, DataBase::class.java, "databasebl")
        .build()
}