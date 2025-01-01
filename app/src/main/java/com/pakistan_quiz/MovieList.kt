package com.pakistan_quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MovieList : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_movie_list)

        val title_listView = findViewById<LinearLayout>(R.id.main)
        val layoutParams = title_listView.layoutParams as ViewGroup.MarginLayoutParams
        val screenHeight = resources.displayMetrics.heightPixels
        layoutParams.topMargin = (screenHeight * 0.2).toInt()
        title_listView.layoutParams = layoutParams

        val movieList = findViewById<RecyclerView>(R.id.recyclerList)
        val nextDiaglogSCreen = findViewById(R.id.nextScreenDialog) as Button




        val itemList = listOf(
            data_list("Heading 1", "Short description 1", 23),
            data_list("Heading 2", "Short description 2", 53),
            data_list("Heading 3", "Short description 3", 34)
        )

//        set layout manager
        movieList.layoutManager = LinearLayoutManager(this)
        movieList.adapter = MyAdapter(itemList)




        nextDiaglogSCreen.setOnClickListener(){
            startActivity(Intent(this, dialog_types::class.java))
        }




    }
}