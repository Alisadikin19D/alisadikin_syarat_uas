package com.INFORMATIKA19100099.alidatabarang.model

import com.google.gson.annotations.SerializedName

data class ResponseAdmin(

	@field:SerializedName("pesan")
	val pesan: String? = null,

	@field:SerializedName("data")
	val data: List<DataItem1?>? = null,

	@field:SerializedName("status")
	val status: Boolean? = null
)

data class DataItem1(

	@field:SerializedName("Username")
	val username: Any? = null,

	@field:SerializedName("Password")
	val password: String? = null
)
