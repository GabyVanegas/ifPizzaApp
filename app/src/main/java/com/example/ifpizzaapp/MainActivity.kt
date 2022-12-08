package com.example.ifpizzaapp

import android.content.ClipData
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import org.jetbrains.annotations.NotNull

class MainActivity : Fragment(), View.OnClickListener  {

    lateinit var txvNombreUsuario: TextView
    lateinit var btnDireccion: Button
    //lateinit var mAuth: FirebaseAuth
    //lateinit var mDatabase: DatabaseReference

    companion object {
        fun newInstance(): MainActivity = MainActivity()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view: View = inflater.inflate(R.layout.activity_main, container, false)

        btnDireccion = view.findViewById(R.id.btnDireccion)

        return view

        btnDireccion.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when (p0!!.id) {
            R.id.btnDireccion->{
                startActivity(Intent(activity, Maps_Activity::class.java))
            }
        }
    }
}