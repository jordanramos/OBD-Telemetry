package com.example.obdtelemetry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.obdtelemetry.ui.theme.BackgroundGrey
import com.example.obdtelemetry.ui.theme.ButtonBlue
import com.example.obdtelemetry.ui.theme.ButtonOrange
import com.example.obdtelemetry.ui.theme.OBDTelemetryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            OBDTelemetryTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize()
            .background(BackgroundGrey),
        contentAlignment = Alignment.Center
    ){
        Card(
            colors = CardDefaults.cardColors(
                containerColor = BackgroundGrey
            ),
            modifier = Modifier
            ,

            onClick = {}
        ){
            Box(
                modifier = Modifier
                    .width(1000.dp)
                    .height(300.dp)
                    .clip(RoundedCornerShape(80.dp))
                    .background(ButtonBlue)
                ,
                contentAlignment = Alignment.Center
            ){
                Text(
                    fontSize = 175.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.White,
                    text = "Connect"
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    OBDTelemetryTheme {
        Greeting("Android")
    }
}