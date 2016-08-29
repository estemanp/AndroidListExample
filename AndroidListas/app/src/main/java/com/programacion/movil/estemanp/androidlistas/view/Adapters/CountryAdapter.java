package com.programacion.movil.estemanp.androidlistas.view.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.programacion.movil.estemanp.androidlistas.model.Country;
import com.programacion.movil.estemanp.androidlistas.R;

import java.util.ArrayList;

/**
 * Created by estemanp on 29/08/16.
 */
public class CountryAdapter extends ArrayAdapter<Country> {

    private final Context contexto;
    private ArrayList<Country> countriesList;

    public CountryAdapter(Context context, ArrayList<Country> countries) {
        super(context, -1, countries);
        this.contexto = context;
        this.countriesList = countries;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) contexto
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View layoutCountry = inflater.inflate(R.layout.adapter_country, parent, false);

        ImageView imgCountry = (ImageView) layoutCountry.findViewById(R.id.imgCountry);
        TextView txtName = (TextView) layoutCountry.findViewById(R.id.txtCountry);
        TextView txtCapital = (TextView) layoutCountry.findViewById(R.id.txtCity);


        Country country = countriesList.get(position);

        imgCountry.setImageResource(country.getImgCity());
        txtName.setText(country.getName());
        txtCapital.setText(country.getCapitalCity());

        return layoutCountry;
    }
}
