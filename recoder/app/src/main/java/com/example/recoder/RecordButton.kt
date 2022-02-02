package com.example.recoder

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatImageButton
import java.util.jar.Attributes

class RecordButton(
        context: Context,
        attrs: AttributeSet
): AppCompatImageButton(context, attrs) {
    init {
        setBackgroundResource(R.drawable.shape_oval_button)
    }
    fun updateIconWithState(state: State) {
        when(state) {
            State.BERFORE_RECORDING -> {
                setImageResource(R.drawable.ic_record)
            }
            State.ON_PLAYING,
            State.ON_RECORDING -> {
                setImageResource(R.drawable.ic_stop)
            }
            State.AFTER_RECORDING -> {
                setImageResource(R.drawable.ic_play)
            }
        }
    }
}