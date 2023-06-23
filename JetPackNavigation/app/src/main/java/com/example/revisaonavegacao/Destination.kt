package com.example.revisaonavegacao

sealed class Destination(var route: String){
    object ScreenFirst: Destination("ScreenFirst")

    object ScreenSecond: Destination("ScreenSecond")

}

