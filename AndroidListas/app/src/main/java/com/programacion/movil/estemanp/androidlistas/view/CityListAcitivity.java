package com.programacion.movil.estemanp.androidlistas.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.programacion.movil.estemanp.androidlistas.controller.AppController;
import com.programacion.movil.estemanp.androidlistas.model.Country;
import com.programacion.movil.estemanp.androidlistas.R;
import com.programacion.movil.estemanp.androidlistas.view.Adapters.CountryAdapter;

import java.util.ArrayList;

public class CityListAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_list_acitivity);

        //Localizamos la lista en el control grafico layout en el xml
        ListView listCountry = (ListView) findViewById(R.id.countryList);

        //Se instancia la clase adaptador personalizado
        CountryAdapter adaptador = new CountryAdapter(this, AppController.getInstance().getCountries());

        //Se coloca el adaptador al listview
        listCountry.setAdapter(adaptador);
    }
}
