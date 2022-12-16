package com.example.sophos

import com.example.sophos.model.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface APIService {

    @GET("RS_Usuarios")
    fun getUser(@Query("idUsuario")email:String, @Query("clave")password:String): Call<User>
}