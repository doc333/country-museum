package com.example.md2.magicmuseum;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

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
            Intent intent = new Intent(CountryListActivity.this, CountryListActivity.class);
            startActivity(intent);
        }
        if (id == R.id.action_museum) {
            Intent intent = new Intent(CountryListActivity.this, MuseumActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

}
