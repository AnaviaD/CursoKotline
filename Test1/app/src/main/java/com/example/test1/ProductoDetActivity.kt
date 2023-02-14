package com.example.test1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.test1.model.Producto
import kotlinx.android.synthetic.main.activity_producto_det.*

class ProductoDetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_producto_det)

        val producto = intent.getSerializableExtra("producto") as Producto

        nombre_Producto.text = producto.nombre
        precio_Producto.text = "$$(producto.precio)"
        description_Producto.text = producto.descripcion
        image_Producto.setImageResource(producto.inmagen)

    }
}