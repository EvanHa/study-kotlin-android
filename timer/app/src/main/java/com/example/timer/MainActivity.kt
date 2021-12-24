package com.example.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val TAG : String = "MainActivity"

    private val remainMinutesTextView: TextView by lazy {
        findViewById(R.id.remainMinutesTextView)
    }

    private val remainSecondsdTextView: TextView by lazy {
        findViewById(R.id.remainSecondsTextView)
    }

    private val seekBar: SeekBar by lazy {
        findViewById(R.id.seekBar)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bindViews()
    }

    private fun bindViews() {
        seekBar.setOnSeekBarChangeListener(
            object: SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(
                    seekBar: SeekBar?,
                    progress: Int,
                    fromUser: Boolean
                ) {
                    Log.d(TAG, "SeekBar Changed")
                    remainMinutesTextView.text = "%02d".format(progress)
                }

                override fun onStartTrackingTouch(seekBar: SeekBar?) {

                }

                override fun onStopTrackingTouch(seekBar: SeekBar?) {

                }
            }
        )
    }
}