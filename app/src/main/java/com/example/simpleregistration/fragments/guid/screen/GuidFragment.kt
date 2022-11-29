package com.example.simpleregistration.fragments.guid.screen

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.simpleregistration.R
import com.example.simpleregistration.databinding.FragmentGuidBinding

class GuidFragment : Fragment(R.layout.fragment_guid) {

    private lateinit var binding: FragmentGuidBinding
    private val args by navArgs<GuidFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentGuidBinding.inflate(layoutInflater, container, false)
        binding.webView.settings.javaScriptEnabled
        binding.webView.loadUrl(args.guid.urlReference.toString())
        return binding.root
    }
}