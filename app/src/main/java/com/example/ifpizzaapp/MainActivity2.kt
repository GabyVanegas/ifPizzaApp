package com.example.ifpizzaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import org.jetbrains.annotations.NotNull

class MainActivity2 : AppCompatActivity() {

    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        bottomNav = findViewById(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_home -> {
                    val fragment = MainActivity.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.navigation_favoritos -> {
                    val fragment = Favoritos.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.navigation_pedidos -> {
                    val fragment = Ordenes.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.navigation_carrito -> {
                    val fragment = Carrito.newInstance()
                    openFragment(fragment)
                    true
                }
                R.id.navigation_usuario -> {
                    val fragment = MenuUsuario.newInstance()
                    openFragment(fragment)
                    true
                }
                else -> false
            }
        }

        bottomNav.selectedItemId = R.id.navigation_home
    }

    private fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }
}