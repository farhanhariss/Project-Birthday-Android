package com.dicoding.projectbirthday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class bercanda2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bercanda2)

        supportActionBar?.hide()

        val phoneNumber = "085212436005"

        Handler().postDelayed({
            val dialPhoneIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialPhoneIntent)
            overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
        },3000)
    }
}