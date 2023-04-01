package com.example.algit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        supportActionBar!!.setDisplayShowHomeEnabled(true)
        supportActionBar!!.setIcon(R.drawable.baseline_airplanemode_inactive_24)

        val k = intent.extras

        val login = k?.getString("login").toString()
        val haslo = k?.getString("haslo").toString()

        supportActionBar!!.title = login + " " + haslo
        findViewById<TextView>(R.id.textView10).text = login + " " + haslo

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val k = intent.extras
        if (item.itemId == R.id.infor && k != null) {
            val nowe = Intent(this, info::class.java)
            nowe.putExtras(k)
            startActivity(nowe)
            return true
        } else if (item.itemId == R.id.ocen && k != null) {
            val nowe = Intent(this, Oceny::class.java)
            nowe.putExtras(k)
            startActivity(nowe)
            return true
        }
        return false
    }
}