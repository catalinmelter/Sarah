package com.example.android.xyztouristattractions.ui;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.android.xyztouristattractions.R;

public class ProductAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final String[] web;
    private final Integer[] imageId;
    public ProductAdapter(Activity context,
                      String[] web, Integer[] imageId) {
        super(context, R.layout.product_list, web);
        this.context = context;
        this.web = web;
        this.imageId = imageId;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.product_list, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.textProduct);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.imageProduct);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        return rowView;
    }
}