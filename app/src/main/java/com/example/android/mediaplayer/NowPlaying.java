package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the initial layout for the now playing activity
        setContentView(R.layout.now_playing);

        //Find the button that shows the now playing screen home activity
        Button nowPlayingHomeButton = (Button) findViewById(R.id.nowPlayingHomeButton);

        //Set a click listener on the now playing screen home button
        nowPlayingHomeButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the home button is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingHomeIntent = new Intent(NowPlaying.this, HomeActivity.class);
                startActivity(nowPlayingHomeIntent);
            }
        });

        //Find the button that shows the now playing screen library activity
        Button nowPlayingLibraryButton = (Button) findViewById(R.id.nowPlayingLibraryButton);

        //Set a click listener on the now playing screen library button
        nowPlayingLibraryButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library button is clicked on.
            @Override
            public void onClick(View view) {
                Intent nowPlayingLibraryIntent = new Intent(NowPlaying.this, Library.class);
                startActivity(nowPlayingLibraryIntent);
            }
        });
    };
}
