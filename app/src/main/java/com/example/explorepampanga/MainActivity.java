package com.example.explorepampanga;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtName = findViewById(R.id.etName);
    }

    public void goProceed(View v){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
        Toast.makeText(this, "Going to Menu", Toast.LENGTH_LONG).show();
        String name = txtName.getText().toString();
        i.putExtra("person", name);
        startActivity(i);
    }
}
