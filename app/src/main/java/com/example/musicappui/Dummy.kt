package com.example.musicappui

import androidx.annotation.DrawableRes

data class Lib(@DrawableRes val icon: Int, val name: String)

val libraries = listOf<Lib>(
    Lib(R.drawable.ic_playlist, "Playlist"),
    Lib(R.drawable.ic_artists, "Artists"),
    Lib(R.drawable.ic_album, "Album"),
    Lib(R.drawable.ic_songs, "Songs"),
    Lib(R.drawable.ic_genere, "Genre")
    )