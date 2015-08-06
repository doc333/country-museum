package com.example.md2.magicmuseum.data;

import java.util.ArrayList;

public class CountryList {

    private ArrayList<Country> countryList;

    public CountryList(){

        countryList = new ArrayList<Country>();

        this.countryList.add(new Country(1, 0, 0, 0, 0, "Vietnam", "Nice", "Hanoi", "90000000", "Tropical"));
        this.countryList.add(new Country(2, 0, 0, 0, 0, "France", "Nice", "Paris", "70000000", "Tempéré"));
        this.countryList.add(new Country(3, 0, 0, 0, 0, "Angleterre", "Nice", "Londre", "60000000", "Oceanique tempéré"));

    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    public ArrayList<Integer> getIds(){

        ArrayList<Integer> ids = new ArrayList<Integer>();

        for(Country object: this.countryList){
            ids.add(object.getId());
        }

        return ids;
    }

    public Country getCountryById(int id){
        Country country = new Country();

        for(Country object: this.countryList){
            if(object.getId() == id){
                country = object;
            }
        }
        
        return country;
    }


}
