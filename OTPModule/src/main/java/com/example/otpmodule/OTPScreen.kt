package com.example.otpmodule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class OTPScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otpscreen)
        val pinView = findViewById<PinView>(R.id.pin_view)

        pinView.setOnClickListener {

        }
    }
}