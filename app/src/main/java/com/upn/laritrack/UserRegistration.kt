package com.upn.laritrack

import java.io.Serializable

data class UserRegistration(
    val name: String,
    val email: String,
    val password: String
) : Serializable
