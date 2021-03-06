package com.example.md2.magicmuseum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.md2.magicmuseum.data.Country;
import com.example.md2.magicmuseum.data.CountryList;

import java.util.ArrayList;

/**
 * Created by md2 on 04/08/2015.
 */
public class CountryActivity extends AppCompatActivity {

    private CountryList countryList;
    private int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            // Get country id send by the other activity
            index = extras.getInt("countryId");
        }

        // Initialize the List of countries
        countryList = new CountryList();
        displayCountry();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if (id == R.id.action_country_listview) {
            Intent intent = new Intent(CountryActivity.this, CountryListActivity.class);
            startActivity(intent);
        }
        if (id == R.id.action_museum) {
            Intent intent = new Intent(CountryActivity.this, MuseumActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void nextCountry(View view) {
        // Display the next country
        if (!countryList.getCountryList().isEmpty() && index < countryList.getCountryList().size()) {
            index += 1;
            displayCountry();
        }
    }

    public void prevCountry(View view) {
        // Display the previous country
        if (!countryList.getCountryList().isEmpty() && index > 1) {
            index -= 1;
            displayCountry();
        }
    }

    public void displayCountry() {
        // Display all the info of the selected country
        Country country = countryList.getCountryById(index);

        ImageView image = (ImageView) findViewById(R.id.ImageViewCountry);
        image.setImageResource(country.getImage());

        TextView name = (TextView) findViewById(R.id.CountryName);
        name.setText(country.getName());

        TextView capital = (TextView) findViewById(R.id.CountryCapital);
        capital.setText(country.getCapital());

        TextView population = (TextView) findViewById(R.id.CountryPopulation);
        population.setText(country.getPopulation());

        TextView climat = (TextView) findViewById(R.id.CountryClimat);
        climat.setText(country.getClimat());

        TextView description = (TextView) findViewById(R.id.CountryDescription);
        description.setText(country.getDescription());
    }
}
