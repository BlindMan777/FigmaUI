package com.figma_ui.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FigmaUI()
        }
    }
}

/*@Composable
fun FigmaUI() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(0.dp, 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Header()
        Container(name = "Enter Prompt") {
            FirstBox()
        }
        Spacer(modifier = Modifier.height(15.dp))
        SecondBox()
        Spacer(modifier = Modifier.height(3.dp))
        Container(name = "Aspect Ratio") {
            AspectRatio()
        }
        Container(name = "Art Stile") {
            ArtStile()
        }
        Spacer(modifier = Modifier.height(12.dp))
        GenerateButton()
    }
}*/

@Composable
fun FigmaUI() {
    Scaffold(
        bottomBar = {
            BottomNavigationBar()
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
                .padding(innerPadding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Header()
            Container(name = "Enter Prompt") {
                FirstBox()
            }
            Spacer(modifier = Modifier.height(15.dp))
            SecondBox()
            Spacer(modifier = Modifier.height(3.dp))
            Container(name = "Aspect Ratio") {
                AspectRatio()
            }
            Container(name = "Art Stile") {
                ArtStile()
            }
            Spacer(modifier = Modifier.height(12.dp))
            GenerateButton()
        }
    }
}
