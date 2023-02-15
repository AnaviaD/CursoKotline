package com.example.sqltest

import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sqltest.DataBase.miSQLiteHelper
import com.example.sqltest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var amigosDBHelper: miSQLiteHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        amigosDBHelper = miSQLiteHelper(this)

        val nombreTxt = binding.etNombre.text
        val emailTxt = binding.etEmail.text

        binding.btGuardar.setOnClickListener{
            if(nombreTxt.isNotBlank() && emailTxt.isNotBlank())
            {
                amigosDBHelper.anyadirDato(nombreTxt.toString(), emailTxt.toString())
                nombreTxt.clear()
                emailTxt.clear()
                Toast.makeText(this, "Guardado", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "No se pudo guardar", Toast.LENGTH_LONG).show()
            }
        }

        binding.btConsulta.setOnClickListener {
            binding.tvConsulta.text = ""
            val db : SQLiteDatabase = amigosDBHelper.readableDatabase
            val cursor = db.rawQuery("SELECT * FROM amigos", null)

            if (cursor.moveToFirst()){
                do {
                    binding.tvConsulta.append(cursor.getInt(0).toString() + ": ")
                    binding.tvConsulta.append(cursor.getString(1).toString() + ", ")
                    binding.tvConsulta.append(cursor.getString(2).toString() + "\n ")
                }while (cursor.moveToNext())
            }
        }

    }
}