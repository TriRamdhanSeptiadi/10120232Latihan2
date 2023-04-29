package com.example.a10120232latihan2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

// Tanggal Pengerjaan   : 25 April 2023
// Deskripsi Pekerjaan  : Latihan 2 BLOOD SHARE "Membuat tampilan Home"
// NIM                  : 10120232
// Nama                 : Tri Ramdhan Septiadi
// Kelas                : IF6

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()
    }
}