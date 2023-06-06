package com.example.controladministrativo.Presentation.Dasboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.controladministrativo.Presentation.Dasboard.ui.theme.ControlAdministrativoTheme

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ControlAdministrativoTheme {
                DashboardScreen()
            }
        }
    }
}
