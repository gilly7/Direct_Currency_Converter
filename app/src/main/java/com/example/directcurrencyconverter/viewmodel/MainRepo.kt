package com.example.directcurrencyconverter.viewmodel

import com.example.directcurrencyconverter.network.ApiDataSource
import com.ibrajix.directcurrencyconverter.network.BaseDataSource
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MainRepo @Inject constructor(private val apiDataSource: ApiDataSource) : BaseDataSource() {

    //Using coroutines flow to get the response from
    suspend fun getConvertedData(access_key: String, from: String, to: String, amount: Double): Flow<Resource<ApiResponse>> {
        return flow {
            emit(safeApiCall { apiDataSource.getConvertedRate(access_key, from, to, amount) })
        }.flowOn(Dispatchers.IO)
    }

}