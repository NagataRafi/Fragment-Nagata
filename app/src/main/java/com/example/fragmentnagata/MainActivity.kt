package com.example.fragmentnagata

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    private lateinit var firstFragment: Button
    private lateinit var secondFragment: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment = findViewById(R.id.firstFragment)
        secondFragment = findViewById(R.id.secondFragment)

        firstFragment.setOnClickListener {
            loadFragment(FirstFragment())
        }

        secondFragment.setOnClickListener {
            loadFragment(SecondFragment())
        }
    }

    private fun loadFragment(fragment: Fragment) {

        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction =
            fm.beginTransaction()

        fragmentTransaction.replace(
            R.id.frameLayout,
            fragment
        )

        fragmentTransaction.commit()
    }
}