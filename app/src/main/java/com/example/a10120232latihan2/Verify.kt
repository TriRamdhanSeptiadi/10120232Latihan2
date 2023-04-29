package com.example.a10120232latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

// Tanggal Pengerjaan   : 25 April 2023
// Deskripsi Pekerjaan  : Latihan 2 BLOOD SHARE "Membuat tampilan Verify dan bisa berpindah activity ke HomeActivity jika menekan button SEND"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class Verify : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnsend: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        supportActionBar?.hide()

        btnsend = findViewById(R.id.btn_send)

        btnsend.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_send -> {
                val intentBiasa = Intent(this@Verify, Home::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}