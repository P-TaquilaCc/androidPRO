package com.example.controladministrativo.Controllers

import com.example.controladministrativo.Presentation.Login.AuthController
import com.google.firebase.auth.FirebaseAuth

class AuthControllerImpl  : AuthController {

    private val firebaseAuth = FirebaseAuth.getInstance()

    override fun login(email: String, password: String, onLoginResult: (Boolean) -> Unit) {

        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    onLoginResult.invoke(true)
                } else {
                    onLoginResult.invoke(false)
                }
            }

    }
}