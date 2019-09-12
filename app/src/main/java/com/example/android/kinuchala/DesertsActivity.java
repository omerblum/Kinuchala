package com.example.android.kinuchala;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DesertsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deserts_activity);

        final ArrayList<Dish> dishes = new ArrayList<Dish>();
        dishes.add(new Dish("Number Cake",180, R.drawable.cake_number, 0));
        dishes.add(new Dish("Ear of Haman", 40, R.drawable.ozen_haman, 0));
        dishes.add(new Dish("Alphachores", 35, R.drawable.alphachores, 0));
        dishes.add(new Dish("Snow Cookies", 35, R.drawable.snow_cookies, 0));



        DishAdapter adapter = new DishAdapter(this, dishes);
        final ListView listView = (ListView) findViewById(R.id.deserts_list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                dishes.set(position, new Dish(dishes.get(position).getDishName(),
                        dishes.get(position).getDishPrice(), dishes.get(position).getDishPic(),
                        dishes.get(position).getQuantity()+1));
                TextView quantity = (TextView) view.findViewById(R.id.quantity);
                quantity.setText(String.valueOf(dishes.get(position).getQuantity()));

            }
        });
    }
}
