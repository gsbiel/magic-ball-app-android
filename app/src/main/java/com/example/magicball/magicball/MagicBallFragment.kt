package com.example.magicball.magicball
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.magicball.R
import com.example.magicball.databinding.FragmentMagicballBinding

class MagicBallFragment: Fragment(){

    private lateinit var viewModel: MagicBallViewModel
    private lateinit var viewModelFactory: MagicBallViewModelFactory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val binding: FragmentMagicballBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_magicball, container, false)
        binding.lifecycleOwner = this
        viewModelFactory = MagicBallViewModelFactory(0)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(MagicBallViewModel::class.java)
        binding.viewModel = viewModel
        return binding.root
    }
}