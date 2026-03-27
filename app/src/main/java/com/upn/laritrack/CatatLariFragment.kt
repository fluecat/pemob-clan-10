package com.upn.laritrack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText

class CatatLariFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_catat_lari, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Tombol kembali ke halaman sebelumnya (Profil)
        view.findViewById<View>(R.id.btnBack)?.setOnClickListener {
            view.findNavController().navigateUp()
        }

        // Tombol Simpan: kumpulkan data form ke data class, lalu kirim ke ProfilFragment
        view.findViewById<View>(R.id.btnSave)?.setOnClickListener {
            val tanggal = view.findViewById<TextInputEditText>(R.id.etDate).text.toString()
            val jarak = view.findViewById<TextInputEditText>(R.id.etDistance).text.toString()
            val waktu = view.findViewById<TextInputEditText>(R.id.etTime).text.toString()
            val catatan = view.findViewById<TextInputEditText>(R.id.etNote).text.toString()

            // Buat data class RunData
            val runData = RunData(
                tanggal = tanggal,
                jarakKm = jarak,
                waktu = waktu,
                catatan = catatan
            )

            Toast.makeText(
                requireContext(),
                "Perjalanan disimpan! Jarak: $jarak km",
                Toast.LENGTH_SHORT
            ).show()

            // Kirim object RunData kembali ke ProfilFragment via Safe Args
            val action = CatatLariFragmentDirections.actionCatatLariFragmentToProfilFragment(runData)
            view.findNavController().navigate(action)
        }
    }
}