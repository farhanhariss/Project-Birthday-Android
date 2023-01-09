package com.dicoding.projectbirthday

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.MediaController
import android.widget.VideoView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        //cardview
        val card_wishes : CardView = findViewById(R.id.wishes)
        val card_about_dheya : CardView = findViewById(R.id.about_dheya)
        val card_poetry : CardView = findViewById(R.id.poetry)
        val card_present : CardView = findViewById(R.id.present)
        val card_dor : CardView = findViewById(R.id.shoot)
        card_wishes.setOnClickListener(this)
        card_about_dheya.setOnClickListener(this)
        card_poetry.setOnClickListener(this)
        card_present.setOnClickListener(this)
        card_dor.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.about_dheya -> {
                val intent = Intent(this@MainActivity, about_dheya::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
            R.id.poetry -> {
                val intent = Intent(this@MainActivity, poetry::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
            R.id.present -> {
                val intent = Intent(this@MainActivity, present::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
            R.id.shoot -> {
                val intent = Intent(this@MainActivity, dor::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
            R.id.wishes -> {
                val intent = Intent(this@MainActivity,wishes::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
        }
    }

    //interract card

}