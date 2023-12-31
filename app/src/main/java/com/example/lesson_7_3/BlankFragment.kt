package com.example.lesson_7_3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import androidx.navigation.Navigation
import android.view.ViewGroup
import com.example.lesson_7_3.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
    private val car = arrayListOf<Parametr>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBlankBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val Rici: Parametr = arguments?.getSerializable("key") as Parametr
        binding.tvName.text = Rici.name
        binding.tvDescription.text = Rici.prof
        binding.ivCar.setImageResource(Rici.img)

    }
}