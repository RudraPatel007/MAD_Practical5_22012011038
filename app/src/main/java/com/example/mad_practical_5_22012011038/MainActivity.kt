package com.example.mad_practical_5_22012011038

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MAD_Practical_5_22012011038Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) {
                    AppNavigation(context = this)
                }
            }
        }
    }
}

private fun MainActivity.MAD_Practical_5_22012011038Theme(function: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
