package com.example.demolistview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MyAdapter(private val context: Activity, private val arrayList: ArrayList<dataModel>) :
    ArrayAdapter<dataModel>(context, R.layout.item_listview, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view = LayoutInflater.from(context).inflate(R.layout.item_listview,null)

        val title = view.findViewById<TextView>(R.id.txt_title)
        val description = view.findViewById<TextView>(R.id.txt_subtitle)

        title.text = arrayList[position].title
        description.text = arrayList[position].subTitle

        return view
    }

}