package com.dasharath.googlenewsretrofir

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MyAdapter(private val context: Context,private val list1: ArrayList<Articles>):RecyclerView.Adapter<ViewDataHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewDataHolder {

        var inf=LayoutInflater.from(context).inflate(R.layout.indiview,parent,false)
        return ViewDataHolder(inf)
    }

    override fun getItemCount(): Int =list1.size

    override fun onBindViewHolder(holder: ViewDataHolder, position: Int) {

        holder.txttitle?.text=list1.get(position).title
        holder.txtdesc?.text=list1.get(position).description
        Glide.with(context).load(list1?.get(position).urlToImage).into(holder.img!!)

    }
}