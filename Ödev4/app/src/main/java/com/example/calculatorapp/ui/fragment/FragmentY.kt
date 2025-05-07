package com.example.calculatorapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.calculatorapp.R
import com.example.calculatorapp.databinding.FragmentXBinding
import com.example.calculatorapp.databinding.FragmentYBinding

class FragmentY : Fragment() {

    private var _binding: FragmentYBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentYBinding.inflate(inflater, container, false)
        findNavController().navigate(R.id.homeFragment)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}