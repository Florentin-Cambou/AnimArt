package com.wiapp.animart.funNextImg

import androidx.compose.foundation.layout.PaddingValues
import com.wiapp.animart.R
import com.wiapp.animart.composable.AnimArtHome

class NextImage(){
    val listOfImage = listOf(
        R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,
        R.drawable.img5,
    )

    val listOfTxt = listOf(
        R.string.image_1,R.string.image_2,R.string.image_3,R.string.image_4,
        R.string.image_5
    )

    fun funNextImg(imageRessource: Int){
        when(imageRessource){
            1 -> listOfImage[0]
            2 -> listOfImage[1]
            3 -> listOfImage[2]
            4 -> listOfImage[3]
            5 -> listOfImage[4]
            else -> {}
       }
    }

}