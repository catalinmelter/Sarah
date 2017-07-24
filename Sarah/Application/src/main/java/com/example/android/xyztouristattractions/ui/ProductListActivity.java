package com.example.android.xyztouristattractions.ui;

import android.content.Intent;
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

public class ProductListActivity extends AppCompatActivity {
    ListView list;
    ProductsAdapter adapter;

    public String[] productList = {
            "Bio",
            "Lactate",
            "Mezeluri",
            "Conserve",
            "Fainoase",
            "Bauturi",
            "Legume si Fructe"
    };

    public String[] bio = {
            "9.89 RON",
            "7.94 RON",
            "1.92 RON",
            "13.29 RON",
            "7.99"
    };
    public String[] bioPrice = {
            "Seminte de chia 150g Sano Vita",
            "Zahar nuca de cocos 300g Passiflora",
            "Seminte de in 125g Sano Vita",
            "Naut bio 370ml Nutrisslim",
            "Orez bio 500g Scotti"
    };
    public Integer[] bioImage = {
            R.mipmap.bioseminte,
            R.mipmap.biococonut,
            R.mipmap.biosemintevita,
            R.mipmap.bionaut,
            R.mipmap.bioorez
    };

    public String[] lactate = {
            "8.39 RON",
            "6.5 RON",
            "16.99 RON",
            "26.64 RON",
            "4.28 RON"
    };
    public String[] lactatePrice = {
            "Lapte 3.5% 1.8l Zuzu",
            "Lapte 1.5% 1l LaDorna",
            "Cascaval Sofia 450g Delaco",
            "Branza Parmigiano 200g Zanetti",
            "Telemea de vaca 14% 150g Hochland"
    };
    public Integer[] lactateImage = {
            R.mipmap.lactatezuzu,
            R.mipmap.lactatedorna,
            R.mipmap.lactatedelaco,
            R.mipmap.lactatezaneti,
            R.mipmap.lactatetelemea
    };

    public String[] mezeluri = {
            "12.99 RON",
            "8.29 RON",
            "10.79 RON",
            "9.99 RON",
            "7.79 RON",
            "90.99 RON"
    };
    public String[] mezeluriPrice = {
            "Carne tocata de porc",
            "Carnati Cabanos 330g Caroli",
            "Carnati de bere 400g Caroli",
            "Carnati 300g Poiana Marului",
            "Carne de pui grill kg 365",
            "Carne de manzat Cris Vest"
    };
    public Integer[] mezeluriImage = {
            R.mipmap.mezcarnetocata,
            R.mipmap.mezcaroli,
            R.mipmap.mezcarolibere,
            R.mipmap.mezpoiana,
            R.mipmap.mezpui,
            R.mipmap.mezmanzat
    };

    public String[] conserve = {
            "2.59 RON",
            "3.99 RON",
            "4.91 RON",
            "8.29 RON",
            "9.80 RON"
    };
    public String[] conservePrice = {
            "Ciuperci taiate 360g 365",
            "Fasole verde 720ml 365",
            "Mazare 400g Bonduelle",
            "Carne de curcan 300g Bucegi",
            "Carne Premium de porc 300g Hame"
    };
    public Integer[] conserveImage = {
            R.mipmap.conciuperci,
            R.mipmap.confasole,
            R.mipmap.conmazare,
            R.mipmap.concurcan,
            R.mipmap.conporc
    };

    public String[] fainoase = {
            "1.59 RON",
            "4.92 RON",
            "2.99 RON",
            "5.99 RON",
            "2.79 RON"
    };
    public String[] fainoasePrice = {
            "Faina tip 650 1kg Overseas",
            "Faina de secara macinis integral 1kg Dobrogea",
            "Orez cu bob lung 1kg Rizbo",
            "Fusilli tricolore 500g Delhaize",
            "Spaghete 500g Pambac"
    };
    public Integer[] fainoaseImage = {
            R.mipmap.faifaina1,
            R.mipmap.faisecara,
            R.mipmap.faiorez,
            R.mipmap.faifusilli,
            R.mipmap.faispaghetti
    };

    public String[] bauturi = {
            "1.92 RON",
            "108.99 RON",
            "6.59 RON",
            "35.00 RON",
            "5.43 RON",
            "4,66 RON"
    };
    public String[] bauturiPrice = {
            "Apa minerala plata 0.7l Bucovina",
            "Whisky Old No.7 1l Jack Daniel's",
            "Bere Extra 0.355l Corona",
            "Vin rosu Cabernet Sauvignon 0.75l Purcari",
            "2.5l Coca-Cola",
            "Energizant 0.25l Red Bull"
    };
    public Integer[] bauturiImage = {
            R.mipmap.bauapa,
            R.mipmap.bauwhisky,
            R.mipmap.baucorona,
            R.mipmap.bauvin,
            R.mipmap.baucola,
            R.mipmap.bauredbull
    };

    public String[] fructelegume = {
            "3.49 RON",
            "4.59 RON/KG",
            "10.99 RON.KG",
            "1.49 RON/KG",
            "7.49 RON"
    };
    public String[] fructelegumePrice = {
            "Avocado (bucata)",
            "Banane kg (vrac)",
            "Limes kg (vrac)",
            "Ceapa galbena kg (vrac)",
            "Cartofi dulci kg (vrac)"
    };
    public Integer[] fructelegumeImage = {
            R.mipmap.frucavocado,
            R.mipmap.frucbanane,
            R.mipmap.fruclimes,
            R.mipmap.legceapa,
            R.mipmap.legcartofi
    };

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent homeIntent = new Intent(this, ProductsActivity.class);
                homeIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        String product = getIntent().getDataString();
        setTitle(String.valueOf(product));

        //Product list
        if(String.valueOf(product).equals(this.productList[0])){
            adapter = new ProductsAdapter(ProductListActivity.this, bio, bioPrice, bioImage);
            list=(ListView)findViewById(R.id.listViewProductList);
            list.setAdapter(adapter);
        }
        else if(String.valueOf(product).equals(this.productList[1])){
            adapter = new ProductsAdapter(ProductListActivity.this, lactate, lactatePrice, lactateImage);
            list=(ListView)findViewById(R.id.listViewProductList);
            list.setAdapter(adapter);
        }
        else if(String.valueOf(product).equals(this.productList[2])){
            adapter = new ProductsAdapter(ProductListActivity.this, mezeluri, mezeluriPrice, mezeluriImage);
            list=(ListView)findViewById(R.id.listViewProductList);
            list.setAdapter(adapter);
        }
        else if(String.valueOf(product).equals(this.productList[3])){
            adapter = new ProductsAdapter(ProductListActivity.this, conserve, conservePrice, conserveImage);
            list=(ListView)findViewById(R.id.listViewProductList);
            list.setAdapter(adapter);
        }
        else if(String.valueOf(product).equals(this.productList[4])){
            adapter = new ProductsAdapter(ProductListActivity.this, fainoase, fainoasePrice, fainoaseImage);
            list=(ListView)findViewById(R.id.listViewProductList);
            list.setAdapter(adapter);
        }
        else if(String.valueOf(product).equals(this.productList[5])){
            adapter = new ProductsAdapter(ProductListActivity.this, bauturi, bauturiPrice, bauturiImage);
            list=(ListView)findViewById(R.id.listViewProductList);
            list.setAdapter(adapter);
        }
        else if(String.valueOf(product).equals(this.productList[6])){
            adapter = new ProductsAdapter(ProductListActivity.this, fructelegume, fructelegumePrice, fructelegumeImage);
            list=(ListView)findViewById(R.id.listViewProductList);
            list.setAdapter(adapter);
        }

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

