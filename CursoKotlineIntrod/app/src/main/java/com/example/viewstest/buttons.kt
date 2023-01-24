package com.example.viewstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class buttons : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)

        var btBoton = findViewById<ImageButton>(R.id.imageButton)
        btBoton.setOnClickListener{
            Toast.makeText(this, "image Button Pulsado", Toast.LENGTH_SHORT).show()
        }

        var cgCondiciones = findViewById<ChipGroup>(R.id.cdCondiciones)
        var chip: Chip
        for (i in 0 until cgCondiciones.childCount){
            chip = cgCondiciones.getChildAt(i) as Chip
            chip.textAlignment = View.TEXT_ALIGNMENT_CENTER

            chip.setOnCloseIconClickListener{
                cgCondiciones.removeView(it)
            }
            chip.setOnClickListener{
                var aux = it as Chip
                Toast.makeText(this, "${aux.text} pulsado", Toast.LENGTH_SHORT).show()
            }
        }

        //val chipNew = Chip(this)

    }
}