package com.maha.screepic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ScreePic)
        setContentView(R.layout.activity_main)

    }


    fun setMainText(view: View) {
        findViewById<TextView>(R.id.textMenu).text = view.tag.toString()
    }




}


