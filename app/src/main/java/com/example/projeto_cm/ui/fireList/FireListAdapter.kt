package com.example.projeto_cm.ui.fireList

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.projeto_cm.R

class FireListAdapter: RecyclerView.Adapter<FireListAdapter.FireListViewHolder>(){

    private var titles = arrayOf("Fogo 1","Fogo 2","Fogo 3","Fogo 4","Fogo 5","Fogo 6")
    private var details = arrayOf("01/02/2022","02/02/2022","03/02/2022","04/02/2022","05/02/2022","06/02/2022")
    private var images = intArrayOf(R.mipmap.ic_fire,R.mipmap.ic_fire,R.mipmap.ic_fire,R.mipmap.ic_fire,R.mipmap.ic_fire,R.mipmap.ic_fire)

    class FireListViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FireListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.fragment_fire_list,parent,false)
        return FireListViewHolder(v)
    }

    override fun onBindViewHolder(holder: FireListViewHolder, position: Int) {
        holder.itemTitle.text = titles[position]
        holder.itemDetail.text = details[position]
        holder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int{
        return titles.size
    }

}