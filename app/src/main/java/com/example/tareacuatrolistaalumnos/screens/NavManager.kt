package com.example.tareacuatrolistaalumnos.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun NavManager() {
    var navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "Students" ) {
        composable(route = "Students") {
            StudentsView(navController)
        }
        composable(route = "Students/{id}", arguments = listOf(
            navArgument("id") { type = NavType.IntType}
        )) {
            parametros ->
            var id = parametros.arguments?.getInt("id") ?: 0
            StudentView(navController, id)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun test(){
    NavManager()
}