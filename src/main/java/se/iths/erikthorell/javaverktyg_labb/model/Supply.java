package se.iths.erikthorell.javaverktyg_labb.model;

public class Supply {
    private String title;
    private String type;
    private String colour;

    public Supply(String title, String type, String colour) {
        this.title = title;
        this.type = type;
        this.colour = colour;
    }

    public String getTitle() {return title;}
    public String getType() {return type;}
    public String getColour() {return colour;}
}
