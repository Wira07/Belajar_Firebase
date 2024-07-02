package com.wira_sukma_saputra.jobappwira.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wira_sukma_saputra.jobappwira.databinding.ActivityIntroBinding

class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}