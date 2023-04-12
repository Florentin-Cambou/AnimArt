package com.wiapp.animart.composable

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable

@Composable
fun ScaffoldComposable(){
    Scaffold(
        //topBar = { TopAppBar() },
        content = {paddingValues -> AnimArtHome(paddingValues = paddingValues)  }
    )
}