package com.pakistan_quiz

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.time.times


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val title_listView = findViewById<LinearLayout>(R.id.title_listView)

//        this help to automatic detect the heigh of deveice and take some margin from it
        val layoutParams = title_listView.layoutParams as ViewGroup.MarginLayoutParams
        val screenHeight = resources.displayMetrics.heightPixels
        layoutParams.topMargin = (screenHeight * 0.1).toInt()
        title_listView.layoutParams = layoutParams


        val listing = findViewById<ListView>(R.id.listing)

        val List_item= arrayOf("Reading","Writing","Open","Go for Shoping","Attend the Seminar")


        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, List_item)

        listing.adapter = adapter

        listing.setOnItemClickListener { parent, view, position, id ->

            val selection = parent.getItemAtPosition(position) as String
            Toast.makeText(this,"you have clicked on it $selection",Toast.LENGTH_LONG).show()
        }





    }
}


