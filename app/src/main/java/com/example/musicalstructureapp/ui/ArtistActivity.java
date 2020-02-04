package com.example.musicalstructureapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.controler.ArtistAdapter;
import com.example.musicalstructureapp.module.DataBase;

public class ArtistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        //Receive values
        Bundle b = getIntent().getExtras();
        assert b != null;
        String artist = b.getString("songArtist");
        final ListView list = findViewById(R.id.albumList);
        //Getting object of database
        DataBase d = new DataBase();
        //Send adapter attributes
        ArtistAdapter artistAdapter = new ArtistAdapter(this, d.find(artist, "artist"));
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
