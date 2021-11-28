package com.example.rickandmortywiki.ui.main.categories

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.rickandmortywiki.R
import com.example.rickandmortywiki.databinding.FragmentCategoriesBinding

class СategoriesFragment : Fragment(R.layout.fragment_categories) {

    private lateinit var binding : FragmentCategoriesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCategoriesBinding.bind(view)

        binding.buttonCharacters.setOnClickListener {
        findNavController().navigate(R.id.action_сategoriesFragment_to_charactersFragment)
        }

        binding.buttonLocation.setOnClickListener {

        }
        binding.buttonLocation.setOnClickListener {

        }

    }
}