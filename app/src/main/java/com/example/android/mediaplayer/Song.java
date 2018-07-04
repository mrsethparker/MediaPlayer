package com.example.android.mediaplayer;

//Information about a song

public class Song {

    //the title of the song
    private String songTitle;

    //the artist of the song
    private String songArtist;

    //Construct a new song object with an initial value for the song title {@param title}
    // and the song artist {@param artist}
    public Song(String title, String artist) {

        songTitle = title;
        songArtist = artist;
    }

    //get the title of the song
    public String getSongTitle() {
        return songTitle;
    }

    //get the artist of the song

    public String getSongArtist() {
        return songArtist;
    }
}
