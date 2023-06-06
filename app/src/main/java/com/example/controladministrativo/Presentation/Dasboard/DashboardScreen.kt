package com.example.controladministrativo.Presentation.Dasboard

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.controladministrativo.Presentation.Curso.CursoActivity
import com.example.controladministrativo.Presentation.Docente.DocenteActivity
import com.example.controladministrativo.Presentation.Estudiante.EstudianteActivity
import com.example.controladministrativo.Presentation.GradoSeccion.GradoSeccionActivity
import com.example.controladministrativo.Presentation.Horario.HorarioActivity
import com.example.controladministrativo.Presentation.Personal.PersonalActivity
import com.example.controladministrativo.R


@Composable
fun DashboardScreen() {
    val context = LocalContext.current
    Box(
        Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Dashboard(Modifier.align(Alignment.Center), context)
    }
}

@Composable
fun Dashboard(modifier: Modifier, context: Context) {

    Column(modifier = Modifier.fillMaxSize()) {
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                CardWithImage(
                    imageResId = R.drawable.personal,
                    backgroundColor = Color.White,
                    context = context,
                    content = {
                        Column(modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally)) {
                            Text("Personal",
                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold))
                        }
                    },
                    activityClass = PersonalActivity::class.java
                )
            }
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                CardWithImage(
                    imageResId = R.drawable.docente,
                    backgroundColor = Color.White,
                    context = context,
                    content = {
                        Column(modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally)) {
                            Text("Docentes",
                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold))
                        }
                    },
                    activityClass = DocenteActivity::class.java
                )
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                CardWithImage(
                    imageResId = R.drawable.alumno,
                    backgroundColor = Color.White,
                    context = context,
                    content = {
                        Column(modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally)) {
                            Text("Estudiantes",
                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold))
                        }
                    },
                    activityClass = EstudianteActivity::class.java
                )
            }
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                CardWithImage(
                    imageResId = R.drawable.horario,
                    backgroundColor = Color.White,
                    context = context,
                    content = {
                        Column(modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally)) {
                            Text("Horarios",
                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold))
                        }
                    },
                    activityClass = HorarioActivity::class.java
                )
            }
        }
        Row(modifier = Modifier.weight(1f)) {
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                CardWithImage(
                    imageResId = R.drawable.curso,
                    backgroundColor = Color.White,
                    context = context,
                    content = {
                        Column(modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally)) {
                            Text("Cursos",
                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold))
                        }
                    },
                    activityClass = CursoActivity::class.java
                )
            }
            Column(modifier = Modifier.weight(1f)) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                )
                CardWithImage(
                    imageResId = R.drawable.grado,
                    backgroundColor = Color.White,
                    context = context,
                    content = {
                        Column(modifier = Modifier
                            .padding(16.dp)
                            .align(Alignment.CenterHorizontally)) {
                            Text("Grado y Sección",
                                style = TextStyle(fontSize = 14.sp, fontWeight = FontWeight.Bold))
                        }
                    },
                    activityClass = GradoSeccionActivity::class.java
                )
            }
        }
    }
}

data class CardData(val imageResId: Int, val title: String)

@Composable
fun CardItem(card: CardData) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .height(200.dp),
        shape = MaterialTheme.shapes.medium,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = card.imageResId),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = card.title,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
        }
    }
}


@Composable
fun CardWithImage(
    imageResId: Int,
    backgroundColor: Color,
    context: Context,
    content: @Composable () -> Unit,
    activityClass: Class<out Activity>
) {

    Card(
        modifier = Modifier
            .padding(16.dp)
            .clip(MaterialTheme.shapes.medium)
            .clickable {
                val intent = Intent(context, activityClass)
                context.startActivity(intent)
            },

        colors = CardDefaults.cardColors(
            containerColor = backgroundColor,
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        border = BorderStroke(width = 1.dp, color = Color(0xFFD3D3D3)),

    ) {
        Column {
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
                    .padding(15.dp)
                    .clip(shape = MaterialTheme.shapes.medium)
            )
            content()
        }
    }
}

@Composable
fun ButtonComponent(text: String, onClick: () -> Unit) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Text(text)
    }
}
