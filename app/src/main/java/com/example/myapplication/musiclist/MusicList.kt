package com.example.myapplication.musiclist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMusicListBinding
import com.example.myapplication.model.Songs
import com.example.myapplication.model.SongsListData
import com.example.myapplication.viewModel.SongsViewModel


class MusicList : Fragment() {
    private lateinit var binding : FragmentMusicListBinding
    private lateinit var viewModel: SongsViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SongsViewModel ::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicListBinding.inflate(layoutInflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val songsList = SongsListData().getSongDetails()

        val adapter = MusicListAdapter(songsList){selectedSong ->
            viewModel.selectSong(selectedSong)
            parentFragmentManager.popBackStack()
        }
        binding.musicList.layoutManager = LinearLayoutManager(requireContext())
        binding.musicList.adapter = adapter


    }

}