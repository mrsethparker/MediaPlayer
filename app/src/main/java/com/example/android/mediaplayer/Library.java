package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Library extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the initial layout for the Library activity
        setContentView(R.layout.library);

        //create our list of songs
        ArrayList<Song> songs = new ArrayList<>();

        //initialize our song list with titles and artists
        songs.add(new Song("Moonlight", "Rameses B"));
        songs.add(new Song("1.16.16 Chilled Mix", "Mitis"));
        songs.add(new Song("If You", "Skrux"));
        songs.add(new Song("Glass Mansion", "Elephante"));
        songs.add(new Song("California Dreamin", "Freischwimmer"));
        songs.add(new Song("Hometown Girl", "ZHU"));
        songs.add(new Song("Wildflower (Special)", "Mitis"));
        songs.add(new Song("Atlas", "Faux Tales"));

        //create a new SongAdapter with our song list
        SongAdapter adapter = new SongAdapter(this, songs);

        //get the layout for displaying our song list
        ListView listView = (ListView) findViewById(R.id.list);

        //attach our SongAdapter to our song list layouw
        listView.setAdapter(adapter);

        //Find the button that shows the library screen home activity
        Button libraryHomeButton = (Button) findViewById(R.id.libraryHomeButton);

        //Set a click listener on the library screen home button
        libraryHomeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryHomeIntent = new Intent(Library.this, HomeActivity.class);
                startActivity(libraryHomeIntent);
            }
        });

        //Find the button that shows the library screen now playing activity
        Button libraryNowPlayingButton = (Button) findViewById(R.id.libraryNowPlayingButton);

        //Set a click listener on the library screen now playing button
        libraryNowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing button is clicked on.
            @Override
            public void onClick(View view) {
                Intent libraryNowPlayingIntent = new Intent(Library.this, NowPlaying.class);
                startActivity(libraryNowPlayingIntent);
            }
        });
    }

    ;
}
