package com.dasharath.googlenewsretrofir

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.indiview.view.*

class ViewDataHolder(v:View):RecyclerView.ViewHolder(v) {

    var txttitle:TextView?=null
    var txtdesc:TextView?=null
    var img:ImageView?=null

    init {
        txttitle=v.tvTitle
        txtdesc=v.tvDesc
        img=v.imageNews
    }
}