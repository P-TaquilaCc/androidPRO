package com.example.controladministrativo.Presentation.GradoSeccion

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.controladministrativo.Controllers.AuthControllerImpl
import com.example.controladministrativo.Controllers.GradoSeccion
import com.example.controladministrativo.Controllers.GradoSeccionController
import com.example.controladministrativo.Presentation.Login.Login


@Composable
fun GradoScreen() {
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        val gradoSeccion = GradoSeccion("Primero", "A")

        GradoSeccionController().guardarGradoSeccion(gradoSeccion)
    }
}


@Composable
fun GradoSeccionDetails(gradoSeccion: GradoSeccion) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text(
            text = "Nombre: ${gradoSeccion.nombre ?: ""}",
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "Sección: ${gradoSeccion.seccion ?: ""}",
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
        )
    }
}

