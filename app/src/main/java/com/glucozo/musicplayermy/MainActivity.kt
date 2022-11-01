package com.glucozo.musicplayermy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.glucozo.musicplayermy.adapter.MusicPagerAdapter
import com.glucozo.musicplayermy.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MusicPagerAdapter(this)
        binding.content.viewPager.adapter = adapter

    }
}