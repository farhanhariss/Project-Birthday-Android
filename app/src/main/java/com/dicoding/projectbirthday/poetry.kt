package com.dicoding.projectbirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class poetry : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poetry)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title="Meng-chairil Anwar"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}