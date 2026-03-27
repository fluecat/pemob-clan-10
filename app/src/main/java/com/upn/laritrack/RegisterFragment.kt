package com.upn.laritrack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText

class RegisterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<View>(R.id.btnBack).setOnClickListener {
            view.findNavController().navigateUp()
        }

        // Sign Up: kumpulkan data form ke data class, lalu kirim ke LoginFragment
        view.findViewById<View>(R.id.btnSignUp).setOnClickListener {
            val name = view.findViewById<TextInputEditText>(R.id.etName).text.toString()
            val email = view.findViewById<TextInputEditText>(R.id.etEmail).text.toString()
            val password = view.findViewById<TextInputEditText>(R.id.etPassword).text.toString()

            // Buat data class UserRegistration (tanpa re-type password)
            val userRegistration = UserRegistration(
                name = name,
                email = email,
                password = password
            )

            Toast.makeText(requireContext(), "Registrasi berhasil! Selamat datang, $name", Toast.LENGTH_SHORT).show()

            // Kirim object UserRegistration ke LoginFragment via Safe Args
            val action = RegisterFragmentDirections.actionRegisterFragmentToLoginFragment(userRegistration)
            view.findNavController().navigate(action)
        }

        // Teks "Already have an account? Log in" juga bisa diklik
        view.findViewById<View>(R.id.tvLoginLink).setOnClickListener {
            view.findNavController().navigate(R.id.action_registerFragment_to_loginFragment)
        }
    }
}