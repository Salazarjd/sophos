package com.example.sophos

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.sophos.databinding.ActivityMainBinding
import com.example.sophos.model.User
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.*
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val pass = binding.etPassword.text.toString()

            if(email.isNotEmpty() && pass.isNotEmpty()){
                verifyuser(email, pass)
            }else{
                Toast.makeText(this, "Todos los campos son obligatorios", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun verifyuser(email: String, pass: String) {
        val retrofitBuilder = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl("https://6w33tkx4f9.execute-api.us-east-1.amazonaws.com/")
            .build()
            .create(APIService::class.java)

        val retrofitData = retrofitBuilder.getUser(email, pass)

        retrofitData.enqueue(object: Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {
                val user = response.body()
                println(user?.nombre)

            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                Log.d("MainActivity", "onFailure: ${t.message}")
            }
        })
    }


}