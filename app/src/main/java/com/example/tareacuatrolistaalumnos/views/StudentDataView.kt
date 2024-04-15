package com.example.tareacuatrolistaalumnos.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tareacuatrolistaalumnos.models.Student
import com.example.tareacuatrolistaalumnos.viewmodels.StudentViewModel
import com.example.tareacuatrolistaalumnos.R

fun findStudentById(id: Int): Student {
    val studentList = StudentViewModel().getStudentList()

    // Iterate through the list and find the student with the matching id
    for (student in studentList) {
        if (student.id == id) {
            return student
        }
    }

    // If no student with the given id is found, return null
    return Student(0,"","",0,"",false, 0.0, 0, R.drawable.student)
}

@Composable
fun StudentDataView(studentId: Int, navHostController: NavHostController) {
    val student = findStudentById(studentId)
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        Card(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Image(
                    painterResource(id = student.profilePic),
                    contentDescription = "Student Image",
                    modifier = Modifier.size(80.dp),
                    alignment = Alignment.CenterStart
                )
                Spacer(modifier = Modifier.width(16.dp))
                Column {
                    Text(
                        text = "Name: ${student.name}",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Email: ${student.email}",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Semester: ${student.semester}",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Career: ${student.career}",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "GPA: ${student.average}",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Boletos vendidos: ${student.ticketsSold}",
                        fontSize = 20.sp
                    )
                    Text(
                        text = "Es becado?: ${student.isOnScholarship}",
                        fontSize = 20.sp
                    )
                    Button(onClick = { navHostController.popBackStack() }) {
                        Text(text = "Regresar <-")
                    }
                }
            }
        }
    }
    
}

@Preview(showBackground = true)
@Composable
fun pruebaVisaul() {
    StudentDataView(studentId = 22210, navHostController = rememberNavController())
}