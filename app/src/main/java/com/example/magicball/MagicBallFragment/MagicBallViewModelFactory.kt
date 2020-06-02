package com.example.magicball.MagicBallFragment

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalArgumentException

class MagicBallViewModelFactory(val imageIndex: Int): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MagicBallViewModel::class.java)){
            return MagicBallViewModel(imageIndex)as T
        }
        throw IllegalArgumentException("Unknown ViewModel class.")
    }
}