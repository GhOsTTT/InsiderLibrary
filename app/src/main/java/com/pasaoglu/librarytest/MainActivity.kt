package com.pasaoglu.librarytest

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pasaoglu.insiderlibrary.GenerateStar
import com.pasaoglu.insiderlibrary.data.enums.SizeEnum
import com.pasaoglu.librarytest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val generateStarLibrary = GenerateStar()
        binding.btnBigStar.setOnClickListener {
            try {
                generateStarLibrary.createStar(SizeEnum.BIG)
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT)
            }
        }
        binding.btnSmallStar.setOnClickListener {
            try {
                generateStarLibrary.createStar(SizeEnum.SMALL)
            } catch (e: Exception) {
                Toast.makeText(this, e.message, Toast.LENGTH_SHORT)
            }

        }
    }
}