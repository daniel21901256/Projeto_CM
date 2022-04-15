package com.example.projeto_cm.ui.reportFire

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ReportFireViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is reportFire Fragment"
    }
    val text: LiveData<String> = _text
}