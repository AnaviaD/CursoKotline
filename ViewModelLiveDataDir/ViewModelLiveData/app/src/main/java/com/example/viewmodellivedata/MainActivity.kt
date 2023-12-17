package com.example.viewmodellivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodellivedata.viewModelLivedata.testViewModel



class MainActivity : AppCompatActivity() {
    var btn_buton               :Button?    = null
    var tv_textView             :TextView?  = null
    var tv_boolView             :TextView?  = null

    lateinit var viewModel      :testViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_buton       = findViewById(R.id.btn_button)
        tv_textView     = findViewById(R.id.tv_textView)
        tv_boolView     = findViewById(R.id.tv_booleanText)

        //viewModel = ViewModelProvider(this).get(testViewModel::class.java)
        viewModel = ViewModelProvider(this)[testViewModel::class.java]

        viewModel.currentNumber.observe(this, Observer {
            tv_textView?.text = it.toString()
        })

        viewModel.currentBoolean.observe(this, Observer {
            tv_boolView?.text = it.toString()
        })

        incrementText()
    }

    private fun incrementText(){
        btn_buton?.setOnClickListener{
            println("Boton presionado")
            viewModel.currentNumber.value       = ++viewModel.number
            viewModel.currentBoolean.value      = viewModel.number %2 == 0
        }
    }
}