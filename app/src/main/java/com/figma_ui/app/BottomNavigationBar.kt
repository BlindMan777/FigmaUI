package com.figma_ui.app

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigationBar() {
    NavigationBar(
        containerColor = Color.White
    ) {
        NavigationBarItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(R.drawable.home_icon),
                    contentDescription = "Головна",
                    tint = Color.Blue
                )
            },
            label = {
                Text(
                    text = "Home",
                    color = Color.Blue
                )
            },
            colors = NavigationBarItemDefaults.colors(
                indicatorColor = Color.Transparent
            )
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(R.drawable.microscope_icon),
                    contentDescription = "",
                    tint = Color.LightGray
                )
            },
            label = {
                Text(
                    text = "Discover",
                    color = Color.LightGray
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(R.drawable.tool_box_icon),
                    contentDescription = "",
                    tint = Color.LightGray
                )
            },
            label = {
                Text(
                    text = "Tool Box",
                    color = Color.LightGray
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(R.drawable.settings_icon),
                    contentDescription = "",
                    tint = Color.LightGray
                )
            },
            label = {
                Text(
                    text = "Settings",
                    color = Color.LightGray
                )
            }
        )
        NavigationBarItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    modifier = Modifier
                        .size(30.dp),
                    painter = painterResource(R.drawable.profile_icon),
                    contentDescription = "",
                    tint = Color.LightGray
                )
            },
            label = {
                Text(
                    text = "Profile",
                    color = Color.LightGray
                )
            }
        )
    }
}
