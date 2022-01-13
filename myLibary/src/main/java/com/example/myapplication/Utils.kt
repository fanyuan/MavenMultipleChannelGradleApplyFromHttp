package com.example.myapplication

import android.content.Context

object Utils {
    @JvmStatic
    fun getVer():String{
        return "v_1.0"
    }
    @JvmStatic
    fun getVerWihtFlavor(context: Context):String{
        return "${context.resources.getString(R.string.flavor)} = v_1.0"
    }
}