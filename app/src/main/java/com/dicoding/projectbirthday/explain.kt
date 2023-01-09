package com.dicoding.projectbirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class explain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explain)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title=":("

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}