package com.example.musicalstructureapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.musicalstructureapp.controler.SongsAdapter;
import com.example.musicalstructureapp.module.DataBase;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ListView list = findViewById(R.id.list);
        //Getting object of database
        DataBase d = new DataBase();
        //Send adapter attributes
        SongsAdapter songsAdapter = new SongsAdapter(this, d.list());
        //Get data in design
        list.setAdapter(songsAdapter);

    }
}
