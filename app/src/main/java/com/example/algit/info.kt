package com.example.algit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.TextView

class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val kolekcja = intent.extras

        supportActionBar!!.title = kolekcja?.getString("login").toString() + " " + kolekcja?.getString("haslo").toString()

        findViewById<TextView>(R.id.textView6).text = kolekcja?.getString("login").toString()

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.lista_dan_menu, menu)
        return true
    }
}