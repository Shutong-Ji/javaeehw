package com.swufe.javaee.beerV1.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if (color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jali Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
    public List<Beer> getBeers(String color) {
        List<Beer> beers = new ArrayList<>();
        if (color.equals("amber")) {
            beers.add(new Beer("Jack Amber", 100.0));
            beers.add(new Beer("Red Moose", 200.0));
        }else {
            beers.add(new Beer("Jali Pale Ale",100.0));
            beers.add(new Beer("Gout Stout",100.0));
        }
        return beers;
    }

}

