package com.example.sentinelprogram

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.sentinelprogram.model.Quiz
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val quiz = arrayListOf<Quiz>()

        for (i in 0..100){
            quiz.add(Quiz("Quiz #$i", "https://image.freepik.com/free-vector/quiz-logo_2728-12.jpg", 1.99))
        }

        recycler_view.apply {
            layoutManager = GridLayoutManager(this@MainActivity, 2)
            adapter = QuizAdapterquiz
        }
    }

}
