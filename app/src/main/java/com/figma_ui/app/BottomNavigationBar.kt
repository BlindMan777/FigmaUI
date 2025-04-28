package com.figma_ui.app.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.figma_ui.app.R

sealed class BottomNavigationBarItem(val label: String, val iconId: Int) {
    data object Home : BottomNavigationBarItem("Home", R.drawable.home_icon)
    data object Discover : BottomNavigationBarItem("Discover", R.drawable.microscope_icon)
    data object ToolBox : BottomNavigationBarItem("Tool Box", R.drawable.tool_box_icon)
    data object Settings : BottomNavigationBarItem("Settings", R.drawable.settings_icon)
    data object Profile : BottomNavigationBarItem("Profile", R.drawable.profile_icon)
}

@Composable
fun BottomNavigationBar(
    modifier: Modifier = Modifier
) {
    val items = listOf(
        BottomNavigationBarItem.Home,
        BottomNavigationBarItem.Discover,
        BottomNavigationBarItem.ToolBox,
        BottomNavigationBarItem.Settings,
        BottomNavigationBarItem.Profile
    )

    NavigationBar(
        modifier,
        containerColor = Color.White,
    ) {
        items.forEach { item ->
            CustomNavigationBarItem(
                modifier = Modifier.weight(1f),
                selected = item == items.firstOrNull(),
                item = item
            )
        }
    }
}

@Composable
fun RowScope.CustomNavigationBarItem(
    modifier: Modifier = Modifier,
    selected: Boolean,
    item: BottomNavigationBarItem,
    iconSize: Dp = 30.dp,
    defaults: NavigationBarItemColors = NavigationBarItemDefaults.colors(
        indicatorColor = Color.Transparent,
        selectedIconColor = Color.Blue,
        selectedTextColor = Color.Blue,
        unselectedIconColor = Color.LightGray,
        unselectedTextColor = Color.LightGray
    ),
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .clickable(
                onClick = {},
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier
                .size(iconSize),
            painter = painterResource(item.iconId),
            contentDescription = item.label,
            tint = if (selected) defaults.selectedIconColor else defaults.unselectedIconColor
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = item.label,
            color = if (selected) defaults.selectedTextColor else defaults.unselectedTextColor
        )
    }
}