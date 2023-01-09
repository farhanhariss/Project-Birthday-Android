package com.dicoding.projectbirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class present : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_present)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Voucher Belanja"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}