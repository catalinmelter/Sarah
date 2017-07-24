package com.example.android.xyztouristattractions.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.xyztouristattractions.R;

public class ProductsAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    private final String[] price;

    public ProductsAdapter(Activity context,
                          String[] web, String[] price, Integer[] imageId) {
        super(context, R.layout.product_list, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;
        this.price = price;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.products_list, null, true);

        TextView txtTitle = (TextView) rowView.findViewById(R.id.textProduct);
        TextView txtPrice = (TextView) rowView.findViewById(R.id.textProductPrice);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageProduct);

        txtTitle.setText(web[position]);
        txtPrice.setText(price[position]);
        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}