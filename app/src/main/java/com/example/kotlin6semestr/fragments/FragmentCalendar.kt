package com.example.kotlin6semestr.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.kotlin6semestr.R


class FragmentCalendar : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calendar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val bF1 = view.findViewById<Button>(R.id.buttonCalendarCal)
        val bF2 = view.findViewById<Button>(R.id.buttonHomeCal)
        val controller = findNavController()
        bF1.setOnClickListener { controller.navigate(R.id.fragmentLoop2) }
        bF2.setOnClickListener {controller.navigate(R.id.fragment12)
        }
    }

}