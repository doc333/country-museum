package com.example.md2.magicmuseum.data;

import com.example.md2.magicmuseum.R;

import java.util.ArrayList;

public class CountryList {

    private ArrayList<Country> countryList;

    public CountryList(){

        countryList = new ArrayList<Country>();
        //Add new country to countryList
        this.countryList.add(new Country(1, R.mipmap.list_2, R.mipmap.display1, "Vietnam", "Hô-Chi-Minh-Ville dont le statut correspond à celui d'une province vietnamienne, se divise en 19 arrondissements et 5 districts possédant une superficie de 2 090 km2 pour une population de 7 400 100 habitants (2005).", "Hanoi", "90000000", "Tropical"));
        this.countryList.add(new Country(2, R.mipmap.list_1, R.mipmap.display2, "France", "Paris est également le chef-lieu de la région Île-de-France et l'unique commune française qui est en même temps un département. Comme les villes françaises de Lyon et de Marseille, elle est divisée en arrondissements, au nombre de vingt, et possède un préfet de police.", "Paris", "70000000", "Tempéré"));
        this.countryList.add(new Country(3, R.mipmap.list_3, R.mipmap.display3, "Angleterre", "Fondée il y a presque 2 000 ans par les Romains sous le nom de Londinium, Londres était au xixe siècle la ville la plus peuplée du monde. Bien que largement dépassée dans ce domaine par de nombreuses mégapoles, elle reste une métropole de tout premier plan2, en raison de son rayonnement et de sa puissance économique, due notamment à sa place de premier centre financier mondial.", "Londre", "60000000", "Oceanique tempéré"));

    }

    public ArrayList<Country> getCountryList() {
        return countryList;
    }

    public void setCountryList(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    //Get all ids of country
    public ArrayList<Integer> getIds(){

        ArrayList<Integer> ids = new ArrayList<Integer>();

        for(Country object: this.countryList){
            ids.add(object.getId());
        }

        return ids;
    }

    //Get ObjectCountry by ID
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
