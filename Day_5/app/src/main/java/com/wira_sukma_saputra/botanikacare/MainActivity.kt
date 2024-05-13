package com.wira_sukma_saputra.botanikacare

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.wira_sukma_saputra.botanikacare.about.AboutActivity
import com.wira_sukma_saputra.botanikacare.databinding.ActivityMainBinding
import com.wira_sukma_saputra.botanikacare.splashscreen.GetStartedActivity


class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        auth = Firebase.auth

        binding?.SignOut?.setOnClickListener{
            if (auth.currentUser!=null)
            {
                auth.signOut()
                startActivity(Intent(this, GetStartedActivity::class.java))
                finish()
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_item, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_about -> {
                startActivity(Intent(this, AboutActivity::class.java))
                return true
            }
            R.id.action_list -> {
                startActivity(Intent(this, MapsActivity::class.java))
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }
}