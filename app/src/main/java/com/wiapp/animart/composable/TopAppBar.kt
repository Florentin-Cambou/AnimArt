package com.wiapp.animart.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.material.TopAppBar

@Composable
fun TopAppBar(){
    TopAppBar(
        content = { Text(text = "Anim'Art")}
    )
}