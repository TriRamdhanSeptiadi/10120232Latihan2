package com.example.a10120232latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

// Tanggal Pengerjaan   : 25 April 2023
// Deskripsi Pekerjaan  : Latihan 2 BLOOD SHARE "Membuat tampilan Login dan bisa berpindah activity ke RegisterActivity jika menekan kata Register"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        btnIntent = findViewById(R.id.txt_register)

        btnIntent.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.txt_register -> {
                val intentBiasa = Intent(this@MainActivity, RegisterActivity::class.java)
                startActivity(intentBiasa)
            }
        }
    }

}