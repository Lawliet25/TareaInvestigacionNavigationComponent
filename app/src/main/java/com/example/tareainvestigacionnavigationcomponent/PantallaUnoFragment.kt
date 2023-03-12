package com.example.tareainvestigacionnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class PantallaUnoFragment : Fragment(R.layout.fragment_pantalla_uno) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Variables para botones
        val btnPantallaDos = requireView().findViewById<Button>(R.id.btnPantallaDos)
        val btnPantallaTres = requireView().findViewById<Button>(R.id.btnPantallaTres)

        btnPantallaDos.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaDosFragment)
        }
        btnPantallaTres.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaUnoFragment_to_pantallaTresFragment)
        }
    }

}