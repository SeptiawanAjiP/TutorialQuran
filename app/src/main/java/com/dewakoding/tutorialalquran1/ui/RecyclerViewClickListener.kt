package com.dewakoding.tutorialalquran1.ui

import android.view.View
import com.dewakoding.tutorialalquran1.entity.Surah


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 10/07/23 - 13.22

 **/
interface RecyclerViewClickListener {
    fun onItemClicked(view: View, surah: Surah)
}