package com.example.android.mediaplayer;

//Customer ArrayAdapter for displaying songs, their titles and their artists

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    //Constructor for creating a new WordAdapter
    //@param context is the current context
    //@param songs is a list of songs, their titles and their artists
    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    //provide a View for an AdapterView
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.song, parent, false);
        }

        //get the current Song in our list
        Song currentSong = getItem(position);

        //find the current TextView in our layout and update the song title
        TextView songTitleTextView = (TextView) listItemView.findViewById(R.id.songTitle);
        songTitleTextView.setText(currentSong.getSongTitle());
        ;

        // find the current TextView in our layout and update the song artist
        TextView songArtistTextView = (TextView) listItemView.findViewById(R.id.songArtist);
        songArtistTextView.setText(currentSong.getSongArtist());

        //return our whole song list item layout
        return listItemView;
    }

}
