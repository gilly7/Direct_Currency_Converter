package com.example.directcurrencyconverter.network

import androidx.room.Query
import com.example.directcurrencyconverter.helper.EndPoints
import com.google.android.gms.common.api.Response
import retrofit2.http.GET

interface ApiService {

    @GET(EndPoints.CONVERT_URL)
    suspend fun convertCurrency(
        @Query("api_key") access_key: String,
        @Query("from") from: String,
        @Query("to") to: String,
        @Query("amount") amount: Double
    ) : Response<ApiResponse>

}