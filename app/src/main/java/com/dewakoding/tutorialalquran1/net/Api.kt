package com.dewakoding.tutorialalquran1.net

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 02/07/23 - 21.55

 **/
interface Api {

    @GET("quran-surah")
    fun getListSurah(): Call<SurahResponse>

    @GET("quran-ayah?start=0&limit=1000")
    fun getDetailSurah(@Query("surah") surahId: Int): Call<AyahResponse>
}