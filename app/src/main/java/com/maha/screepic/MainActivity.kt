package com.maha.screepic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_ScreePic)
        setContentView(R.layout.activity_main)

        //Working buttons
        findViewById<ImageButton>(R.id.bu_New).setOnClickListener{
            findViewById<TextView>(R.id.textMenu).text =
                findViewById<TextView>(R.id.tv_New).text}

        findViewById<ImageButton>(R.id.bu_Cars).setOnClickListener{
            findViewById<TextView>(R.id.textMenu).text =
                    findViewById<TextView>(R.id.tv_Cars).text}

        findViewById<ImageButton>(R.id.bu_Dark).setOnClickListener{
            findViewById<TextView>(R.id.textMenu).text =
                    findViewById<TextView>(R.id.tv_Dark).text}

        findViewById<ImageButton>(R.id.bu_Light).setOnClickListener{
            findViewById<TextView>(R.id.textMenu).text =
                    findViewById<TextView>(R.id.tv_Light).text}

        findViewById<ImageButton>(R.id.bu_Nature).setOnClickListener{
            findViewById<TextView>(R.id.textMenu).text =
                    findViewById<TextView>(R.id.tv_Nature).text}

        findViewById<ImageButton>(R.id.bu_PPL).setOnClickListener{
            findViewById<TextView>(R.id.textMenu).text =
                    findViewById<TextView>(R.id.tv_PPL).text}

        findViewById<ImageButton>(R.id.bu_xxx).setOnClickListener{
            findViewById<TextView>(R.id.textMenu).text =
                    findViewById<TextView>(R.id.tv_xxx).text}






    }




    /* fun nieco2(view: View) {
 
         findViewById<ImageButton>(R.id.buttonChangeDisplayText).setOnClickListener{
             findViewById<TextView>(R.id.textViewDisplayTextChange).text = "nieco"}
     }*/




}