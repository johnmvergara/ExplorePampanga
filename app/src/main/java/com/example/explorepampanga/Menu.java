package com.example.explorepampanga;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void goTourist(View v){
        Intent i = new Intent(this, TouristSpots.class);
        startActivity(i);
        Toast.makeText(this, "Tourist Spots", Toast.LENGTH_LONG).show();
    }

    public void goDelicacies(View v){
        Intent i = new Intent(this, delicacies.class);
        startActivity(i);
        Toast.makeText(this, "Delicacies", Toast.LENGTH_LONG).show();
    }
}
