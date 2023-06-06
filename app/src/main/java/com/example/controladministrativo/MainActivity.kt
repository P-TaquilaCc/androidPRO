package com.example.controladministrativo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.controladministrativo.Presentation.Login.LoginScreen
import com.example.controladministrativo.ui.theme.ControlAdministrativoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ControlAdministrativoTheme {
                LoginScreen()
            }
        }
    }
}
