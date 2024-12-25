package com.pakistan_quiz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val list:List<data_list>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    class ViewHolder(view : View):RecyclerView.ViewHolder(view) {
        var heading = view.findViewById<TextView>(R.id.heading)
        var descr = view.findViewById<TextView>(R.id.descri)
        var num = view.findViewById(R.id.listnum) as TextView



    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.each_view,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        var item  = list[position]
        holder.heading.text =  item.heading
        holder.descr.text =  item.shortDes
        holder.num.text = item.num.toString()

    }

    override fun getItemCount(): Int {

        return list.size
    }

}