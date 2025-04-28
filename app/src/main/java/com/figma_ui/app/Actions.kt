package com.figma_ui.app

import androidx.annotation.Size
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Actions(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(Color.Transparent),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ActionItem(
            iconID = R.drawable.img_icon,
            label = "Add Photo"
        )
        Spacer(modifier = Modifier.width(12.dp))
        ActionItem(
            iconID = R.drawable.lamp_charge,
            label = "Inspiration"
        )
    }
}

@Composable
fun RowScope.ActionItem(
    modifier: Modifier = Modifier,
    iconID: Int,
    iconSize: Dp = 30.dp,
    iconColor: Color = Color.DarkGray,
    label: String
) {
    Row(
        modifier = modifier
            .weight(1f)
            .background(
                color = Color.White,
                shape = RoundedCornerShape(size = 16.dp)
            )
            .padding(20.dp, 13.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Icon(
            modifier = Modifier.size(iconSize),
            painter = painterResource(iconID),
            contentDescription = label,
            tint = iconColor
        )
        Text(
            text = label,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
    }
}


