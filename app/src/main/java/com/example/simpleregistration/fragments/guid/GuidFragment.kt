package com.example.simpleregistration.fragments.guid

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.simpleregistration.R
import com.example.simpleregistration.databinding.FragmentContentBinding

class GuidFragment: Fragment(R.layout.fragment_content) {

    private lateinit var binding: FragmentContentBinding
    private val viewModel by viewModels<GuidViewModel> { GuidViewModelFactory() }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentContentBinding.inflate(layoutInflater, container, false)
        viewModel.getList()
        observeViewModel()
        return binding.root
    }

    private fun observeViewModel(){
        viewModel.guidList.observe(viewLifecycleOwner){
            Log.d("TAG", "list size ${it.size}")
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}