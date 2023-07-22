package com.dewakoding.tutorialalquran1.ui

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dewakoding.tutorialalquran1.databinding.ItemAyahBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 14/07/23 - 14.55

 **/
class AyahAdapter(val id: Integer): RecyclerView.Adapter<AyahAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemAyahBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}