package com.example.android.shoeinventory.ui.ShoeListings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.NavHostFragment
import com.example.android.shoeinventory.R
import com.example.android.shoeinventory.databinding.FragmentShoeListingsBinding
import com.example.android.shoeinventory.databinding.ShoeListItemBinding

class ShoeListingsFragment : Fragment() {
    private val shoeListingsViewModel: ShoeListingsViewModel by activityViewModels()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentShoeListingsBinding =
            inflate(inflater, R.layout.fragment_shoe_listings, container, false)
        binding.lifecycleOwner = this
        binding.fab.setOnClickListener {
            NavHostFragment.findNavController(this)
                .navigate(ShoeListingsFragmentDirections.actionFragmentShoeListingsToShoeDetailsFragment())
        }

        shoeListingsViewModel.shoes.observe(viewLifecycleOwner, {
            if(it.isNotEmpty()){
                val container =binding.list
                it.forEach { shoe->
                    val shoeLayout:ShoeListItemBinding= inflate(LayoutInflater.from(context), R.layout.shoe_list_item,binding.list, false)

                    shoeLayout.shoeitem = shoe
                    binding.list.addView(shoeLayout.root)
                }
            }
        })
        return binding.root
    }
}