package com.example.musicappui.ui.theme

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.musicappui.R

@Composable
fun Browse() {

    val categories = listOf("Hits", "Happy", "Workout", "Yoga", "Romance", "Running")

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.LightGray)
    ) {
        items(categories) { cat ->
            BrowserItems(cat = cat, drawable = R.drawable.baseline_library_music_24)
        }
    }
}


@Composable
fun BrowserItems(cat: String, drawable: Int) {
    Card(
        modifier = Modifier.padding(16.dp).size(200.dp),
        border = BorderStroke(3.dp, color = Color.Cyan),
        backgroundColor = Color.Cyan

    ) {
        Column (
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Text(text = cat,
                fontSize = 18.sp)

            Image(painter = painterResource(id = drawable), contentDescription = cat)
        }

    }

}