package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.test1.database.DatabaseHelper

class add_task : AppCompatActivity() {

    lateinit var btn_save: Button
    lateinit var btn_del: Button
    lateinit var et_name: EditText
    lateinit var et_details: EditText
    var dbHandler: DatabaseHelper? = null
    var isEditMode: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_task)
    }
}