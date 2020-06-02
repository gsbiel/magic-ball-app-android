package com.example.magicball.magicball

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class MagicBallViewModel(val imageIndex: Int): ViewModel() {

    private val _index = MutableLiveData<Int>()
    val index: LiveData<Int>
        get() = _index

    init{
        _index.value = imageIndex
    }

    fun rollImage(){
     _index.value = Random.nextInt(0,5)
    }
}