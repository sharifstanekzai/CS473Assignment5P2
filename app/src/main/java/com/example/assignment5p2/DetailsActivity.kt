package com.example.assignment5p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    private  var lblName:TextView=findViewById(R.id.lblName)
    private  var lblColor:TextView=findViewById(R.id.lblColor)
    private  var lblId:TextView=findViewById(R.id.lblId)
    private  var lblPrice:TextView=findViewById(R.id.lblPrice)
    private  var lblDescription:TextView=findViewById(R.id.lblDescription)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val myrIntent = intent
//        val name = myrIntent.getStringExtra("name")
//        val color = myrIntent.getStringExtra("color")
//        val id = myrIntent.getStringExtra("id")
//        val price = myrIntent.getStringExtra("price")
//        val description = myrIntent.getStringExtra("description")

        lblName.text=myrIntent.getStringExtra("name")
        lblColor.text=myrIntent.getStringExtra("color")
      //  lblId.text=myrIntent.getStringExtra("id")
        lblPrice.text=myrIntent.getStringExtra("price")
      //  lblDescription.text=myrIntent.getStringExtra("description")

    }
}