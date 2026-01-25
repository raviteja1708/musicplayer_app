package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.MusicTab.MusicTab
import com.example.myapplication.databinding.FragmentMusicPlayerBinding
import com.example.myapplication.musiclist.MusicList
import com.example.myapplication.viewModel.SongsViewModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MusicPlayer.newInstance] factory method to
 * create an instance of this fragment.
 */
class MusicPlayer : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    private lateinit var viewModel: SongsViewModel
    private lateinit var binding : FragmentMusicPlayerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(requireActivity()).get(SongsViewModel ::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMusicPlayerBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.songName.isSelected = true
        viewModel.songDetails().observe(viewLifecycleOwner,{song ->
            binding.songName.text = song.songName
            binding.singerName.text = song.singerName
        })
        binding.next.setOnClickListener {
            viewModel.nextSong()
        }
        binding.previous.setOnClickListener {
            viewModel.previousSong()
        }
        binding.songlist.setOnClickListener {
            val songListFragment = MusicList()
            parentFragmentManager.beginTransaction()
                .replace(R.id.main_container, songListFragment)
                .addToBackStack(null)
                .commit()
        }
        binding.backarrow.setOnClickListener {
            val musictab = MusicTab()
            parentFragmentManager.beginTransaction()
                .replace(R.id.main_container,musictab)
                .addToBackStack(null)
                .commit()
        }
    }
}