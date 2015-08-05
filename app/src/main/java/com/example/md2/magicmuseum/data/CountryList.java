package com.example.md2.magicmuseum.data;

import java.util.ArrayList;

public class CountryList {

    private ArrayList<Country> tab;

    public CountryList(){

        tab = new ArrayList<Country>();

        this.tab.add(new Country(1, 0, 0, 0, 0, "Vietnam", "Nice", "Hanoi", "90000000", "Tropical"));
        this.tab.add(new Country(2, 0, 0, 0, 0, "France", "Nice", "Paris", "70000000", "Tempéré"));
        this.tab.add(new Country(3, 0, 0, 0, 0, "Angleterre", "Nice", "Londre", "60000000", "Oceanique tempéré"));

    }


    public ArrayList<Integer> getIds(){

        ArrayList<Integer> ids = new ArrayList<Integer>();

        for(Country object: this.tab){
            ids.add(object.getId());
        }

        return ids;
    }


    public Country getCountryById(int id){
        Country country = new Country();

        for(Country object: this.tab){
            if(object.getId() == id){
                country = object;
            }
        }
        
        return country;
    }
}
