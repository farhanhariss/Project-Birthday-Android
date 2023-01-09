package com.dicoding.projectbirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.MainThread

class dor : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dor)

        supportActionBar?.title="Aduh deg degan.."
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val button_yes = findViewById<Button>(R.id.btn_yes)
        val button_no = findViewById<Button>(R.id.btn_no)
        
        button_yes.setOnClickListener(this)
        button_no.setOnClickListener(this)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_yes -> {
                val intent = Intent(this@dor,miscall::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
            R.id.btn_no -> {
                val intent = Intent(this@dor,bercanda::class.java)
                startActivity(intent)
                overridePendingTransition(R.anim.slide_right_in_fix,R.anim.slide_right_out_fix)
            }
    }
}


}
