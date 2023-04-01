package com.example.algit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.button)
        val txt1 = findViewById<EditText>(R.id.editTextTextPersonName)
        val txt2 = findViewById<EditText>(R.id.editTextTextPassword)
        val txtV = findViewById<TextView>(R.id.textView3)
        val vana1 = txt1.text
        val vana2 = txt2.text

        fun onpress() {
            txtV.text = ""
        }
        btn.setOnClickListener {
            if (txt1.text == vana1 || txt2.text == vana2) {
                onpress()
            }
            else {
                txtV.text = "Uzupelnij pola!"
            }
        }
    }
}