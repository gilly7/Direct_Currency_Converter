package com.example.directcurrencyconverter.network

class ApiDataSource @Inject constructor(private val apiService: ApiService) {

    suspend fun getConvertedRate(access_key: String, from: String, to: String, amount: Double) =
        apiService.convertCurrency(access_key, from, to, amount)

}