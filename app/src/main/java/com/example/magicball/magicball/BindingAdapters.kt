package com.example.magicball.magicball

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.example.magicball.R

@BindingAdapter("imageRes")
fun ImageView.setMagicBallImage(imageIndex: Int){
    imageIndex?.let{
        setImageResource(when(it){
            0 -> R.drawable.ball1
            1 -> R.drawable.ball2
            2 -> R.drawable.ball3
            3 -> R.drawable.ball4
            4 -> R.drawable.ball5
            else -> R.drawable.ball5
        })
    }
}