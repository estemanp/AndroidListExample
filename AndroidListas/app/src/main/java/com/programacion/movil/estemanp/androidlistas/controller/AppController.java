package com.programacion.movil.estemanp.androidlistas.controller;

import android.support.v7.app.AppCompatActivity;

import com.programacion.movil.estemanp.androidlistas.R;
import com.programacion.movil.estemanp.androidlistas.model.Country;

import java.util.ArrayList;

/**
 * Created by estemanp on 29/08/16.
 */
public class AppController {

    private static AppController _instance;

    private String[] cityList;
    private ArrayList<Country> countries;

    public static AppController getInstance()
    {
        if (_instance == null)
        {
            _instance = new AppController();
        }
        return _instance;
    }

    private AppController(){
        this.fillDataList();
        this.fillCountryList();
    }

    private void fillDataList(){
        cityList = new String[]{"Paris","Roma","Bogota","Buenos Aires","Lima","Quito","Madrid",
                "Londres","Berlin","Viena","Bruselas","Caracas","Brasilia","Séul","El cairo","Tokio"};
    }

    private void fillCountryList(){
        countries = new ArrayList<Country>();
        countries.add(new Country("Francia","Paris", R.mipmap.ic_colombia));
        countries.add(new Country("Italia","Roma",R.mipmap.ic_colombia));
        countries.add(new Country("Colombia","Bogota",R.mipmap.ic_colombia));
        countries.add(new Country("Argentina","Buenos Aires",R.mipmap.ic_colombia));
        countries.add(new Country("Ecuador","Quito",R.mipmap.ic_colombia));
        countries.add(new Country("Peru","Lima",R.mipmap.ic_colombia));
        countries.add(new Country("España","Madrid",R.mipmap.ic_colombia));
        countries.add(new Country("Brasil","Brasilia",R.mipmap.ic_colombia));
        countries.add(new Country("Corea del Sur","Séul",R.mipmap.ic_colombia));
        countries.add(new Country("Egipto","El cairo",R.mipmap.ic_colombia));
        countries.add(new Country("Japon","Tokio",R.mipmap.ic_colombia));
    }

    public String[] getCityList() {
        return cityList;
    }

    public void setCityList(String[] cityList) {
        this.cityList = cityList;
    }

    public ArrayList<Country> getCountries() {
        return countries;
    }

    public void setCountries(ArrayList<Country> countries) {
        this.countries = countries;
    }
}
