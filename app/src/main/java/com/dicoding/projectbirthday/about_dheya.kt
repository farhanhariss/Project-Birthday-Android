package com.dicoding.projectbirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class about_dheya : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_dheya)
        supportActionBar?.title="My Point of View"

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}