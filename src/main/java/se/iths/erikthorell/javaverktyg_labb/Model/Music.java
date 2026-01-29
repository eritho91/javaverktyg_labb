package se.iths.erikthorell.javaverktyg_labb.Model;

public class Music {
    private String songName;
    private String artist;
    private String genre;
    private int releaseYear;

    public Music(String songName, String artist, String genre, int releaseYear) {
        this.songName = songName;
        this.artist = artist;
        this.genre = genre;
        this.releaseYear = releaseYear;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
}
