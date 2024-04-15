package com.example.tareacuatrolistaalumnos.models

import android.graphics.drawable.DrawableContainer
import androidx.annotation.DrawableRes

data class Student (
    val id: Int,
    val name: String,
    val email: String,
    val semester: Int,
    val career: String,
    val isOnScholarship: Boolean,
    val average: Double,
    val ticketsSold: Int,
    @DrawableRes val profilePic: Int,
)