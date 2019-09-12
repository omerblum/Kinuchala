package com.example.android.kinuchala;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

public class Dish implements Adapter {

    private String mdishName;
    private int mdishPrice;
    private int mdishPic;
    private int mquantity;

    public Dish(String dishName, int dishPrice, int Image, int quantity) {
        mdishName = dishName;
        mdishPrice = dishPrice;
        mdishPic = Image;
        mquantity = quantity;
    }

    public int getQuantity() {
        return mquantity;
    }

    public void setQuantity(int quantity) {
        mquantity = quantity;
    }

    public String getDishName() {
        return mdishName;
    }

    public void setDishName(String dishName) {
        mdishName = dishName;
    }

    public int getDishPrice() {
        return mdishPrice;
    }

    public void setDishPrice(int dishPrice) {
        mdishPrice = dishPrice;
    }

    public int getDishPic() {
        return mdishPic;
    }

    public void setDishPic(int dishPic) {
        mdishPic = dishPic;
    }

    @Override
    public void registerDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver observer) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
