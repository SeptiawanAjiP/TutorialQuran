package com.dewakoding.tutorialalquran1.net

import com.dewakoding.tutorialalquran1.entity.Surah
import com.google.gson.annotations.SerializedName

data class SurahResponse(

	@field:SerializedName("data")
	val data: List<Surah>? = null
)