package com.example.sophos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sophos.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSendDocument.setOnClickListener {
            var intent = Intent(this, SendDocumentActivity::class.java)
            startActivity(intent)
        }

        binding.btnSearchDocument.setOnClickListener {
            var intent = Intent(this, ShowDocumentsActivity::class.java)
            startActivity(intent)
        }
    }
}