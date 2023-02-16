package com.example.testfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.testfragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val transaccion = supportFragmentManager.beginTransaction()
            val fragmento = FragmentsUno()
            transaccion.replace(R.id.contenedorFragments, fragmento)
            transaccion.addToBackStack(null)
            transaccion.commit()
        }

        binding.button2.setOnClickListener{
            val transaccion2 = supportFragmentManager.beginTransaction()
            val fragmento2 = FragmentDos()
            transaccion2.replace(R.id.contenedorFragments, fragmento2)
            transaccion2.addToBackStack(null)
            transaccion2.commit()
        }

        binding.button3.setOnClickListener{
            val transaccion3 = supportFragmentManager.beginTransaction()
            val fragmento3 = FragmentTres()
            transaccion3.replace(R.id.contenedorFragments, fragmento3)
            transaccion3.addToBackStack(null)
            transaccion3.commit()
        }
    }
}