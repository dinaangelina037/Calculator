package com.dina.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_tambah.setOnClickListener{
//            1. Input
//            val awal = edt_awal.text.toString().toInt()
//            val kedua = edt_kedua.text.toString().toInt()
//
//            2. Proses
//            val hasil = awal + kedua
//
//            3. Output
//            tv_hasil.text = hasil.toString()

            validasi(edt_awal.text.toString(),edt_kedua.text.toString(), '+')
        }

        btn_kurang.setOnClickListener{
            validasi(edt_awal.text.toString(),edt_kedua.text.toString(), '-')

        }

        btn_bagi.setOnClickListener{
            validasi(edt_awal.text.toString(),edt_kedua.text.toString(), '/')

        }

        btn_kali.setOnClickListener{
            validasi(edt_awal.text.toString(),edt_kedua.text.toString(), '*')

        }
    }

    private fun validasi(awal: String, kedua: String, operator: Char) {
        if (awal.isEmpty()) {
            edt_awal.error = "Silahkan isi angka pertama"
        }
        if (kedua.isEmpty()){
            edt_kedua.error = "Silahkan isi angka kedua"
        }
        if (awal.isNotEmpty() && kedua.isNotEmpty()){
            kalkulasi(awal.toDouble(), kedua.toDouble(), operator)
        }
    }

    private fun kalkulasi(awal: Double, kedua: Double, operator: Char) {
        var hasil = 0.0
        when(operator){
            '+' -> hasil = awal + kedua
            '-' -> hasil = awal - kedua
            '/' -> hasil = awal / kedua
            '*' -> hasil = awal * kedua
     else -> hasil =0.0

        }
        tv_hasil.text = hasil.toString()
    }
}