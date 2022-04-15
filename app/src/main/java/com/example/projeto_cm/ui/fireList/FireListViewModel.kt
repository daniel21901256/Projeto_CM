package com.example.projeto_cm.ui.fireList

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FireListViewModel : ViewModel() {

    private var items = mutableListOf<String>();

    private val _text = MutableLiveData<String>().apply {
        value = "This is fireList Fragment"
    }

    val text: LiveData<String> = _text

    fun addToItems(){
        for(i in 0..5) {
            items.add("Fogo $i - 01/02/2022")
        }
    }
}