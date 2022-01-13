package com.example.mavenmultiplechannel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mavenmultiplechannel.databinding.ActivityMainBinding
import com.example.myapplication.Utils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this,R.layout.activity_main)

        val buffer = StringBuffer("\n")
        buffer.run {
            append("${Utils.getVer()}")
            append("\n")
            append("VerWihtFlavor : ${Utils.getVerWihtFlavor(this@MainActivity)}")
        }

        binding.tv.append(buffer.toString())
    }
}