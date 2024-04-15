package com.example.tareacuatrolistaalumnos.viewmodels

import androidx.lifecycle.ViewModel
import com.example.tareacuatrolistaalumnos.R
import com.example.tareacuatrolistaalumnos.models.Student

class StudentViewModel: ViewModel() {
    init {

    }

    fun getStudentList(): ArrayList<Student> {
        val student: Student = Student(21637, "Josue David Arreola Aguilera", "josue.arreola@iest.edu.mx",8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 10.0,10, R.drawable.student )
        val studentList: ArrayList<Student> = ArrayList<Student>()
        studentList.add(student)
        studentList.add(Student(22210, "Raymundo Gutiérrez Guerrero", "raymundo.gutierrez@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", false, 8.8, 0, R.drawable.student))
        studentList.add(Student(19523, "Yoselin Alejandra Mojica Ahumada ", "yoselin.mojica@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", false, 9.1, 0, R.drawable.student))
        studentList.add(Student(19475, "Edson De Jesus Maya Mendez", "edson.maya@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.5, 0, R.drawable.student))
        studentList.add(Student(19508, "Aylin Alvarez Hernandez", "aylin.alvarez@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.6, 5, R.drawable.student))
        studentList.add(Student(22208, "David Alejandro Rivera Luna", "david.rivera@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.0, 1, R.drawable.student))
        studentList.add(Student(21767, "María Fernanda Villarreal Mar", "maria.villarreal02@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.2, 3, R.drawable.student))
        studentList.add(Student(22154, "Luis Javier Zapata Perales", "luis.zapata01@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.3, 0, R.drawable.student))
        studentList.add(Student(22098, "Gerardo Torres García", "gerardo.torres@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.3, 1, R.drawable.student))
        studentList.add(Student(21637, "Josue David Arreola Aguilera", "josue.arreola@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 6, R.drawable.student))
        studentList.add(Student(22180, "Alfonso Madero Benítez", "alfonso.madero@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.0, 0, R.drawable.student))
        studentList.add(Student(19666, "Sebastián Rubio Quiroz", "sebastian.rubio@iest.edu.mx", 8, "Licenciatura en Ingeniería en Sistemas y Negocios Digitales (Plan 2020)", true, 9.85, 0, R.drawable.student))

        return studentList
    }
}