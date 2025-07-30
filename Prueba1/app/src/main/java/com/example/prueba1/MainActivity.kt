package com.example.prueba1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.prueba1.ui.theme.Prueba1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val context = LocalContext.current
            val fondo = Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF0F2027),
                    Color(0xFF2C5364),
                    Color(0xFF642B73)
                )
            )
            Prueba1Theme {
                println("Hello world")
                Column(modifier = Modifier.fillMaxSize().background(brush = fondo), horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center)
                {
                    Text(
                        text = "Julián Divas",
                        style = TextStyle(fontSize=24.sp, fontWeight = FontWeight.Bold, color = Color(0xFFF5F5F5))
                    )

                    Text(
                        text = "Bienvenido a mi primera app",
                        style = TextStyle(fontSize=24.sp, fontWeight = FontWeight.Bold, color = Color(0xFFF5F5F5))
                    )

                    Button(
                        onClick = {
                            Toast.makeText(context,
                                "Kotlin es genial!", Toast.LENGTH_SHORT
                            ).show()
                        }
                    ) {
                        Text(text = "Comenzar",
                            style = TextStyle(fontSize = 16.sp))
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Prueba1Theme {
        Greeting("Android")
    }
}