package com.dewakoding.tutorialalquran1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialalquran1.databinding.ActivityDetailSurahBinding


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 14/07/23 - 14.55

 **/
class DetailSurahActivity: AppCompatActivity() {
    private val binding by lazy { ActivityDetailSurahBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}