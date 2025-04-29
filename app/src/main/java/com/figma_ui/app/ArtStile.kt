package com.figma_ui.app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

sealed class ArtStileItemsList(val label: String, val imgID: Int) {
    data object Colorful: ArtStileItemsList("Colorful", R.drawable.image1)
    data object Real: ArtStileItemsList("Real", R.drawable.image1)
    data object Cyberpunk: ArtStileItemsList("Cyberpunk", R.drawable.image1)
}

@Composable
fun ArtStile(
    modifier: Modifier = Modifier
) {
    val items = listOf(
        ArtStileItemsList.Colorful,
        ArtStileItemsList.Real,
        ArtStileItemsList.Cyberpunk,
        ArtStileItemsList.Cyberpunk,
        ArtStileItemsList.Cyberpunk,
        ArtStileItemsList.Cyberpunk
    )
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
       items(items) { item ->
           ArtStileItem(
               label = item.label,
               imgID = item.imgID
           )
       }
    }
}

@Composable
fun ArtStileItem(
    modifier: Modifier = Modifier,
    imgID: Int,
    label: String
) {
    Column(
        modifier = modifier
            .width(100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            modifier = Modifier
                .aspectRatio(1f/1f)
                .clip(RoundedCornerShape(8.dp)),
            painter = painterResource(imgID),
            contentDescription = label,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = label,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif
        )
    }
}