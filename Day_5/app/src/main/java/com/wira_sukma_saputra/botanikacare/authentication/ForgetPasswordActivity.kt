package com.wira_sukma_saputra.botanikacare.authentication

import android.os.Bundle
import android.text.TextUtils
import android.util.Patterns
import android.view.View
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import com.wira_sukma_saputra.botanikacare.BaseActivity
import com.wira_sukma_saputra.botanikacare.databinding.ActivityForgetPasswordBinding

class ForgetPasswordActivity : BaseActivity() {
    private var binding: ActivityForgetPasswordBinding? = null
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPasswordBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        auth = Firebase.auth

        binding?.ForgotPasswordSubmit?.setOnClickListener {
            resetPassword()
        }
    }

    private fun validateForm(email:String):Boolean
    {
        return when {
            TextUtils.isEmpty(email) && !Patterns.EMAIL_ADDRESS.matcher(email).matches()-> {
                binding?.tilEmailForgetPassword?.error = "Enter valid email address"
                false
            }
            else -> true
        }
    }

    private fun resetPassword()
    {
        val email = binding?.etForgotPasswordEmail?.text.toString()
        if (validateForm(email))
        {
            showProgressBar()
            auth.sendPasswordResetEmail(email).addOnCompleteListener{task->
                if (task.isSuccessful)
                {
                    hideProgressBar()
                    binding?.tilEmailForgetPassword?.visibility = View.GONE
                    binding?.reset?.visibility = View.VISIBLE
                    binding?.ForgotPasswordSubmit?.visibility = View.GONE
                }
                else {
                    hideProgressBar()
                    showToast(this,"Anda belum bisa ganti password. Coba Lagi!!")
                }
            }
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}