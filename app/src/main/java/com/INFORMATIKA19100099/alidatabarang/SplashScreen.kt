package com.INFORMATIKA19100099.alidatabarang

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.postDelayed

class SplashScreen : AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        Handler().postDelayed({
            val i = Intent (this,MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}