package com.example.proyectonativas

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart = findViewById<Button>(R.id.btn_start)
        btnStart.setOnClickListener {
            // Aquí llamarás al Fragment o Activity del combate
            Toast.makeText(this, "¡Iniciando combate!", Toast.LENGTH_SHORT).show()
        }

        val btnAjustes = findViewById<Button>(R.id.btn_settings)
        btnAjustes.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            val inflater = layoutInflater
            val dialogView = inflater.inflate(R.layout.dialog_ajustes, null)

            builder.setView(dialogView)
            val dialog = builder.create()

            // Quitar el fondo blanco feo que trae por defecto el AlertDialog
            dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)

            dialogView.findViewById<Button>(R.id.btn_guardar).setOnClickListener {
                dialog.dismiss() // Cerrar al guardar
            }

            dialog.show()
        }
    }
}