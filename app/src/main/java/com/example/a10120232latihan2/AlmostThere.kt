package com.example.a10120232latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

// Tanggal Pengerjaan   : 25 April 2023
// Deskripsi Pekerjaan  : Latihan 2 BLOOD SHARE "Membuat tampilan AlmostThere dan bisa berpindah activity ke VerifyActivity jika menekan button Verify"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class AlmostThere : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnverify : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almost_there)
        supportActionBar?.hide()

        btnverify = findViewById(R.id.btn_verify)

        btnverify.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btn_verify -> {
                val intentBiasa = Intent(this@AlmostThere, Verify::class.java)
                startActivity(intentBiasa)
            }
        }
    }
}