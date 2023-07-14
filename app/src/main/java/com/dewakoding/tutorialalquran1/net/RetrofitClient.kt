package com.dewakoding.tutorialalquran1.net

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**

Created by
name : Septiawan Aji Pradana
email : septiawanajipradana@gmail.com
at : 02/07/23 - 21.53

 **/
object RetrofitClient {
    private const val BASE_URL = "https://web-api.qurankemenag.net/"

    val instance: Api by lazy {
        val retrofit = Retrofit.Builder()
                        .baseUrl(BASE_URL)
                        .addConverterFactory(GsonConverterFactory.create())
                        .build()

        retrofit.create(Api::class.java)

    }
}