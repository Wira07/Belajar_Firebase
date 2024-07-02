package com.example.trashtrackerDemo.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.example.trashtrackerDemo.R
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class GetStartedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        val getStartBtn: CardView = findViewById(R.id.cvGetStarted)
        getStartBtn.setOnClickListener {
            startActivity(Intent(this,SignInActivity::class.java))
            finish()
        }

        val auth = Firebase.auth
        if (auth.currentUser!= null)
        {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

    }
}