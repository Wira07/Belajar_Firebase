package com.wira_fkom.rest_api.retrofit

import com.google.gson.annotations.SerializedName

data class ApiResponse<T>(
    @SerializedName("count_total") val countTotal: Int,
    @SerializedName("data") val data: List<List<T>>, // Nested list
    @SerializedName("success") val success: Boolean,
    @SerializedName("message") val message: String
)

