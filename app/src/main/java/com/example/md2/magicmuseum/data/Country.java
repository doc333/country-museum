package com.example.md2.magicmuseum.data;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by md2 on 04/08/2015.
 */
public class Country {
    private int id;
    private int image;
    private int imageList;
    private String name;
    private String description;
    private String capital;
    private String population;
    private String climat;

    public Country() {
        this(0, 0, 0, "", "", "", "", "");
    }

    public Country(int id, int imageList, int image, String name, String description, String capital, String population, String climat) {

        this.id = id;
        this.image = image;
        this.imageList = imageList;
        this.name = name;
        this.description = description;
        this.capital = capital;
        this.population = population;
        this.climat = climat;
    }

    public int getImageList() {
        return imageList;
    }

    public void setImageList(int imageList) {
        this.imageList = imageList;
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
