package com.example.viewstest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
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

        val chipNew = Chip(this, null, R.style.chEntry)
        chipNew.text = "opcion"
        chipNew.chipIcon = ContextCompat.getDrawable(this, R.drawable.ic_truck01)
        chipNew.isChipIconVisible = true
        chipNew.isCloseIconVisible = true

        chipNew.isClickable = true
        chipNew.isCheckable = false
        cgCondiciones.addView(chipNew as View)
        chipNew.setOnCloseIconClickListener{
            cgCondiciones.removeView(chipNew as View)
        }


        //Es otra forma de declarar el radioGroup, en lugar de declarar el <RadioGroup>
        //var rgVacaciones = findViewById<View>(R.id.rgVacaciones) as RadioGroup
        var rgVacaciones = findViewById<RadioGroup>(R.id.rgVacaciones)
        var rbChild = rgVacaciones.getChildAt(1) as RadioButton
        rgVacaciones.check(rbChild.id)


    }

    fun onRadioButtonClicked(view: View){
        if(view is RadioButton){
            var checked = view.isChecked
            when(view.id){

            }
        }
    }
}