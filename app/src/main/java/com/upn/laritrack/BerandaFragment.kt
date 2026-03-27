package com.upn.laritrack

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.findNavController

class BerandaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_beranda, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Bottom Navigation - Profil (index 3)
        val bottomNav = view.findViewById<LinearLayout>(R.id.bottomNavigation)
        if (bottomNav != null && bottomNav.childCount >= 4) {
            val profilMenu = bottomNav.getChildAt(3)
            profilMenu.setOnClickListener {
                view.findNavController().navigate(R.id.action_berandaFragment_to_profilFragment)
            }
        }

        // Profile Image (kiri atas) → ke Profil
        view.findViewById<View>(R.id.imgProfile)?.setOnClickListener {
            view.findNavController().navigate(R.id.action_berandaFragment_to_profilFragment)
        }

        // FAB tombol + → ke Catat Lari
        view.findViewById<View>(R.id.fabAdd)?.setOnClickListener {
            view.findNavController().navigate(R.id.action_berandaFragment_to_catatLariFragment)
        }
    }
}