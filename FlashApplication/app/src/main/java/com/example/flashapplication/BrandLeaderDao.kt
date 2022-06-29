package com.example.flashapplication

import androidx.room.*

@Dao
interface BrandLeaderDao {

    @Query("SELECT * FROM BrandLeader") //susped es para decirle que no se ejecute en el hilo ppl de la app
    fun getAll(): List<BrandLeader>

    @Query("SELECT * FROM BrandLeader WHERE code=:id")
    fun findById(id: Long): BrandLeader

    @Update
    fun update(brandLeader: BrandLeader)

    @Insert
    fun insert(brandLeader: BrandLeader)

    @Delete
    fun delete(brandLeader: BrandLeader)
}