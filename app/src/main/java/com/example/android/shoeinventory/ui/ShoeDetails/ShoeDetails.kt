package com.example.android.shoeinventory.ui.ShoeDetails

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.android.shoeinventory.R
import com.example.android.shoeinventory.databinding.FragmentShoeDetailsBinding
import com.example.android.shoeinventory.model.Shoe
import com.example.android.shoeinventory.ui.ShoeListings.ShoeListingsViewModel

class ShoeDetailsFragment: Fragment()
{
    private val shoeListingsViewModel: ShoeListingsViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding : FragmentShoeDetailsBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_shoe_details, container, false)
        binding.cancelButton.setOnClickListener{
            NavHostFragment.findNavController(this)
                .navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToFragmentShoeListings())
        }
        binding.saveButton.setOnClickListener{

            val shoe = Shoe(binding.shoeNameField.toString(),binding.shoeSizeField.toString(),binding.companyNameField.toString(),binding.descriptionField.toString())
            shoeListingsViewModel.addShoe(shoe)
            NavHostFragment.findNavController(this)
                .navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToFragmentShoeListings())
        }
        return binding.root
    }
}