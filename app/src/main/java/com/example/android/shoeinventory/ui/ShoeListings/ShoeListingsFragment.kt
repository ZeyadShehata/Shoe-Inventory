package com.example.android.shoeinventory.ui.ShoeListings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.android.shoeinventory.R
import com.example.android.shoeinventory.databinding.FragmentShoeListingsBinding

class ShoeListingsFragment: Fragment()
{

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentShoeListingsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_listings, container, false)
        binding.fab.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(ShoeListingsFragmentDirections.actionFragmentShoeListingsToShoeDetailsFragment())
        }
        return binding.root
    }
}