package com.glucozo.musicplayermy.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.glucozo.music.media.MediaLoader
import com.glucozo.musicplayermy.adapter.SongAdapter
import com.glucozo.musicplayermy.databinding.FragmentSongBinding

class SongFragment : Fragment() {
    private lateinit var binding: FragmentSongBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSongBinding.inflate(inflater, container, false)
        binding.lvSong.apply {
            layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            Log.d(
                "thaont",
                "fragment Song size: ${MediaLoader.getInstance(requireContext()).arrSong.size}"
            )
            adapter = SongAdapter(
                MediaLoader.getInstance(requireContext()).arrSong
            )
        }
        return binding.root


    }

}