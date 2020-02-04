package com.example.musicalstructureapp.module;

public class Song {
    private String songTitle;
    private String productionYear;
    private String artistName;
    private String albumName;
    private int songImage;
    private int albumImage;

    public Song(String artistName, String songTitle, String albumName, String productionYear, int songImage, int albumImage) {
        this.songTitle = songTitle;
        this.productionYear = productionYear;
        this.artistName = artistName;
        this.albumName = albumName;
        this.songImage = songImage;
        this.albumImage = albumImage;
    }

    public int getAlbumImage() {
        return albumImage;
    }

    public void setAlbumImage(int albumImage) {
        this.albumImage = albumImage;
    }

    public String getSongTitle() {
        return songTitle;
    }

    public void setSongTitle(String songTitle) {
        this.songTitle = songTitle;
    }

    public String getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(String productionYear) {
        this.productionYear = productionYear;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public int getSongImage() {
        return songImage;
    }

    public void setSongImage(int songImage) {
        this.songImage = songImage;
    }
}
