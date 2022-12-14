package com.barra.ujikomkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Login : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnLogin)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)

        btnLogin.setOnClickListener{
            if ((etEmail.text.toString() == "fulan@gmail.com" || etEmail.text.toString() == "FULAN@GMAIL.COM") && (etPassword.text.toString() == "fulan123" || etPassword.text.toString() == "FULAN123")) {
                startActivity(Intent(this, Home::class.java))
            } else if (TextUtils.isEmpty(etEmail.text.toString()) || TextUtils.isEmpty(etPassword.text.toString())) {
                Toast.makeText(this, "Silahkan isi email dan password terlebih dahulu", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Email dan Password yang dimasukkan salah!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}