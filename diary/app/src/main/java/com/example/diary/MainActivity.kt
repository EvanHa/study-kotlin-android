package com.example.diary

import android.content.Context
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.NumberPicker
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.edit

class MainActivity : AppCompatActivity() {

    private val numberPicker1: NumberPicker by lazy {
        findViewById<NumberPicker>(R.id.numberPicker1)
            .apply {
                minValue = 0
                maxValue = 9
            }
    }

    private val numberPicker2: NumberPicker by lazy {
        findViewById<NumberPicker>(R.id.numberPicker2)
            .apply {
                minValue = 0
                maxValue = 9
            }
    }

    private val numberPicker3: NumberPicker by lazy {
        findViewById<NumberPicker>(R.id.numberPicker3)
            .apply {
                minValue = 0
                maxValue = 9
            }
    }

    private val openButton: AppCompatButton by lazy {
        findViewById<AppCompatButton>(R.id.openButton)
    }

    private val changePasswordButton: AppCompatButton by lazy {
        findViewById<AppCompatButton>(R.id.changePasswordButton)
    }

    private var changePasswordMode = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initNumberPicker()
        initOpenButton()
        initChangePasswordButton()
    }

    private fun initNumberPicker() {
        numberPicker1
        numberPicker2
        numberPicker3
    }

    private fun initOpenButton() {
        openButton.setOnClickListener {
            if (changePasswordMode) {
                Log.d("test", "changePasswordMode : $changePasswordMode")
                Toast.makeText(this, "비밀번호 변경 모드입니다.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val passwordPreference = getSharedPreferences("password", Context.MODE_PRIVATE)
            val passwordFromUser = "${numberPicker1.value}${numberPicker2.value}${numberPicker3.value}"

            if (passwordPreference.getString("password", "000").equals(passwordFromUser)) {
                // TODO:
                // go to other activity
            } else {
                showErrorPopup()
            }
        }
    }

    private fun initChangePasswordButton() {
        changePasswordButton.setOnClickListener {
            val passwordSharedPreference = getSharedPreferences("password", Context.MODE_PRIVATE)

            if (changePasswordMode) {
                passwordSharedPreference.edit {
                    this.putString("password", "${numberPicker1.value}${numberPicker2.value}${numberPicker3.value}")
                    commit()
                }
                changePasswordMode = false
                changePasswordButton.setBackgroundColor(Color.BLACK)
            } else {
                val password = "${numberPicker1.value}${numberPicker2.value}${numberPicker3.value}"
                if (password != passwordSharedPreference.getString("password", "000")) {
                    showErrorPopup()
                    return@setOnClickListener
                }

                changePasswordButton.setBackgroundColor(Color.RED)
                Toast.makeText(this, "변경할 비밀번호를 입력하고 다시 눌러주세요", Toast.LENGTH_SHORT).show()
                changePasswordMode = true
            }
        }
    }

    private fun showErrorPopup() {
        AlertDialog.Builder(this)
            .setTitle("실패")
            .setMessage("비밀번호가 잘못되었습니다.")
            .setPositiveButton("확인") { _, _ -> }
            .create()
            .show()
    }
}