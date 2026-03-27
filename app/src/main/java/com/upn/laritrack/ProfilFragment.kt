package com.upn.laritrack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController

class ProfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profil, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Terima object RunData dari CatatLariFragment (jika ada)
        try {
            val args = ProfilFragmentArgs.fromBundle(requireArguments())
            val runData = args.runData

            if (runData != null) {
                // Update UI dengan data lari
                view.findViewById<TextView>(R.id.tvProfileName)?.text = "Pelari Aktif"
                view.findViewById<TextView>(R.id.tvProfileSubtitle)?.text = "DATA LARI TERBARU"

                // Update stats boxes dengan data lari yang dikirim
                // Kita tampilkan di Toast dan update text
                Toast.makeText(
                    requireContext(),
                    "Data lari tersimpan!\nTanggal: ${runData.tanggal}\nJarak: ${runData.jarakKm} km\nWaktu: ${runData.waktu}\nCatatan: ${runData.catatan}",
                    Toast.LENGTH_LONG
                ).show()
            }
        } catch (e: Exception) {
            // Tidak ada argument — navigasi langsung ke profil tanpa data
        }

        // Tombol kembali → ke Beranda
        view.findViewById<View>(R.id.btnBack)?.setOnClickListener {
            view.findNavController().navigate(R.id.action_profilFragment_to_berandaFragment)
        }

        // Tombol "Mulai Catat Lari"
        view.findViewById<View>(R.id.btnNavCatatLari)?.setOnClickListener {
            view.findNavController().navigate(R.id.action_profilFragment_to_catatLariFragment)
        }

        // Bottom Navigation - Beranda
        val bottomNav = view.findViewById<LinearLayout>(R.id.bottomNavigation)
        if (bottomNav != null && bottomNav.childCount >= 4) {
            // Beranda (index 0)
            bottomNav.getChildAt(0).setOnClickListener {
                view.findNavController().navigate(R.id.action_profilFragment_to_berandaFragment)
            }
        }
    }
}