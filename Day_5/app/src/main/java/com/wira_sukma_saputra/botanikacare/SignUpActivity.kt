package com.wira_sukma_saputra.botanikacare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wira_sukma_saputra.botanikacare.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.SignIn2.setOnClickListener {
            val signupIntent = Intent(this@SignUpActivity, SignInActivity::class.java)
            startActivity(signupIntent)
        }
    }
}