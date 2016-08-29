package com.programacion.movil.estemanp.androidlistas.model;

/**
 * Created by estemanp on 29/08/16.
 */
public class Country {

    private String name;
    private String capitalCity;
    private int imgCity;

    public Country(String country, String capitalCity, int imageCity) {
        setName(country);
        setCapitalCity(capitalCity);
        setImgCity(imageCity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapitalCity() {
        return capitalCity;
    }

    public void setCapitalCity(String capitalCity) {
        this.capitalCity = capitalCity;
    }

    public int getImgCity() {
        return imgCity;
    }

    public void setImgCity(int imgCity) {
        this.imgCity = imgCity;
    }
}
