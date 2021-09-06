package com.example.android.shoeinventory.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.example.android.shoeinventory.R
import com.example.android.shoeinventory.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentLoginBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.loginButton.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(LoginFragmentDirections.actionFragmentLoginToFragmentWelcome())
        }
        binding.createButton.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(LoginFragmentDirections.actionFragmentLoginToFragmentWelcome())
        }

        return binding.root
    }
}