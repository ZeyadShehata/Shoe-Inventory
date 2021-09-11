package com.example.android.shoeinventory.ui.Instructions

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.android.shoeinventory.R
import com.example.android.shoeinventory.databinding.FragmentInstructionsBinding

class InstructionsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentInstructionsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_instructions, container, false)
        binding.startButton.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(InstructionsFragmentDirections.actionFragmentInstructionsToFragmentShoeListings())
        }

        return binding.root
    }
}