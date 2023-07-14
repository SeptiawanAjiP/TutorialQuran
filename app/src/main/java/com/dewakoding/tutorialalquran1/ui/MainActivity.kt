package com.dewakoding.tutorialalquran1.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dewakoding.tutorialalquran1.databinding.ActivityMainBinding
import com.dewakoding.tutorialalquran1.entity.Surah
import com.dewakoding.tutorialalquran1.net.RetrofitClient
import com.dewakoding.tutorialalquran1.net.SurahResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 14/07/23 - 07.07

 **/
class MainActivity: AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        RetrofitClient.instance.getListSurah().enqueue(object: Callback<SurahResponse> {
            override fun onResponse(call: Call<SurahResponse>, response: Response<SurahResponse>) {
                setAdapter(response.body()!!.data!!)

            }

            override fun onFailure(call: Call<SurahResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }
        })

    }

    fun setAdapter(surahs: List<Surah>?) {
        binding.rvMain.adapter = SurahAdapter(surahs!!)
    }
}