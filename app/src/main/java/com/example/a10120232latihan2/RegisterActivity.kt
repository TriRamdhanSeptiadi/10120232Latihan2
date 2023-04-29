package com.example.a10120232latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

// Tanggal Pengerjaan   : 25 April 2023
// Deskripsi Pekerjaan  : Latihan 2 BLOOD SHARE "Membuat tampilan Register dan bisa berpindah activity ke AlmostThereActivity jika  menekan button Register"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class RegisterActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        btnRegister = findViewById(R.id.btn_register)

        btnRegister.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_register -> {
                val intentBiasa = Intent(this@RegisterActivity, AlmostThere::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}
