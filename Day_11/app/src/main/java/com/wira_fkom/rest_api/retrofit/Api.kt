package com.wira_fkom.rest_api.retrofit

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("getListFaskes")
    fun getListFaskes(): Call<ApiResponse<List<List<DataItem>>>>
}
