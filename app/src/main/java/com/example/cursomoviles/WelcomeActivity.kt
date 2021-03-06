package com.example.cursomoviles

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class WelcomeActivity : AppCompatActivity() {
    private lateinit var txvUsername: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        txvUsername = findViewById(R.id.txvUsername)
        txvUsername.setText(intent.getStringExtra("username"))

        val fab: View = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Element added", Snackbar.LENGTH_LONG)
                .show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_search -> {
                Toast.makeText(this, R.string.text_action_search, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_settings -> {
                Toast.makeText(this, R.string.text_action_settings, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_logout -> {
                Toast.makeText(this, R.string.text_action_logout, Toast.LENGTH_LONG).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}
