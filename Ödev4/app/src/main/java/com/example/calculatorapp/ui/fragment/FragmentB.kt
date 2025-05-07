package com.example.calculatorapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.calculatorapp.R
import com.example.calculatorapp.databinding.FragmentABinding

class FragmentB : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentABinding.inflate(inflater, container, false)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.fragmentY)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}