package com.figma_ui.app

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Prompt() {
    var promptState by remember {
        mutableStateOf("")
    }

    BasicTextField(
        modifier = Modifier
            .fillMaxWidth(),
        value = promptState,
        onValueChange = {newText ->
            promptState = newText
        },
        textStyle = TextStyle(
            color = Color.Black,
            fontSize = 20.sp,
            lineHeight = 20.sp
        ),
        minLines = 4,
        singleLine = false,
        decorationBox = { innerTextField ->
            if(promptState.isEmpty()) {
                Text(
                    text = "Type anything...",
                    color = Color.LightGray,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 17.sp
                )
            }
            innerTextField()
        },
        cursorBrush = SolidColor(Color.Blue)
    )
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            modifier = Modifier
                .size(30.dp),
            imageVector = Icons.Filled.Refresh,
            contentDescription = stringResource(R.string.refresh_icon),
            tint = Color.Blue
        )
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "0/100",
                color = Color.DarkGray,
                fontSize = 18.sp
            )
            Spacer(modifier = Modifier.width(4.dp))
            Icon(
                imageVector = Icons.Outlined.Close,
                contentDescription = stringResource(R.string.close_icon),
                tint = Color.Blue
            )
        }
    }
}
