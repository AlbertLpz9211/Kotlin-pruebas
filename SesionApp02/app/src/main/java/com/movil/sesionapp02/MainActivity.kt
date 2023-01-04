package com.movil.sesionapp02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.menu_search -> {
                Toast.makeText(baseContext, "BUSCAR", Toast.LENGTH_LONG).show()
            }
            R.id.menu_option_1 -> {
                Toast.makeText(baseContext, "Opción 1", Toast.LENGTH_LONG).show()
            }
            R.id.menu_option_2 -> {
                Toast.makeText(baseContext, "Opción 2", Toast.LENGTH_LONG).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }