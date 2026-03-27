package com.upn.laritrack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText

class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Terima object UserRegistration dari RegisterFragment (jika ada)
        val args = LoginFragmentArgs.fromBundle(requireArguments())
        val userRegistration = args.userRegistration

        if (userRegistration != null) {
            // Pre-fill email dari data registrasi
            view.findViewById<TextInputEditText>(R.id.etEmail).setText(userRegistration.email)

            // Tampilkan pesan selamat datang dengan nama user
            Toast.makeText(
                requireContext(),
                "Halo ${userRegistration.name}! Silakan login dengan akun baru Anda.",
                Toast.LENGTH_LONG
            ).show()
        }

        view.findViewById<View>(R.id.btnBack).setOnClickListener {
            view.findNavController().navigateUp()
        }

        // Tombol Login -> Pindah ke Beranda
        view.findViewById<View>(R.id.btnLoginSubmit).setOnClickListener {
            view.findNavController().navigate(R.id.action_loginFragment_to_berandaFragment)
        }

        // Teks "Don't have an account? Register Now"
        view.findViewById<View>(R.id.tvRegisterLink).setOnClickListener {
            view.findNavController().navigateUp()
        }
    }
}