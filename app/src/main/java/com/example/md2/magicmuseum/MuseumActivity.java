package com.example.md2.magicmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.example.md2.magicmuseum.data.Country;
import com.example.md2.magicmuseum.data.CountryList;
import java.util.ListIterator;
import android.view.View;

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

    public void activityCountry(View view) {
        Intent intent = new Intent(MuseumActivity.this, CountryActivity.class);
        startActivity(intent);
    }
}
