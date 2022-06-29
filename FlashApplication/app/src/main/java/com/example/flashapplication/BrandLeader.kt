package com.example.flashapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BrandLeader(
    @PrimaryKey//No se debe generar automaticamente por que el codigo ya lo tenemos
    val code: Long,
    val first_name: String,
    val second_name: String,
    val first_last_name: String,
    val second_last_name: String,
    val email: String,
    val password: String,
)
