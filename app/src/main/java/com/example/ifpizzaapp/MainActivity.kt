package com.example.ifpizzaapp

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.*
import org.jetbrains.annotations.NotNull

class MainActivity : Fragment() {

    lateinit var txvNombreUsuario: TextView

    //lateinit var mAuth: FirebaseAuth
    //lateinit var mDatabase: DatabaseReference

    companion object {
        fun newInstance(): MainActivity = MainActivity()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?):
            View? = inflater.inflate(R.layout.activity_main, container, false)

    /*override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view: View = inflater.inflate(R.layout.activity_menu_usuario, container, false)

        //mAuth = FirebaseAuth.getInstance()
        //mDatabase = FirebaseDatabase.getInstance().reference
        txvNombreUsuario = view.findViewById(R.id.txvNombreUsuario)

        return view

        //obtenerInfoUsuario()
    }*/

    /*fun obtenerInfoUsuario(){
        var id: String =  mAuth.currentUser!!.uid
        mDatabase.child("usuarios").child(id).addListenerForSingleValueEvent(object : ValueEventListener {
            override fun onDataChange(@NotNull dataSnapshot: DataSnapshot) {
                if(dataSnapshot.exists()){
                    var nombre: String = dataSnapshot.child("nombre").value.toString()

                    txvNombreUsuario.text = nombre
                }
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e("Database", error.toString())
            }
        })
    }*/
}