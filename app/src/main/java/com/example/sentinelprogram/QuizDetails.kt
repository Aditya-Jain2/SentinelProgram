package com.example.sentinelprogram

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.quiz_details.*

class QuizDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.quiz_details)

        val title = intent.getStringExtra("title")
        quiz_name.text = title

        take_quiz.setOnClickListener {
            AlertDialog.Builder(this)
                .setMessage("Let's Go")
                .setPositiveButton("Ok") { p0, p1 -> }
                .create()
                .show()
        }
    }
}