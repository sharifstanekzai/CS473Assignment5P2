package com.example.assignment5p2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ListActivity : AppCompatActivity() {
    private lateinit var recyclerView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        recyclerView=findViewById(R.id.recyclerView)

        var products=ArrayList<Product>();
        val myrIntent = intent
        val category = myrIntent.getStringExtra("category")

        if (category.equals("Electronics")){
            products.add(Product("Smart TV",1000,"Black","tv","1","4k Smart TV"));
            products.add(Product("Laptop",1359,"Silver","laptop","2","i9 laptop"));
            products.add(Product("Projector",499,"Blue","projector","3","QHD projector"));
            products.add(Product("Printer",259,"Blue","printer","4","Laserjet printer"));
            products.add(Product("Headphones",180,"Purple","headphones","5","ANC headphones"));
        }
        else if(category.equals("Clothing")){
            products.add(Product("Dress",1000,"Red","dress","1","Party dress"));
            products.add(Product("High Heels",1359,"Red","highheels","2","Prada high heels"));
            products.add(Product("Hawaiian Shirt",499,"Red","hawaiianshirt","3","Casual Hawaiian shirt"));
            products.add(Product("Pants",259,"Blue","pants","4","Jeans pants"));
            products.add(Product("Sneakers",180,"Red","sneakers","5","Comfy sneakers"));
        }
        else if(category.equals("Beauty")){
            products.add(Product("Brush",7,"Black","brush","1","Makeup brush"));
            products.add(Product("Lipstick",10,"Red","lipstick","2","Dior lipstick"));
            products.add(Product("Liquid Lipstick",12,"liquidlipstick","","3","Liquid lipstick"));
            products.add(Product("Comb",2,"Red","salon","4","Comb and scissor"));
            products.add(Product("Skincare Cream and Lotion",44,"White","skincare","5","cream and lotion"));
        }
        else{
            products.add(Product("Burger",3,"","burger","1","Delux burger"));
            products.add(Product("Chicken",7,"","chicken","2","Fried chicken"));
            products.add(Product("Donut",1,"","donut","3","Creamy donut"));
            products.add(Product("Egg",1,"","egg","4","Fried egg"));
            products.add(Product("Ramen",4,"","ramen","5","Korean ramen"));
        }

        var adapter=ListAdapter(products,this);
        recyclerView.adapter=adapter

    }
    public fun click(view:View){
        val myIntent = Intent(this, DetailsActivity::class.java)
        var name=view.findViewById<TextView>(R.id.lblName).text.toString()
        var color=view.findViewById<TextView>(R.id.lblColor).text.toString()
        var price=view.findViewById<TextView>(R.id.lblPrice).text.toString()
        var id=view.findViewById<TextView>(R.id.lblId).text.toString()
        var description=view.findViewById<TextView>(R.id.lblDescription).text.toString()

       // myIntent.putExtra("id",view.findViewById<TextView>(R.id.lblId).text.toString())
        myIntent.putExtra("name",view.findViewById<TextView>(R.id.lblName).text.toString())
        myIntent.putExtra("color",view.findViewById<TextView>(R.id.lblColor).text.toString())
        myIntent.putExtra("price",view.findViewById<TextView>(R.id.lblPrice).text.toString())
       // myIntent.putExtra("description",view.findViewById<TextView>(R.id.lblDescription).text.toString())

        startActivity(myIntent)
    }
}