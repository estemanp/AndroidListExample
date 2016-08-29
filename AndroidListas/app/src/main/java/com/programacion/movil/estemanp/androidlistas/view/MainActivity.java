package com.programacion.movil.estemanp.androidlistas.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.programacion.movil.estemanp.androidlistas.R;
import com.programacion.movil.estemanp.androidlistas.controller.AppController;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Localizamos la lista en el control grafico layout en el xml
        ListView lista = (ListView) findViewById(R.id.listCities);

        // Creamos el adaptador asignando tambien el diseño grafico
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, AppController.getInstance().getCityList());

        // Asignamos el adaptador al control lista
        lista.setAdapter(adaptador);
    }
}
