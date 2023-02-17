package com.example.datatrufragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datatrufragments.Fragments.FragmentDos
import com.example.datatrufragments.Fragments.FragmentTres
import com.example.datatrufragments.Fragments.FragmentUno
import com.example.datatrufragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),
    FragmentDos.ComunicadorFragments {

    lateinit var binding: ActivityMainBinding
    var numFragmento = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt("numero", ++numFragmento)
            bundle.putInt("numero1", 5)
            bundle.putInt("numero2", 9)

            val transaccion = supportFragmentManager.beginTransaction()
            val fragmento = FragmentUno()

            fragmento.arguments = bundle

            transaccion.replace(R.id.contenedor, fragmento)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }

        binding.button2.setOnClickListener {
            val transaccion = supportFragmentManager.beginTransaction()
            val fragmento = FragmentDos()

            transaccion.replace(R.id.contenedor, fragmento)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }

        binding.button3.setOnClickListener {
            val transaccion = supportFragmentManager.beginTransaction()
            val fragmento = FragmentTres()

            transaccion.replace(R.id.contenedor, fragmento)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }
    }

    override fun devolverDato(dato: String) {
        binding.editTPrincipal.setText(dato)
    }
}