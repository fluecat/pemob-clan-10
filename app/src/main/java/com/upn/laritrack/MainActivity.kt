package com.upn.laritrack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upn.laritrack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Kita gunakan R.layout.activity_main secara langsung agar Navigation Component bekerja dengan baik
        setContentView(R.layout.activity_main)
        // NavHostFragment akan otomatis menampilkan startDestination (WelcomeFragment)
        // Jadi kita tidak perlu lagi melakukan pemanggilan manual di sini.
    }
}