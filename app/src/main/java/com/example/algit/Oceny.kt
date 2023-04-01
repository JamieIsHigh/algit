package com.example.algit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class Oceny : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oceny)
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