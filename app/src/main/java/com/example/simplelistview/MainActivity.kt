package com.example.simplelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 STEP Adapter View
        var listview = findViewById<ListView>(R.id.lv)


        //2nd STEP DATA SOURCE

        var worldCupARRAY = arrayOf(
            "India",
            "Australia",
            "England",
            "New zealand",
            "Srilanka",
            "West Indies",
            "Pakistan" ,
            "Canada",
            "Poland",
            "UAE",
            "Africa",
            "Bangladesh",
            "Nepal",
            "Afghanistan",
            "China",
            "Singapore",
            "Sahil",
            "Shweta")


        //3 STEP ADAPTER

        val myAdapter = ArrayAdapter(this,R.layout.list_item,R.id.textView,worldCupARRAY)

        listview.adapter = myAdapter


    }
}
