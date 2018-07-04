package com.example.android.mediaplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set the initial layout for the home activity
        setContentView(R.layout.activity_home);

        //Find the button that shows the home screen now playing activity
        Button homeNowPlayingButton = (Button) findViewById(R.id.HomeNowPlayingButton);

        //Set a click listener on the home screen now playing button
        homeNowPlayingButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the now playing button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeNowPlayingIntent = new Intent(HomeActivity.this, NowPlaying.class);
                startActivity(homeNowPlayingIntent);
            }
        });

        //Find the button that shows the home screen library activity
        Button homeLibraryButton = (Button) findViewById(R.id.homeLibraryButton);

        //Set a click listener on the home screen library button
        homeLibraryButton.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the library button is clicked on.
            @Override
            public void onClick(View view) {
                Intent homeLibraryIntent = new Intent(HomeActivity.this, Library.class);
                startActivity(homeLibraryIntent);
            }
        });

    }
}
