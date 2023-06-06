package com.example.controladministrativo.Controllers

import android.icu.text.AlphabeticIndex
import android.util.Log

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener


data class GradoSeccion(
    val nombre: String?,
    val seccion: String?
)

class GradoSeccionController {
    private val database: FirebaseDatabase = FirebaseDatabase.getInstance()
    private val reference: DatabaseReference = database.getReference("Grado")

    fun guardarGradoSeccion(gradoSeccion: GradoSeccion) {
        val gradoSeccionRef = reference.push().apply {
            child("nombre").setValue(gradoSeccion.nombre)
            child("seccion").setValue(gradoSeccion.seccion)
        }

        // Opcionalmente, puedes agregar un listener para manejar el resultado de la operación
        gradoSeccionRef.addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                // Operación completada con éxito
            }

            override fun onCancelled(error: DatabaseError) {
                // Operación cancelada o fallida
            }
        })
    }
}
