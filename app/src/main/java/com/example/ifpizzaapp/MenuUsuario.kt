package com.example.ifpizzaapp

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase

class MenuUsuario : Fragment(), View.OnClickListener{

    lateinit var txvUsuarioMenu : TextView
    lateinit var txvCorreoMenu : TextView
    lateinit var txvTelefonoMenu : TextView
    lateinit var btnEditarPerfil : Button
    lateinit var btnDirecciones : Button
    lateinit var btnCamContra : Button
    lateinit var btnCerrarSesion : Button

    lateinit var mAuth: FirebaseAuth

    companion object {
        fun newInstance(): MenuUsuario = MenuUsuario()
    }

    /*override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.activity_menu_usuario, container, false)*/

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.activity_menu_usuario, container, false)

        btnCamContra = view.findViewById(R.id.btnCamContra)
        btnCerrarSesion = view.findViewById(R.id.btnCerrarSesion)
        mAuth = FirebaseAuth.getInstance()

        btnCamContra.setOnClickListener(this)
        btnCerrarSesion.setOnClickListener(this)

        return view
    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.btnCamContra -> {
                startActivity(Intent(activity, RecuperarClave::class.java))
            }
            R.id.btnCerrarSesion -> {
                mAuth.signOut()
                startActivity(Intent(activity, Login::class.java))
                activity?.finish()
            }
        }
    }
}