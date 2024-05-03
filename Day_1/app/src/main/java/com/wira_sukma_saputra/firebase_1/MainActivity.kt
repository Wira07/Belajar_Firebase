package com.wira_sukma_saputra.firebase_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.wira_sukma_saputra.firebase_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var firebaseRef : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseRef = FirebaseDatabase.getInstance().getReference("test")

        binding.tvSendData.setOnClickListener{
            firebaseRef.setValue("subcribe please")
                .addOnCompleteListener{
                    Toast.makeText(this, "Data Berhasil di upload", Toast.LENGTH_SHORT)
                }
        }

    }
}