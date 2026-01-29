package se.iths.erikthorell.javaverktyg_labb.model;

public class Boardgame {
    private String title;
    private String make;
    private String genre;

    public Boardgame(String title, String make, String genre) {
        this.title = title;
        this.make = make;
        this.genre = genre;
    }

    public String getTitle() {return title;}
    public String getMake() {return make;}
    public String getGenre() {return genre;}
}
