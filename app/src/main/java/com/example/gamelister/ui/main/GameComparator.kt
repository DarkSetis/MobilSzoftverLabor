package com.example.gamelister.ui.main

import android.support.v7.util.DiffUtil
import com.example.gamelister.model.dto.Game

object GameComparator : DiffUtil.ItemCallback<Game>() {

    override fun areItemsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Game, newItem: Game): Boolean {
        return oldItem == newItem
    }

}