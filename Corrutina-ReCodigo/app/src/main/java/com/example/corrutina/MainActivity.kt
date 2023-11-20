package com.example.corrutina

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.corrutina.Clases.Clase1
import com.example.corrutina.Clases.Clase2
import com.example.corrutina.Clases.Clase3
import com.example.corrutina.Clases.Clase4
import com.example.corrutina.Clases.Clase5
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var primerText      : TextView? = null
    var primerR         : TextView? = null

    var Clasebtn1           : Button? = null
    var Clasebtn2           : Button? = null
    var Clasebtn3           : Button? = null
    var Clasebtn4           : Button? = null
    var Clasebtn5           : Button? = null

    var contador        : Int? = 1

    val TAG = "MainActivity"

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Text View's
        primerText      = findViewById(R.id.primerTextLayout)
        primerR         = findViewById(R.id.textResultado)

        // Botones
        Clasebtn1           = findViewById(R.id.Clase1btn)
        Clasebtn2           = findViewById(R.id.Clase2btn)
        Clasebtn3           = findViewById(R.id.Clase3btn)
        Clasebtn4           = findViewById(R.id.Clase4btn)
        Clasebtn5           = findViewById(R.id.Clase5btn)

        primerText?.setText("Hello World " +
                "\n BARCO BASURERO" +
                "\n jajajaja")



        Clasebtn1?.setOnClickListener{
            val intent = Intent(this, Clase1::class.java)
            startActivity(intent)
        }

        Clasebtn2?.setOnClickListener{
            val intent = Intent(this, Clase2::class.java)
            startActivity(intent)
        }

        Clasebtn3?.setOnClickListener{
            val intent = Intent(this, Clase3::class.java)
            startActivity(intent)
        }

        Clasebtn4?.setOnClickListener{
            val intent = Intent(this, Clase4::class.java)
            startActivity(intent)
        }

        Clasebtn5?.setOnClickListener{
            val intent = Intent(this, Clase5::class.java)
            startActivity(intent)
        }


    }

    fun funcionMas(View:View)
    {
        contador = contador!! + 1
        primerR?.setText("$contador ")
    }

    fun funcionMenos(View:View)
    {
        contador = contador!! - 1
        primerR?.setText("$contador ")
    }
}