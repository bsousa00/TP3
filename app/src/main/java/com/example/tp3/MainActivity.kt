package com.example.tp3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

const val PARAM1_NAME = "nome"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

    }

    override fun onPause() {
        super.onPause()
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle item selection
        return when (item.itemId) {
            R.id.create_new -> {
                Toast.makeText(this, "@strings/app_name", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao2 -> {
                Toast.makeText(this, "opcao2", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao3 -> {
                Toast.makeText(this, "opcao3", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.opcao4 -> {
                Toast.makeText(this, "opcao4", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

}