package com.example.android1homework3kotlinversion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().add(R.id.fragment_container_view, firstFragment).commit()
    }
}