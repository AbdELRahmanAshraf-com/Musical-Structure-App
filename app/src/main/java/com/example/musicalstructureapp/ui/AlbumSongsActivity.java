package com.example.musicalstructureapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.controler.AlbumAdapter;
import com.example.musicalstructureapp.module.DataBase;

public class AlbumSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album_songs);


        Bundle b = getIntent().getExtras();
        assert b != null;
        String album = b.getString("songAlbum");

        final ListView list = findViewById(R.id.artistList);
        //Getting object of database
        DataBase d = new DataBase();
        //Send adapter attributes
        AlbumAdapter artistAdapter = new AlbumAdapter(this, d.find(album, "album"));
        //Get data in design
        list.setAdapter(artistAdapter);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
