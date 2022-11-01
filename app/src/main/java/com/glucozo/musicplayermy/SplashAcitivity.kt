package com.glucozo.musicplayermy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.glucozo.music.media.MediaLoader
import com.glucozo.musicplayermy.databinding.SplashAcitivityBinding

class SplashAcitivity : AppCompatActivity() {
    private lateinit var binding: SplashAcitivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SplashAcitivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MediaLoader.getInstance(this)
        binding.root.postDelayed(
            {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }, 3000
        )
    }
}