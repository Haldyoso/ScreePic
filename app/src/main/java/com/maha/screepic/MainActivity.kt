package com.maha.screepic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ScreePic)
        setContentView(R.layout.activity_main)
        findViewById<ImageButton>(R.id.buttonChangeDisplayText).setOnClickListener{
            findViewById<TextView>(R.id.textViewDisplayTextChange).text = "nieco"
        }






    }










}