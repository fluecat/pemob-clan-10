package com.upn.laritrack

import java.io.Serializable

data class RunData(
    val tanggal: String,
    val jarakKm: String,
    val waktu: String,
    val catatan: String
) : Serializable
