package com.example.md2.magicmuseum.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.md2.magicmuseum.R;

import java.util.ArrayList;

/**
 * Created by md2 on 06/08/2015.
 */
public class CountryListAdapter extends ArrayAdapter<Country> {

    public CountryListAdapter(Context context, ArrayList<Country> countries) {
        super(context, 0, countries);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Get the data item for this position
        Country country = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_country_adapter, parent, false);
        }
        // Lookup view for data population
        ImageView img = (ImageView) convertView.findViewById(R.id.listViewImage);
        TextView txt = (TextView) convertView.findViewById(R.id.listViewText);

        // Populate the data into the template view using the data object
        System.out.println(country.getImageList());
        img.setImageResource(country.getImageList());
        txt.setText(country.getName());

        // Return the completed view to render on screen
        return convertView;
    }
}
