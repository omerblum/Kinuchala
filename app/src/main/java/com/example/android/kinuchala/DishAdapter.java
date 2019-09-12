package com.example.android.kinuchala;

import android.app.Activity;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class DishAdapter extends ArrayAdapter<Dish> {
    public DishAdapter(Activity context, ArrayList<Dish> dishes){
        super(context, 0, dishes);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_layout, parent, false);

        }
        final Dish currenDish = getItem(position);

        TextView dishName = (TextView) listItemView.findViewById(R.id.dishName);
        dishName.setText(currenDish.getDishName());

        TextView dishPrice = (TextView) listItemView.findViewById(R.id.dishPrice);
        dishPrice.setText(String.valueOf(currenDish.getDishPrice()));

        ImageView image = (ImageView) listItemView.findViewById(R.id.dishPic);
        image.setImageResource(currenDish.getDishPic());
        image.setVisibility(View.VISIBLE);

        TextView quantity = (TextView) listItemView.findViewById(R.id.quantity);
        quantity.setText(String.valueOf(currenDish.getQuantity()));

        return listItemView;
    }
}
