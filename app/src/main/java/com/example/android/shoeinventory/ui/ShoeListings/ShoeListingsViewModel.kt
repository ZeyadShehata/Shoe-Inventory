package com.example.android.shoeinventory.ui.ShoeListings

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android.shoeinventory.model.Shoe

class ShoeListingsViewModel: ViewModel() {
    private var _shoes = MutableLiveData<MutableList<Shoe>>()
    val shoes : LiveData<MutableList<Shoe>>
        get() = _shoes

}