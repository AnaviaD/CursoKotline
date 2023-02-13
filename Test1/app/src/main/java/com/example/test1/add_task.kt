package com.example.test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.test1.database.DatabaseHelper
import com.example.test1.model.TaskListModel

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

        btn_save = findViewById(R.id.btn_save)
        btn_del = findViewById(R.id.btn_del)
        et_name = findViewById(R.id.et_name)
        et_details = findViewById(R.id.et_details)

        dbHandler = DatabaseHelper(this)

        if(intent != null && intent.getStringExtra("Mode") =="E"){
            isEditMode = true
            btn_save.text = "Update Data"
            btn_del.visibility = View.VISIBLE
        }else{
            isEditMode = false
            btn_save.text = "Save Data"
            btn_del.visibility = View.GONE
        }
        btn_save.setOnClickListener {
        var success: false
        var tasks: TaskListModel = TaskListModel()
            if (isEditMode){

            }else{
                tasks.name = et_name.text.toString()
                tasks.details = et_details.text.toString()

                success = dbHandler?.addTask(tasks) as Boolean
            }
            if (success){
                val i = Intent(applicationContext, aMain::class.java)
                startActivity(i)
                finish()
            }else{
                Toast.makeText(applicationContext, "Something went Wrong!", Toast.LENGTH_LONG).show()
            }
        }
    }
}