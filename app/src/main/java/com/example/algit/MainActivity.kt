package com.example.algit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.drawable.baseline_airplanemode_inactive_24)

        val btn = findViewById<Button>(R.id.button)
        val txt1 = findViewById<EditText>(R.id.editTextTextPersonName)
        val txt2 = findViewById<EditText>(R.id.editTextTextPassword)
        val txtV = findViewById<TextView>(R.id.textView3)

        fun onpress() {
            txtV.text = ""
            val k = Bundle()
            k.putString("login", txt1.text.toString())
            k.putString("haslo", txt2.text.toString())
            val intent = Intent(this, info::class.java)
            intent.putExtras(k)
            startActivity(intent)
        }
        btn.setOnClickListener {
            if (txt1.text.toString() != "" && txt2.text.toString() != "") {
                onpress()
            }
            else {
                txtV.text = "Uzupelnij pola!"
            }
        }
    }
}