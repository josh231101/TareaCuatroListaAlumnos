package com.example.tareacuatrolistaalumnos.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.tareacuatrolistaalumnos.views.StudentDataView
import com.example.tareacuatrolistaalumnos.views.Students

@Composable
fun StudentsView(navController: NavHostController) {
    Students(navController = navController)
}

@Composable
fun StudentView(navController: NavHostController, id: Int) {
    StudentDataView(studentId = id, navController)

}