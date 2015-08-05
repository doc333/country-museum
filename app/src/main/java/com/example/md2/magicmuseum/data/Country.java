package com.example.md2.magicmuseum.data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by md2 on 04/08/2015.
 */
public class Country {
    private int id;
    private int img_teaser_big;
    private int img_teaser_medium;
    private int img_teaser_min;
    private int image;
    private String name;
    private String description;
    private String capital;
    private String population;
    private String climat;

    public Country() {
        this(0, 0, 0, 0, 0, "", "", "", "", "");
    }

    public Country(int id, int img_teaser_big, int img_teaser_medium, int img_teaser_min, int image, String name, String description, String capital, String population, String climat) {

        this.id = id;
        this.img_teaser_big = img_teaser_big;
        this.img_teaser_medium = img_teaser_medium;
        this.img_teaser_min = img_teaser_min;
        this.image = image;
        this.name = name;
        this.description = description;
        this.capital = capital;
        this.population = population;
        this.climat = climat;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public void setClimat(String climat) {
        this.climat = climat;
    }

    public String getCapital() {

        return capital;
    }

    public String getPopulation() {
        return population;
    }

    public String getClimat() {
        return climat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImg_teaser_big() {
        return img_teaser_big;
    }

    public void setImg_teaser_big(int img_teaser_big) {
        this.img_teaser_big = img_teaser_big;
    }

    public int getImg_teaser_medium() {
        return img_teaser_medium;
    }

    public void setImg_teaser_medium(int img_teaser_medium) {
        this.img_teaser_medium = img_teaser_medium;
    }

    public int getImg_teaser_min() {
        return img_teaser_min;
    }

    public void setImg_teaser_min(int img_teaser_min) {
        this.img_teaser_min = img_teaser_min;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
