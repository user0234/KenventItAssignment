package com.hellow.kenventitassignment.ui.navComponent.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.hellow.kenventitassignment.R
import com.hellow.kenventitassignment.databinding.FragmentFirstPageBinding


class FirstPageFragment : Fragment(R.layout.fragment_first_page,) {

    private lateinit var binding:FragmentFirstPageBinding
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
          binding = FragmentFirstPageBinding.bind(view)

        binding.goToSecondScreen.setOnClickListener {
            /***
             * navigate to second screen using nav component
             */
            val bundle = Bundle()
            findNavController().navigate(
                R.id.action_firstPageFragment_to_secondScreenFragment,bundle
            )
        }


    }
}