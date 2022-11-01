package com.glucozo.music.media

import android.media.MediaPlayer
import com.glucozo.musicplayermy.model.Song

enum class MediaState{
    STATE_IDLE, STATE_PLAYING, STATE_PAUSE, STATE_STOP
}

// play / pause arrSong
object MediaManager {
    // array song that playing
     val songs = arrayListOf<Song>()
     val mediaPlayer = MediaPlayer()
     var songIndex = 0// bai hat dang duoc playư
     var mediaState = MediaState.STATE_IDLE// quan ly state hien tai cua media

    init {
        mediaPlayer.setOnCompletionListener {
            nextSong()
        }
    }
    fun setSongs(temp: List<Song>){
        songs.clear()
        songs.addAll(temp)
    }

    fun nextSong(){
        if (songIndex < songs.size -1){
            songIndex++
        }else{
            songIndex = 0
        }
        playPauseSong(true)// chay mot bai moi

    }
    fun previosSong(){
        if (songIndex >0){
            songIndex--
        }else{
            songIndex = songs.size - 1
        }

    }
    fun playPauseSong(isNew: Boolean){
        if (mediaState == MediaState.STATE_IDLE || isNew){
            // neu dang chay hoac isNew chay moi -> chay lai tu dau
            mediaPlayer.reset()
            mediaPlayer.setDataSource(songs[songIndex].dataPath)
            mediaPlayer.prepare()
            mediaPlayer.start()
            mediaState = MediaState.STATE_PLAYING
        }else if(mediaState == MediaState.STATE_PLAYING){
            //pause bai hat lai
            mediaPlayer.pause()
            mediaState = MediaState.STATE_PAUSE
        }else if (mediaState == MediaState.STATE_PAUSE){
            // chay bai hat lai
            mediaPlayer.pause()
            mediaState = MediaState.STATE_PLAYING
        }
    }
    fun playSong(){
        if (mediaState == MediaState.STATE_IDLE){
            return
        }
        mediaPlayer.stop()
        mediaState = MediaState.STATE_IDLE
    }
    fun stopSong(isAgain: Boolean){

    }
}