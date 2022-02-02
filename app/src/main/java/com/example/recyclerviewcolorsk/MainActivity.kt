package com.example.recyclerviewcolorsk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import java.util.Random

class MainActivity : AppCompatActivity() {
    val list = mutableListOf<String>("Mars", "Venus", "Earth")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val lv = findViewById<ListView>(R.id.list)
        val adapter = ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, list)
        lv.adapter = adapter
        // new code goes here:
        val button = findViewById(R.id.roll) as Button
        button.setOnClickListener {
            list.shuffle()
            adapter.notifyDataSetChanged()
        }
    }
}