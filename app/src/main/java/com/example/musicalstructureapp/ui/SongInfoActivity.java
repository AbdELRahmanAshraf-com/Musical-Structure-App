package com.example.musicalstructureapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.musicalstructureapp.R;

public class SongInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song_info);
        //Receive values
        Bundle b = getIntent().getExtras();
        assert b != null;
        //Redeclaration
        String title = b.getString("songTitle");
        final String artist = b.getString("songArtist");
        final String album = b.getString("songAlbum");
        int image = b.getInt("songImage");
        //Putting values in design
        ImageView songim = findViewById(R.id.iv_songImage);
        songim.setImageResource(image);
        TextView songTittle = findViewById(R.id.tv_musicName);
        songTittle.setText(title);
        Button btn_album = findViewById(R.id.btn_album);
        btn_album.setText(album);
        Button btn_artist = findViewById(R.id.btn_artist);
        btn_artist.setText(artist);
        //Artist button function
        btn_artist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ArtistActivity.class);
                intent.putExtra("songArtist", artist);
                startActivity(intent);

            }
        });
        //Album button function
        btn_album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AlbumSongsActivity.class);
                intent.putExtra("songAlbum", album);
                startActivity(intent);

            }
        });
    }
}
