package com.example.leqciashualedurismere.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.leqciashualedurismere.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.button)
        val amountText = view.findViewById<EditText>(R.id.editTextNumber)

        button.setOnClickListener {

            val amount = amountText.text.toString().toInt()

            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment(amount)

            findNavController().navigate(action)

        }

    }



}