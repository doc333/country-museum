package com.example.md2.magicmuseum.data;

import java.util.ArrayList;

public class CountryList {

    private ArrayList<Country> tab;

    public CountryList(){
        tab.add(new Country(1, 0, 0, 0, 0, "Vietnam", "Nice", "Hanoi", "90000000", "Tropical"));
        tab.add(new Country(2, 0, 0, 0, 0, "France", "Nice", "Paris", "70000000", "Tempéré"));
        tab.add(new Country(3, 0, 0, 0, 0, "Angleterre", "Nice", "Londre", "60000000", "Oceanique tempéré"));
    }


    public ArrayList<Integer> getIds(){
        for(Country object: this.tab){
            System.out.println(object);
        }

        return null;
    }
}
