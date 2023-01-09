package com.dicoding.projectbirthday

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class wishes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wishes)

        supportActionBar?.title="For You"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //video wishes
        val videoWishes : VideoView = findViewById(R.id.video_wishes)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoWishes)

        val offlineUri = Uri.parse("android.resource://$packageName/${R.raw.happybirthday_2}")
        videoWishes.setMediaController(mediaController)
        videoWishes.setVideoURI(offlineUri)
        videoWishes.requestFocus()
        videoWishes.start()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}