package com.hellow.kenventitassignment.ui.navComponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hellow.kenventitassignment.R
import com.hellow.kenventitassignment.databinding.FragmentSecondScreenBinding


class SecondScreenFragment : Fragment(R.layout.fragment_second_screen) {

    private lateinit var binding:FragmentSecondScreenBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondScreenBinding.bind(view)
        binding.addStack.setOnClickListener {
            /***
             * navigate to first screen using nav component and add that to stack
             */
            val bundle = Bundle()
            findNavController().navigate(
                R.id.action_secondScreenFragment_to_firstPageFragment_add_stack,bundle
            )
        }

    }
}