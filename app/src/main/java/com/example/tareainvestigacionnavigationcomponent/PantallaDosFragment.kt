package com.example.tareainvestigacionnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class PantallaDosFragment : Fragment(R.layout.fragment_pantalla_dos) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Variables para botones
        val btnPantallaTres = requireView().findViewById<Button>(R.id.btnPantallaTres)
        val btnPantallaUno = requireView().findViewById<Button>(R.id.btnPantallaUno)

        btnPantallaTres.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaTresFragment)
        }
        btnPantallaUno.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaDosFragment_to_pantallaUnoFragment)
        }

    }

}