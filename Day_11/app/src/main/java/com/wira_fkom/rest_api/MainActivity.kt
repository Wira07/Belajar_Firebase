package com.wira_fkom.rest_api

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.wira_fkom.rest_api.adapter.RestAdapter
import com.wira_fkom.rest_api.retrofit.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: RestAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.tabMode)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Load data from API
        loadDataFromApi()
    }

    private fun loadDataFromApi() {
        val api = RetrofitClient.instance
        api.getListFaskes().enqueue(object : Callback<ApiResponse<List<List<DataItem>>>> {
            override fun onResponse(call: Call<ApiResponse<List<List<DataItem>>>>, response: Response<ApiResponse<List<List<DataItem>>>>) {
                if (response.isSuccessful) {
                    response.body()?.let { apiResponse ->
                        if (apiResponse.success) {
                            Log.d("MainActivity", "Data loaded: ${apiResponse.data}")
                            val flattenedData = apiResponse.data.flatten() // Flatten the nested list
                            adapter = RestAdapter(flattenedData)
                            recyclerView.adapter = adapter
                        } else {
                            Log.e("MainActivity", "API response unsuccessful: ${apiResponse.message}")
                            Toast.makeText(this@MainActivity, "API response unsuccessful: ${apiResponse.message}", Toast.LENGTH_SHORT).show()
                        }
                    } ?: run {
                        Log.e("MainActivity", "Response body is null")
                        Toast.makeText(this@MainActivity, "Failed to get data", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    Log.e("MainActivity", "Response not successful: ${response.errorBody()?.string()}")
                    Toast.makeText(this@MainActivity, "Failed to get data", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<ApiResponse<List<List<DataItem>>>>, t: Throwable) {
                Log.e("MainActivity", "Network request failed: ${t.message}", t)
                Toast.makeText(this@MainActivity, "Error: ${t.message}", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
