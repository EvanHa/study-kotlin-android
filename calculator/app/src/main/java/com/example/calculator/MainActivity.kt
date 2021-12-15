package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val expressionTextView: TextView by lazy {
        findViewById<TextView>(R.id.expressionTextView)
    }

    private val resultTextView: TextView by lazy {
        findViewById<TextView>(R.id.resultTextView)
    }

    private val historyLayout: View by lazy {
        findViewById<View>(R.id.historyLayout)
    }

    private val historyLinearLayout: LinearLayout by lazy {
        findViewById<LinearLayout>(R.id.historyLinearLayout)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // clearButtonClicked
    fun clearButtonClicked(v: View) {

    }
    // buttonClicked
    fun buttonClicked(v: View) {

    }
    // historyButtonClicked
    fun historyButtonClicked(v: View) {

    }
    // resultButtonClicked
    fun resultButtonClicked(v: View) {

    }
    // closeHistoryButtonClicked
    fun closeHistoryButtonClicked(v: View) {

    }
    // historyClearButtonClicked
    fun historyClearButtonClicked(v: View) {

    }

}