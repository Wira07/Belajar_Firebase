package com.wira_sukma_saputra.botanikacare

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import com.wira_sukma_saputra.botanikacare.databinding.ActivityGetstartedBinding

class GetStartedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGetstartedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetstartedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
