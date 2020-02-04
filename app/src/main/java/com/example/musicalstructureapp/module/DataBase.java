package com.example.musicalstructureapp.module;

import com.example.musicalstructureapp.R;

import java.util.ArrayList;

//Making class used as database
public class DataBase {
    private ArrayList<String> albums = new ArrayList<>();

    public ArrayList<Song> list() {
        //Recording data
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("عمرو دياب", "دا لو اتساب", "كل حياتي", "2018", R.drawable.dalawetsab, R.drawable.albumkolhyaty));
        songs.add(new Song("عمرو دياب", "أنت مغرور", "كل حياتي", "2018", R.drawable.entamaghror, R.drawable.albumkolhyaty));
        songs.add(new Song("عمرو دياب", "معدي الناس", "معدي الناس", "2017", R.drawable.meaddyelnas, R.drawable.albummeaddy));
        songs.add(new Song("عمرو دياب", "أحلي حاجة", "معدي الناس", "2018", R.drawable.yaahlahaga, R.drawable.albummeaddy));
        songs.add(new Song("أصالة", "بنت أكابر", "بنت أكابر", "2019", R.drawable.bentakabr, R.drawable.bentakabr));
        songs.add(new Song("أصالة", "جابو سيرتو", "في قربك", "2019", R.drawable.gaboserto, R.drawable.albumfekorbk));
        songs.add(new Song("أصالة", "خانات الذكرايات", "60 دقيقة حياة", "2015", R.drawable.khanatelzekrayat, R.drawable.albumhayah));
        songs.add(new Song("أصالة", "يا عالم", "مهتمة بالتفاصيل", "2017", R.drawable.yaalem, R.drawable.albummohtama));
        return songs;
    }

    //Search Method
    public ArrayList<Song> find(String searchObject, String searchType) {
        ArrayList<Song> songs = new ArrayList<>();
        for (Song i : list()) {
            if (searchType.equals("album")) {
                if (i.getAlbumName().equals(searchObject)) {
                    songs.add(i);
                }
            } else if (searchType.equals("artist")) {
                for (Song j : list()) {
                    if (i.getArtistName().equals(searchObject) && !albums.contains(i.getAlbumName())) {
                        albums.add(i.getAlbumName());
                        songs.add(i);
                    }
                }
            }
        }
        return songs;
    }

}
