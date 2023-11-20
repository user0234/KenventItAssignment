package com.hellow.kenventitassignment.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.hellow.kenventitassignment.R
import com.hellow.kenventitassignment.databinding.ActivityMainBinding
import com.hellow.kenventitassignment.ui.navComponent.NavComponentActivity
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {

     private lateinit var binding:ActivityMainBinding
     private lateinit var viewModel:MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = MainActivityViewModel()

        /***
         * livedata title when changes give us a value
         * of and we show toast of the value
         *
         */
        binding.viewModel = viewModel
        viewModel.gettextValue.observe(this) {
              if(it.isNotBlank()){

                  Toast.makeText(this,"editText text value - $it",Toast.LENGTH_SHORT).show()
              }
        }
         binding.goToSecondScreen.setOnClickListener {
             // Go to navigation component screen

             val intent = Intent(this, NavComponentActivity::class.java)
             startActivity(intent)

         }
        binding.updateTextButton.setOnClickListener {
            binding.name.text = "new text value"
        }
    }
}