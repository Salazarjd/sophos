package com.example.sophos.model

data class User(
    var id: String,
    var apellido: String,
    var acceso: Boolean,
    var nombre: String,
    var admin: Boolean
)