package com.glucozo.musicplayermy.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.glucozo.musicplayermy.fragment.FavoviteFragment
import com.glucozo.musicplayermy.fragment.SongFragment
import java.lang.IllegalArgumentException


class MusicPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    override fun getItemCount() = 2
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> SongFragment()
            1 -> FavoviteFragment()

            else -> {
                throw IllegalArgumentException("Unknown to create fragment for position : $position")
            }
        }
    }


}