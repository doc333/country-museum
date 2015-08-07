package com.example.md2.magicmuseum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.md2.magicmuseum.data.Country;
import com.example.md2.magicmuseum.data.CountryList;
import com.example.md2.magicmuseum.data.CountryListAdapter;

import java.util.ArrayList;


public class CountryListActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_list);

        // Construct the data source
        final ArrayList<Country> countries = new CountryList().getCountryList();
        // Create the adapter to convert the array to views
        CountryListAdapter adapter = new CountryListAdapter(this, countries);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.CountryListView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(CountryListActivity.this, CountryActivity.class);
                intent.putExtra("countryId", countries.get(position).getId());
                startActivity(intent);
            }
        });
    }


}
