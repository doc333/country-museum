package com.example.md2.magicmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import com.example.md2.magicmuseum.data.Country;
import com.example.md2.magicmuseum.data.CountryList;
import java.util.ListIterator;
import android.view.View;

import com.example.md2.magicmuseum.data.Country;
import com.example.md2.magicmuseum.data.CountryList;

import java.util.ArrayList;

/**
 * Created by admin on 04/08/2015.
 */
public class MuseumActivity extends AppCompatActivity {

    private CountryList countries;
    private int currentCountryIndex = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
        countries = new CountryList();

        ListIterator<Country> iterator = countries.getCountryList().listIterator(currentCountryIndex);
        int i = 0;
        while(i < 3 && iterator.hasNext())
        {
            i++;
            Country c = iterator.next();
            countries.getCountryList().iterator().next();
            int countryId = c.getId();
            ImageView image = (ImageView) findViewById(this.getResources().getIdentifier("imageView" + i, "id", this.getPackageName()));
            image.setImageResource(this.getResources().getIdentifier("big_" + countryId, "mipmap", this.getPackageName()));
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
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
            Intent intent = new Intent(MuseumActivity.this, CountryList.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void activityCountry(View view) {
        Intent intent = new Intent(MuseumActivity.this, CountryActivity.class);
        startActivity(intent);
    }
}
