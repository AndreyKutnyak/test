package com.example.sort_othod

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyAdapter2(private val newList2 : ArrayList<News2>) :
    RecyclerView.Adapter<MyAdapter2.MyViewHolder2>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder2 {
       val itemView2 = LayoutInflater.from(parent.context).inflate(R.layout.list_item2, parent, false)
        return MyViewHolder2(itemView2)
    }

    override fun getItemCount(): Int {
        return newList2.size
    }

    override fun onBindViewHolder(holder: MyViewHolder2, position: Int) {
        val currentItem = newList2[position]
        holder.title2.text = currentItem.titleList2
    }

    class MyViewHolder2(itemView2 : View) : RecyclerView.ViewHolder(itemView2) {

        val title2: TextView = itemView2.findViewById(R.id.title2)
    }
}