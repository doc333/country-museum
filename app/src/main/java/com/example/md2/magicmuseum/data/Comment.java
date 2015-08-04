package com.example.md2.magicmuseum.data;

/**
 * Created by md2 on 04/08/2015.
 */
public class Comment {
    private int id;
    private Country country;
    private String comment;

    public Comment() {this(0, new Country(), "");}
    public Comment(int id, Country country, String comment) {
        this.id = id;
        this.country = country;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
