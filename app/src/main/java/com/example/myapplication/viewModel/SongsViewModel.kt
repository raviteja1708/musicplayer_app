package com.example.myapplication.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication.model.Songs
import com.example.myapplication.model.SongsListData

class SongsViewModel : ViewModel() {
    private val songDetails = MutableLiveData<Songs>()
    private var songsListData = SongsListData().getSongDetails()
    private var currentIndex = 0
    private val _selectedSong = MutableLiveData<Songs>()
    private var selectedSong: LiveData<Songs> = _selectedSong
    fun selectSong(songs: Songs)
    {
        _selectedSong.value = songs
    }

    fun  songDetails(): LiveData<Songs>
    {
        return songDetails
    }
    fun nextSong()
    {
        currentIndex = (currentIndex +1)
        currentIndex %=songsListData.size
        songDetails.value = songsListData[currentIndex]
    }
    fun previousSong() {
        if (currentIndex - 1 < 0)
        {
            currentIndex = songsListData.lastIndex
            songDetails.value = songsListData[currentIndex]
        }
        else
        {
            currentIndex = currentIndex -1
            songDetails.value = songsListData[currentIndex]
        }

    }
}