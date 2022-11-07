package com.example.assignment5p2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var txtWelcome: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindControls()
        
    }
    fun bindControls(){
        txtWelcome=findViewById(R.id.txtWelcome)
        txtWelcome.text = "Welcome "//
    }
    fun click(view: View){

        val myIntent = Intent(this, ListActivity::class.java)
        myIntent.putExtra("category",view.tooltipText)
        startActivity(myIntent)
        //Toast.makeText(this, "You clicked ${view.tooltipText} category", Toast.LENGTH_SHORT).show()
    }
}