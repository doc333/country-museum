package com.example.md2.magicmuseum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by admin on 04/08/2015.
 */
public class MuseumActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museum);
    }

    public void activityCountry(View view) {
        Intent intent = new Intent(MuseumActivity.this, CountryActivity.class);
        startActivity(intent);
    }
}
