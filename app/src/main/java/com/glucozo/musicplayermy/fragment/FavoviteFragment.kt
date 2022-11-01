package com.glucozo.musicplayermy.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.glucozo.music.media.MediaLoader
import com.glucozo.musicplayermy.adapter.SongAdapter
import com.glucozo.musicplayermy.databinding.FragmentFavoviteBinding
import com.glucozo.musicplayermy.databinding.FragmentSongBinding

class FavoviteFragment : Fragment() {
    private lateinit var binding: FragmentFavoviteBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFavoviteBinding.inflate(inflater, container, false)
        binding.lvFavovite.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            Log.d(
                "thaont",
                "fragment favovite size: ${MediaLoader.getInstance(requireContext()).arrSong.size}"
            )
//            Log.d(
//                "thaont",
//                "fragment favovite size: ${MediaLoader.getInstance(requireContext())}"
//            )

            adapter = SongAdapter(
                MediaLoader.getInstance(requireContext()).arrSong
            )
        }
        return binding.root
    }
}