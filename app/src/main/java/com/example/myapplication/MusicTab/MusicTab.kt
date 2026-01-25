package com.example.myapplication.MusicTab

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.R
import com.example.myapplication.databinding.FragmentMusicTabBinding
import com.example.myapplication.musiclist.MusicList
import com.example.myapplication.viewModel.SongsViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [MusicTab.newInstance] factory method to
 * create an instance of this fragment.
 */
class MusicTab : Fragment() {
   private lateinit var binding : FragmentMusicTabBinding
   private lateinit var viewModel : SongsViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SongsViewModel ::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicTabBinding.inflate(inflater,container,false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.songDetails().observe(viewLifecycleOwner){song ->
            binding.songName.text = song.songName
            binding.singerName.text = song.singerName
        }
        binding.musicList.setOnClickListener {
            val musicList = MusicList()
            parentFragmentManager.beginTransaction()
                .replace(R.id.main_container,musicList)
                .addToBackStack(null)
                .commit()
        }

    }


}