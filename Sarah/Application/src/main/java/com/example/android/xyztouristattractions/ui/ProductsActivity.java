package com.example.android.xyztouristattractions.ui;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.android.xyztouristattractions.R;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.StreamHandler;

public class ProductsActivity extends AppCompatActivity {
    ListView list;
    public static String shopName;
    ImageView imageView;

    public void setShopName(String shop){
        if(shop != null) {
            shopName = shop;
        }
    }

    public String[] shopListName = {
            "Profi Independentei",
            "Billa Gara",
            "Lidl Canta",
            "Profi Copou",
            "Auchan Pallas Mall",
            "Kaufland Podu de Piatra",
            "Billa Alexandru",
            "Profi Alexandru"
    };

    public String[] productList = {
            "Bio",
            "Lactate",
            "Mezeluri",
            "Conserve",
            "Fainoase",
            "Bauturi",
            "Legume si Fructe"
    };

    public Integer[] productImage = {
            R.mipmap.bio,
            R.mipmap.lactate,
            R.mipmap.mezeluri,
            R.mipmap.conserve,
            R.mipmap.cereale,
            R.mipmap.bauturi,
            R.mipmap.legume
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent homeIntent = new Intent(this, ShopListActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);

        imageView = (ImageView)findViewById(R.id.imageViewProduct);

        String shop = getIntent().getDataString();
        this.setShopName(shop);
        setTitle(String.valueOf(shopName));

        /*for (int i=0; i<this.shopListName.length; i++){
            if (this.shopListName[i].equals(shopName)){
                //aici luam din baza de date stocul disponibil
                break;
            }
        }*/
        if(String.valueOf(shopName).equals(this.shopListName[0])){
            imageView.setImageResource(R.mipmap.profi);
        }
        else if(String.valueOf(shopName).equals(this.shopListName[1])){
            imageView.setImageResource(R.mipmap.billa);
        }
        else if(String.valueOf(shopName).equals(this.shopListName[2])){
            imageView.setImageResource(R.mipmap.lidl);
        }
        else if(String.valueOf(shopName).equals(this.shopListName[3])){
            imageView.setImageResource(R.mipmap.profi);
        }
        else if(String.valueOf(shopName).equals(this.shopListName[4])){
            imageView.setImageResource(R.mipmap.auchan);
        }
        else if(String.valueOf(shopName).equals(this.shopListName[5])){
            imageView.setImageResource(R.mipmap.kaufland);
        }
        else if(String.valueOf(shopName).equals(this.shopListName[6])){
            imageView.setImageResource(R.mipmap.billa);
        }
        else if(String.valueOf(shopName).equals(this.shopListName[7])){
            imageView.setImageResource(R.mipmap.profi);
        }

        //Product list
        ProductAdapter adapter = new
                ProductAdapter(ProductsActivity.this, productList, productImage);
        list=(ListView)findViewById(R.id.listViewProduct);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(ProductsActivity.this, "You Clicked at " + productList[+ position], Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext() ,ProductListActivity.class);
                intent.setData(Uri.parse(productList[+ position]));
                startActivity(intent);
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

