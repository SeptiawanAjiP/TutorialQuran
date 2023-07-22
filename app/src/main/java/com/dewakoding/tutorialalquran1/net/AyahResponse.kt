package com.dewakoding.tutorialalquran1.net

import com.dewakoding.tutorialalquran1.entity.Ayah
import com.google.gson.annotations.SerializedName

data class AyahResponse(

	@field:SerializedName("data")
	val data: List<Ayah>? = null
)