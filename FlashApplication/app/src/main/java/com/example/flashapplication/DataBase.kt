package com.example.flashapplication

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [BrandLeader::class],
    version = 1
)
abstract class DataBase : RoomDatabase(){

    abstract fun brandLeaderDao(): BrandLeaderDao
}