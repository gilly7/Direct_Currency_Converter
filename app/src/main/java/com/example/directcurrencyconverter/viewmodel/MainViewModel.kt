package com.example.directcurrencyconverter.viewmodel

import androidx.lifecycle.MutableLiveData
import com.example.directcurrencyconverter.model.ApiResponse
import com.example.directcurrencyconverter.model.Rates
import com.ibrajix.directcurrencyconverter.helper.Resource
import com.ibrajix.directcurrencyconverter.helper.SingleLiveEvent

class MainViewModel @ViewModelInject constructor(private val mainRepo: MainRepo) : ViewModel()  {


    //cached
    private val _data = SingleLiveEvent<Resource<ApiResponse>>()
    private val rates = MutableLiveData<HashMap<String, Rates>>()

    //public
    val data  =  _data
    val convertedRate = MutableLiveData<Double>()

    //Public function to get the result of conversion
    fun getConvertedData(access_key: String, from: String, to: String, amount: Double) {
        viewModelScope.launch {
            mainRepo.getConvertedData(access_key, from, to, amount).collect {
                data.value = it
            }
        }
    }



}