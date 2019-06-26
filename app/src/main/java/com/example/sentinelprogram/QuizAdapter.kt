package com.example.sentinelprogram

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.sentinelprogram.model.Quiz
import com.squareup.picasso.Picasso

class QuizAdapter(private val quiz: ArrayList<Quiz>) : RecyclerView.Adapter<QuizAdapter.ViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(p0.context).inflate(R.layout.quiz_row, p0, false)
        val holder = ViewHolder(view)
        view.setOnClickListener{
            val intent = Intent(p0.context, QuizDetails::class.java)
            intent.putExtra("title", quiz[holder.adapterPosition].title)
            p0.context.startActivity(intent)
        }
        return holder
    }

    override fun getItemCount() = quiz.size

    override fun onBindViewHolder(p0:QuizAdapter.ViewHolder, p1: Int) {
        val quiz = quiz[p1]
        Picasso.get().load(quiz.photoUrl).into(p0.image)
        p0.title.text = quiz.title
        p0.progress.text = quiz.progress.toString()
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.photo)
        val title: TextView = itemView.findViewById(R.id.title)
        val progress: TextView = itemView.findViewById(R.id.progress)

    }
}