package com.hellow.kenventitassignment.ui


import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    companion object {
        const val TAG = "MainActivityViewModel"
    }

    var textValue = " First text "

    fun upDateTextValue() {
        textValue = "secound text"

    }

    val _textValue = MutableLiveData<String>("Initial value")
    val gettextValue: LiveData<String> = _textValue
}