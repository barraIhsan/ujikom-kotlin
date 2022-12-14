package com.barra.ujikomkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    // Membuat variable untuk button dan edittext
    private lateinit var btnLogin: Button
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Isi variablenya dengan element dengan ID berdasarkan di res/layout/activity_login
        btnLogin = findViewById(R.id.btnLogin)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)

        // Jika button login di click
        btnLogin.setOnClickListener{
            if ((etEmail.text.toString() == "fulan@gmail.com" || etEmail.text.toString() == "FULAN@GMAIL.COM") && (etPassword.text.toString() == "fulan123" || etPassword.text.toString() == "FULAN123")) {
                // Jika email == fulan@gmail.com DAN password == fulan123 (case insensitive)
                // Pindah ke activity Home
                startActivity(Intent(this, Home::class.java))
            } else if (TextUtils.isEmpty(etEmail.text.toString()) || TextUtils.isEmpty(etPassword.text.toString())) {
                // Jika email nya ATAU passwordnya kosong
                // Maka tampilkan toast short (sebentar)
                Toast.makeText(this, "Silahkan isi email dan password terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                // Selain itu
                // Tampilkan toast short (sebentar)
                Toast.makeText(this, "Email dan Password yang dimasukkan salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}