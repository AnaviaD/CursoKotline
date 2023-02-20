package com.example.webservicestry01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.android.volley.toolbox.StringRequest
import com.example.webservicestry01.databinding.ActivityMainBinding


class getWebServis : AppCompatActivity() {

    lateinit var text1: TextView
    lateinit var binding: ActivityMainBinding
    lateinit var reqQueue: RequestQueue
    var url1 = "https://my-json-server.typicode.com/typicode/demo/comments"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        reqQueue = Volley.newRequestQueue(this)

        //UI
        initUI()
    }

    fun initUI()
    {
        text1 = findViewById(R.id.jsonText)
    }

    fun StringRequest()
    {
    }
}