package com.figma_ui.app

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AspectRatio(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(5.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AspectRatioItem(
                label = "1 : 1",
                selected = true
            )
            AspectRatioItem(
                label = "3 : 2",
                selected = false
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(5.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AspectRatioItem(
                label = "9 : 16",
                selected = false
            )
            AspectRatioItem(
                label = "4 : 3",
                selected = false
            )
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(5.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AspectRatioItem(
                label = "16 : 9",
                selected = false
            )
            AspectRatioItem(
                label = "5 : 4",
                selected = false
            )
        }
    }
}

@Composable
fun AspectRatioItem(
    modifier: Modifier = Modifier,
    label: String,
    selected: Boolean = false
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = if(selected) Color.Blue else Color.Transparent,
                shape = RoundedCornerShape(size = 8.dp)
            )
            .clip(RoundedCornerShape(8.dp))
            .clickable(
                onClick = {}
            )
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            color = if(selected) Color.White else Color.Black
        )
    }
}