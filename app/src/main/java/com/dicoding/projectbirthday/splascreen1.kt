package com.dicoding.projectbirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class splascreen1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splascreen1)

        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent(this, splashscreen2::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
        },3000)

    }
}