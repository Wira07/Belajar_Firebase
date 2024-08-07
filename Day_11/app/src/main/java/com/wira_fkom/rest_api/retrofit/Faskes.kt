package com.wira_fkom.rest_api.retrofit

import com.google.gson.annotations.SerializedName

data class Faskes(

	@field:SerializedName("count_total")
	val countTotal: Int,

	@field:SerializedName("data")
	val data: List<DataItem>,

	@field:SerializedName("success")
	val success: Boolean,

	@field:SerializedName("message")
	val message: String
)

data class DetailItem(

	@field:SerializedName("batal_vaksin")
	val batalVaksin: Int,

	@field:SerializedName("pending_vaksin_1")
	val pendingVaksin1: Int,

	@field:SerializedName("pending_vaksin_2")
	val pendingVaksin2: Int,

	@field:SerializedName("batch")
	val batch: String,

	@field:SerializedName("divaksin_1")
	val divaksin1: Int,

	@field:SerializedName("divaksin")
	val divaksin: Int,

	@field:SerializedName("divaksin_2")
	val divaksin2: Int,

	@field:SerializedName("kode")
	val kode: String,

	@field:SerializedName("pending_vaksin")
	val pendingVaksin: Int,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("tanggal")
	val tanggal: String,

	@field:SerializedName("batal_vaksin_2")
	val batalVaksin2: Int,

	@field:SerializedName("batal_vaksin_1")
	val batalVaksin1: Int
)
