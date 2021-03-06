package com.example.md2.magicmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
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
    // Current index of the country array
    private int currentCountryIndex = 0;
    // Current index of the country object
    private int countryClickId = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
        countries = new CountryList();
        setCouloir();

    }

    public void cleanCouloir()
    {
        int i = 0;
        while(i < 3)
        {
            i++;
            ImageView image = (ImageView) findViewById(this.getResources().getIdentifier("imageView" + i, "id", this.getPackageName()));
            image.setImageResource(android.R.color.transparent);
        }
    }

    public void setButtons()
    {
        ImageButton up = (ImageButton) findViewById(R.id.flecheHaut);
        ImageButton down = (ImageButton) findViewById(R.id.flecheBas);

        if(hasNextCountry()){
            up.setVisibility(View.VISIBLE);
        }
        else{
            up.setVisibility(View.INVISIBLE);
        }

        if(hasPreviousCountry()){
            down.setVisibility(View.VISIBLE);
        }
        else{
            down.setVisibility(View.INVISIBLE);
        }

    }

    public void setCouloir()
    {
        ListIterator<Country> iterator = countries.getCountryList().listIterator(currentCountryIndex);
        cleanCouloir();
        setButtons();
        int i = 0;
        countryClickId = iterator.next().getId();
        iterator.previous();
        while(i < 3 && iterator.hasNext())
        {
            i++;
            Country c = iterator.next();
            countries.getCountryList().iterator().next();
            int countryId = c.getId();
            ImageView image = (ImageView) findViewById(this.getResources().getIdentifier("imageView" + i, "id", this.getPackageName()));

            String size = "";
            switch (i) {
                case 1:
                    size = "big";
                    break;
                case 2:
                    size = "medium";
                    break;
                default:
                    size = "small";
                    break;
            }

            image.setImageResource(this.getResources().getIdentifier(size + "_" + countryId, "mipmap", this.getPackageName()));
        }
    }

    public boolean hasNextCountry()
    {
        return currentCountryIndex < countries.getCountryList().size() - 1;
    }

    public boolean hasPreviousCountry()
    {
        return currentCountryIndex > 0;
    }

    public void nextCountry(View view)
    {
        if(hasNextCountry()) {
            currentCountryIndex++;
            countryClickId = countries.getCountryList().get(currentCountryIndex).getId();
        }
        setCouloir();
    }

    public void previousCountry(View view)
    {
        if(hasPreviousCountry()) {
            currentCountryIndex--;
            countryClickId = countries.getCountryList().get(currentCountryIndex).getId();
        }
        setCouloir();
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
            Intent intent = new Intent(MuseumActivity.this, CountryListActivity.class);
            startActivity(intent);
        }
        if (id == R.id.action_museum) {
            Intent intent = new Intent(MuseumActivity.this, MuseumActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    public void activityCountry(View view) {
        // On click on a country flag run activity to see the country description
        Intent intent = new Intent(MuseumActivity.this, CountryActivity.class);
        // Send the id to the activity
        intent.putExtra("countryId", countryClickId);
        startActivity(intent);
    }
}
