package se.iths.erikthorell.javaverktyg_labb.Model;

public class VideoGames {
    private String title;
    private String genre;
    private int releaseYear;
    private String studioName;

    public VideoGames(String title, String genre, int releaseYear, String studioName) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.studioName = studioName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }
}
