package com.example.datatrufragments.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.datatrufragments.R

class FragmentUno : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_uno, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if(arguments != null){
            val numFragmento = arguments?.getInt("numero")
            val numFragmento2 = arguments?.getInt("numero1")
            val numFragmento3 = arguments?.getInt("numero2")

            val et: EditText? = view?.findViewById(R.id.editText1)

            et?.setText("Hola $numFragmento, $numFragmento2, $numFragmento3")
        }
    }

}