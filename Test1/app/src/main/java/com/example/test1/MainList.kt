package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.Adapter.ProductosAdapter
import com.example.test1.model.Producto
import kotlinx.android.synthetic.main.activity_main_list.*

class MainList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_list)

        val producto = Producto("Producto1", 260.00, "Prod Imageinario", R.drawable.img_avatar04)
        val producto2 = Producto("Producto2", 430.00, "Prod Imageinario", R.drawable.img_avatar05)

        val listaProductos = listOf(producto, producto2)

        val adapter = ProductosAdapter(this, listaProductos)

        Lv_lista.adapter = adapter


    }
}