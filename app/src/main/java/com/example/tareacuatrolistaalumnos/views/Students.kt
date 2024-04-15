package com.example.tareacuatrolistaalumnos.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tareacuatrolistaalumnos.R
import com.example.tareacuatrolistaalumnos.viewmodels.StudentViewModel

@Composable
fun Students(navController: NavHostController) {

    //Variables
    var search: String by remember {
        mutableStateOf("")
    }
    val Student = StudentViewModel()

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Column () {
            TextField(
                value = search,
                onValueChange = {search = it},
                label = { Text("Busca por id o nombre") },
                modifier = Modifier.fillMaxWidth(),
            )

            Spacer(modifier = Modifier.height(5.dp))

            Button(
                onClick = {
                    val alumnList = Student.getStudentList()
                    val randomStudent = alumnList.random()
                    navController.navigate("Students" +
                            "/${randomStudent.id}"
                    )
                },
                colors = ButtonDefaults.buttonColors(Color(0xFFAF934C)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Alumno afortunado",
                    fontSize = 16.sp,
                    color = Color(0xFFFFFFFF),
                    fontWeight = FontWeight.Bold,
                )
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn {
            items(Student.getStudentList()) {
                    student->
                val studentSearch = "${student.name}-${student.id}"
                if (studentSearch.contains(search, ignoreCase = true)) {
                    StudentCard(student = student, color = Color(0xFFF2F2F2) , navHostController = navController)
                    Spacer(modifier = Modifier.size(10.dp))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun prevewStudents() {
    Students(rememberNavController())
}