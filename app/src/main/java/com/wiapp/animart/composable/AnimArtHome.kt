package com.wiapp.animart.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wiapp.animart.funNextImg.NextImage

@Composable
fun AnimArtHome(paddingValues: PaddingValues){
    var imageRessource by remember { mutableStateOf(0) }
    var txtOutput by remember { mutableStateOf(0) }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Box(
            modifier = Modifier.fillMaxSize()

        ){
            Image(
                contentScale = ContentScale.Fit,
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = NextImage().listOfImage[imageRessource]),
                contentDescription = null
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, bottom = 110.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Surface(color = Color(252, 251, 251, 50)) {
                    Text(
                        modifier = Modifier.padding(5.dp),
                        text = stringResource(id = NextImage().listOfTxt[txtOutput]),
                        color = Color.White,
                        fontSize = 30.sp
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 20.dp, end = 20.dp, bottom = 35.dp),
                contentAlignment = Alignment.BottomEnd
            ){
                Row{
                    Surface(color = Color(252, 251, 251, 50)) {
                        IconButton(onClick = {
                            imageRessource++
                            txtOutput++
                            NextImage().funNextImg(imageRessource = imageRessource)
                            if(imageRessource == 5 || txtOutput == 5){
                                imageRessource = 0
                                txtOutput = 0
                            }
                        }) {
                            Icon(
                                imageVector = Icons.Default.KeyboardArrowRight,
                                contentDescription = null,
                                tint = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}