package com.example.android.kinuchala;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Deserts Intent
        TextView deserts = (TextView) findViewById(R.id.deserts_text_view);
        deserts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent desertIntent = new Intent(MainActivity.this, DesertsActivity.class);
                startActivity(desertIntent);
            }
        });

        //Bakery Intent
        TextView bakes = (TextView) findViewById(R.id.bakes_text_view);
        bakes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bakesIntent = new Intent(MainActivity.this, BakesActivity.class);
                startActivity(bakesIntent);
            }
        });


    }
}
