package com.figma_ui.app

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
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

sealed class AspectRatioItemsList(val label: String, val selected: Boolean) {
    data object OneToOne: AspectRatioItemsList("1 : 1", true)
    data object ThreeToTwo: AspectRatioItemsList("3 : 2", false)
    data object NineToSixteen: AspectRatioItemsList("9 : 16", false)
    data object FourToThree: AspectRatioItemsList("4 : 3", false)
    data object SixteenToNine: AspectRatioItemsList("16 : 9", false)
    data object FiveToFour: AspectRatioItemsList("5 : 4", false)
}

@Composable
fun AspectRatio(
    modifier: Modifier = Modifier
) {
    val items = listOf(
        AspectRatioItemsList.OneToOne,
        AspectRatioItemsList.ThreeToTwo,
        AspectRatioItemsList.NineToSixteen,
        AspectRatioItemsList.FourToThree,
        AspectRatioItemsList.SixteenToNine,
        AspectRatioItemsList.FiveToFour
    )
    Column(
        modifier = modifier
            .fillMaxWidth(),
    ) {
        items.chunked(3).forEach{ rowItems ->
            Row(
                modifier = Modifier
                    .padding(5.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                if(rowItems.size == 3) {
                    rowItems.forEach { item ->
                        AspectRatioItem(
                            label = item.label,
                            selected = item.selected
                        )
                    }
                } else if(rowItems.size == 2) {
                    rowItems.forEach { item ->
                        AspectRatioItem(
                            label = item.label,
                            selected = item.selected
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                } else if(rowItems.size == 1) {
                    rowItems.forEach { item ->
                        AspectRatioItem(
                            label = item.label,
                            selected = item.selected
                        )
                    }
                    Spacer(modifier = Modifier.weight(2f))
                }
            }
        }

    }
}

@Composable
fun RowScope.AspectRatioItem(
    modifier: Modifier = Modifier,
    label: String,
    selected: Boolean = false
) {
    Row(
        modifier = modifier
            .weight(1f)
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