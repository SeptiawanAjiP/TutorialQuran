package com.dewakoding.tutorialalquran1.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dewakoding.tutorialalquran1.databinding.ItemSurahBinding
import com.dewakoding.tutorialalquran1.entity.Surah


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 14/07/23 - 14.34

 **/
class SurahAdapter(val surahs: List<Surah>): RecyclerView.Adapter<SurahAdapter.ViewHolder>() {
    class ViewHolder(val binding: ItemSurahBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemSurahBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = surahs.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val surah = surahs.get(position)
        holder.binding.tvNumber.text = (position+1).toString()
        holder.binding.titleSurah.text = surah.latin
        holder.binding.tvArtiDanJumlah.text = "${surah.translation} - ${surah.numAyah} ayat"
        holder.binding.tvArabic.text = surah.arabic

    }


}