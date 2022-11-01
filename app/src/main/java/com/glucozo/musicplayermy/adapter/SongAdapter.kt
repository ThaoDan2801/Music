package com.glucozo.musicplayermy.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.glucozo.music.media.MediaManager
import com.glucozo.musicplayermy.databinding.ItemSongBinding
import com.glucozo.musicplayermy.model.Song



class SongAdapter(
    private val songs: List<Song>,
): RecyclerView.Adapter<SongAdapter.ViewHolder>(){

    class ViewHolder(private val binding: ItemSongBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(song: Song) {
           binding.songNameMV.text = song.album
           binding.songAlbumMV.text = song.displayName
            binding.songDuration.text = song.duration.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemSongBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        songs[position].let {
            holder.bind(it)
        }

    }

    override fun getItemCount() = songs.size
}