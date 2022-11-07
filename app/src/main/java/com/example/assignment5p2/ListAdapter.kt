package com.example.assignment5p2

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.Bitmap
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.currentCoroutineContext
import java.io.File

class ListAdapter(var itemList:ArrayList<Product>, var context:Context) : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemlist,parent,false)
        return ListViewHolder(view)

    }
    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {

        var imgId=context.resources.getIdentifier(itemList[position].image,"drawable",context.packageName);
        holder.itemView.findViewById<ImageView>(R.id.imgItem).setImageResource(imgId);
        holder.itemView.findViewById<TextView>(R.id.lblName).text = itemList[position].name
        holder.itemView.findViewById<TextView>(R.id.lblColor).text = itemList[position].color
        holder.itemView.findViewById<TextView>(R.id.lblPrice).text = itemList[position].price.toString()

        holder.itemView.setOnClickListener{
//            val myIntent = Intent(this, DetailsActivity::class.java)
//            myIntent.putExtra("id",itemList[position].itemid)
//            myIntent.putExtra("name",itemList[position].name)
//            myIntent.putExtra("color",itemList[position].color)
//            myIntent.putExtra("price",itemList[position].price)
//            myIntent.putExtra("description",itemList[position].desc)
//
//            startActivity(myIntent)
        }
    }
    override fun getItemCount(): Int {
        return itemList.size
    }
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        init {
            itemView.setOnClickListener{
                val myIntent = Intent(context, DetailsActivity::class.java)
            myIntent.putExtra("id",itemList[adapterPosition].itemid)
            myIntent.putExtra("name",itemList[adapterPosition].name)
            myIntent.putExtra("color",itemList[adapterPosition].color)
            myIntent.putExtra("price",itemList[adapterPosition].price)
            myIntent.putExtra("description",itemList[adapterPosition].desc)
            context.startActivity(myIntent)
            }
        }
    }
}