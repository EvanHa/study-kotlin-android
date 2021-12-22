package com.example.photoframe

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class PhotoFrameActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d("PhotoFrame", "onCreate!")
    }
}