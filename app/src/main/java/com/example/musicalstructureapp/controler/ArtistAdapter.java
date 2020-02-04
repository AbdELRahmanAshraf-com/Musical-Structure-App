package com.example.musicalstructureapp.controler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.musicalstructureapp.R;
import com.example.musicalstructureapp.module.Song;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Song> {

    public ArtistAdapter(@NonNull Context context, ArrayList<Song> songs) {

        super(context, 0, songs);
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_module, parent, false);
        }
        final Song current = getItem(position);
        TextView albumName = convertView.findViewById(R.id.name);
        TextView productionYear = convertView.findViewById(R.id.album);
        ImageView albumImage = convertView.findViewById(R.id.image);
        assert current != null;


        albumName.setText(current.getAlbumName());
        productionYear.setText(current.getProductionYear());
        albumImage.setImageResource(current.getAlbumImage());


        return convertView;
    }
}
