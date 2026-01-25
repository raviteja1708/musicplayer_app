package com.example.myapplication.musiclist

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.Songs
import com.example.myapplication.model.SongsListData

class MusicListAdapter(val songsListData: List<Songs>,private val onItemClick : (Songs)-> Unit) : RecyclerView.Adapter<MusicListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val songName : TextView = itemView.findViewById(R.id.songName)
        val singerName : TextView = itemView.findViewById(R.id.singerName)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.music_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        val songsListData = songsListData
        holder.songName.text = songsListData[position].songName
        holder.singerName.text = songsListData[position].singerName
        holder.itemView.setOnClickListener {
            onItemClick(songsListData[position])
        }
    }

    override fun getItemCount(): Int {
        return songsListData.size
    }
}