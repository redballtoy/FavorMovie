package com.example.redballtoy.favormovie

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieDetailsActivity : AppCompatActivity() {
    lateinit var actorsList: RecyclerView

    companion object {
        fun getInstance(context: Context) = Intent(context, MovieDetailsActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)

        val tvBack = findViewById<TextView>(R.id.tv_back_movie_details)
        tvBack.setOnClickListener(View.OnClickListener {
            val intent = MainActivity.getInstance(this)
            startActivity(intent)
        })

        actorsList = findViewById(R.id.rv_actors)
        actorsList.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        actorsList.adapter = ActorsAdapter(Actors())

    }
}

