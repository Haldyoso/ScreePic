package com.maha.screepic

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class SplashScreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash_screen)

        val botAnimation = AnimationUtils.loadAnimation(this,R.anim.bot_animation)


        tvBrand.startAnimation(botAnimation)

        val splashScreenTimeOut = 4000
        val homeIntent = Intent(this@SplashScreen, MainActivity::class.java )

        Handler().postDelayed({
            startActivity(homeIntent)
            finish()
        }, splashScreenTimeOut.toLong() )


    }
}