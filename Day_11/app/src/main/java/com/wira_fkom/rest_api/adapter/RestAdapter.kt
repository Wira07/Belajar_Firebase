package com.wira_fkom.rest_api.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.wira_fkom.rest_api.R
import com.wira_fkom.rest_api.retrofit.DataItem

class RestAdapter(private val dataList: List<DataItem>) : RecyclerView.Adapter<RestAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_rest, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.nama.text = item.nama
        holder.kota.text = item.kota
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nama: TextView = view.findViewById(R.id.nama)
        val kota: TextView = view.findViewById(R.id.kota)
    }
}
