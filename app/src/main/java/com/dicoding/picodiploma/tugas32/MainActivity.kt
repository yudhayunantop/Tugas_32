package com.dicoding.picodiploma.tugas32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

private lateinit var imgPreview: ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgPreview = findViewById(R.id.img_preview)
        Glide.with(this).load(R.drawable.fronalpstock_big).into(imgPreview)

    }
}