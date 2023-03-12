package com.example.tareainvestigacionnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController


class PantallaTresFragment : Fragment(R.layout.fragment_pantalla_tres) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Variables para botones
        val btnPantallaUno = requireView().findViewById<Button>(R.id.btnPantallaUno)
        val btnPantallaDos = requireView().findViewById<Button>(R.id.btnPantallaDos)

        btnPantallaUno.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaTresFragment_to_pantallaUnoFragment)
        }
        btnPantallaDos.setOnClickListener {
            findNavController().navigate(R.id.action_pantallaTresFragment_to_pantallaDosFragment)
        }
    }
}