package com.wira_sukma_saputra.botanikacare.splashscreen

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wira_sukma_saputra.botanikacare.authentication.SignInActivity
import com.wira_sukma_saputra.botanikacare.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetstartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}
