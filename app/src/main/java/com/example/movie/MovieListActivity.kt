package com.example.movie

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_movie_list.*

class MovieListActivity : AppCompatActivity() {

    val movieList : ArrayList<Movie> = arrayListOf(
        Movie("영화1", 11.1, "1시간의 흐름은..", "2020-08-26", R.drawable.m1),
        Movie("영화2", 22.2, "2시간의 흐름은..", "2020-08-27", R.drawable.m2),
        Movie("영화3", 22.34, "3시간의 흐름은..", "2020-08-28", R.drawable.m3),
        Movie("영화4", 22.45, "4시간의 흐름은..", "2020-08-29", R.drawable.m4)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_list)

        val adapter = MovieAdapter(this, movieList)
        movieRecycler.adapter = adapter

        val lm = LinearLayoutManager(this)
        movieRecycler.layoutManager = lm

    }
}