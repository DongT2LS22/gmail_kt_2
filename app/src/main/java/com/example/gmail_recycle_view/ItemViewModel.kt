package com.example.gmail_recycle_view

import androidx.annotation.DrawableRes

data class ItemViewModel(val username: String,
                         val title : String,
                         val content: String ,
                         val time: String,
    @DrawableRes val image : Int) {
}