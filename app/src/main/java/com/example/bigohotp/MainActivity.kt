package com.example.bigohotp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.nimitagrawal.otpmodule.OTPScreen
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn = findViewById<Button>(R.id.mns)
        btn.setOnClickListener {
            val intent = Intent(this, OTPScreen::class.java)
            startActivity(intent)
        }
    }
}