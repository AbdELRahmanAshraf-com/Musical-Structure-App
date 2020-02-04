package com.example.musicalstructureapp.controler;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.musicalstructureapp.ui.SongInfoActivity;
import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.module.Song;

import java.util.ArrayList;

public class SongsAdapter extends ArrayAdapter<Song> {

    public SongsAdapter(@NonNull Context context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_module, parent, false);
        }
        final Song current = getItem(position);
        TextView songName = convertView.findViewById(R.id.name);
        TextView artistName = convertView.findViewById(R.id.album);
        ImageView songImage = convertView.findViewById(R.id.image);
        assert current != null;
        songName.setText(current.getSongTitle());
        artistName.setText(current.getArtistName());
        songImage.setImageResource(current.getSongImage());
        convertView.findViewById(R.id.linear1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SongInfoActivity.class);
                intent.putExtra("songTitle", current.getSongTitle());
                intent.putExtra("songImage", current.getSongImage());
                intent.putExtra("songArtist", current.getArtistName());
                intent.putExtra("songAlbum", current.getAlbumName());
                getContext().startActivity(intent);
            }
        });
        return convertView;
    }
}
