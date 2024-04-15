package com.example.tareacuatrolistaalumnos.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.tareacuatrolistaalumnos.models.Student
import com.example.tareacuatrolistaalumnos.viewmodels.StudentViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StudentCard(student: Student, color: Color, navHostController: NavHostController) {
    Card(
        colors = CardDefaults.cardColors(containerColor = color),
        onClick = {
            navHostController.navigate("Students" +
                    "/${student.id}"
            )
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 10.dp, vertical = 20.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier.size(100.dp),
                painter = painterResource(id = student.profilePic),
                contentScale = ContentScale.Crop,
                contentDescription = "Student picture",
            )

            Spacer(modifier = Modifier.width(20.dp))

            Column () {
                Text(
                    text = "${student.id} | ${student.name}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = student.email,
                    color = Color(0xFFD4A73C),
                    fontSize = 12.sp
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = student.career,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun previewCard() {
    StudentCard(student = StudentViewModel().getStudentList().random(), color = Color(0xFFF2F2F2), navHostController = rememberNavController() )
}