package com.example.android.kinuchala;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BakesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bakes_activity);

        final ArrayList<Dish> bakes = new ArrayList<Dish>();
        bakes.add(new Dish("Bread", 15, R.drawable.bread, 0));


        DishAdapter adapter = new DishAdapter(this, bakes);
        final ListView listView = (ListView) findViewById(R.id.bakes_list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                bakes.get(position).setQuantity(bakes.get(position).getQuantity()+1);
                TextView quantity = (TextView) view.findViewById(R.id.quantity);
                quantity.setText(String.valueOf(bakes.get(position).getQuantity()));
            }
        });


    }
}
