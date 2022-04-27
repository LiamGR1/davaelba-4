package com.example.leqciashualedurismere

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = findNavController(R.id.nav_container)
        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavView)

        val s = setOf(
            R.id.homeFragment,
            R.id.dashboardFragment,
            R.id.notificationFragment
        )

        setupActionBarWithNavController(navController, AppBarConfiguration(s))

        bottomNavView.setupWithNavController(navController)

    }
}