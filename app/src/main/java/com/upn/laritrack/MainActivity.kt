package com.upn.laritrack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.upn.laritrack.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menyambungkan Kotlin dengan activity_main.xml
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Memanggil WelcomeFragment (atau BerandaFragment) agar tampil pertama kali di layar TV
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, WelcomeFragment()) // Ganti dengan nama Fragment pertamamu
                .commit()
        }
    }
}