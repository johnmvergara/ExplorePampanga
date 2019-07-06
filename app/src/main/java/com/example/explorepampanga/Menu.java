package com.example.explorepampanga;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends Activity {

    TextView txtGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        txtGreeting = findViewById(R.id.tvGreeting);
        Intent intent = getIntent();
        String str = intent.getStringExtra("person");
        txtGreeting.setText("Welcome, " + str);
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

    public void goHistory(View v){
        Intent i = new Intent(this, History.class);
        startActivity(i);
        Toast.makeText(this, "History", Toast.LENGTH_LONG).show();
    }

    public void goDirectory(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://lga.gov.ph/province/info/pampanga"));
        startActivity(i);
        Toast.makeText(this, "Directory", Toast.LENGTH_LONG).show();
    }
}
