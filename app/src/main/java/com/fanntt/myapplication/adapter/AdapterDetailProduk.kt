package com.fanntt.myapplication.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fanntt.myapplication.MainActivity
import com.fanntt.myapplication.model.ModelDetailProduk

class AdapterDetailProduk(
    val getDetaildoctor: MainActivity,
    val itemDoctorList: List<ModelDetailProduk>
) : RecyclerView.Adapter<AdapterDetailProduk.MyViewHolder>(){
    class MyViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

}