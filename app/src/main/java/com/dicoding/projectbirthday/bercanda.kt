package com.dicoding.projectbirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class bercanda : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bercanda)


        val button_yes2 = findViewById<Button>(R.id.btn_yes2)
        val button_no2 = findViewById<Button>(R.id.btn_no2)

        button_yes2.setOnClickListener(this)
        button_no2.setOnClickListener(this)


        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title=":("
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_yes2 -> {
                val intent = Intent(this@bercanda,bercanda2::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
            R.id.btn_no2 -> {
                val intent = Intent(this@bercanda,explain::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
