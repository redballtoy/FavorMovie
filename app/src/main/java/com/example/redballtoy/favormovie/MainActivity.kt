package com.example.redballtoy.favormovie

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    companion object {
        fun getInstance(context: Context) = Intent(context, MainActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvGoToMovieDetails: TextView = findViewById(R.id.tv_go_movie_detail_activity)
        tvGoToMovieDetails.setOnClickListener {
            val intent = MovieDetailsActivity.getInstance(this)
            startActivity(intent)
        }
    }


}