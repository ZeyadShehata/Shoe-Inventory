package com.example.android.shoeinventory.ui.ShoeDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.android.shoeinventory.R
import com.example.android.shoeinventory.databinding.FragmentShoeDetailsBinding

class ShoeDetailsFragment: Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentShoeDetailsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, container, false)

        return binding.root
    }
}