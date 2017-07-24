/*
 * Copyright 2015 Google Inc. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.xyztouristattractions.ui;

import android.Manifest;
import android.app.TaskStackBuilder;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.NavUtils;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.android.xyztouristattractions.R;
import com.example.android.xyztouristattractions.common.Shop;
import com.example.android.xyztouristattractions.common.Constants;
import com.example.android.xyztouristattractions.common.Utils;
import com.google.android.gms.maps.model.LatLng;

import java.util.List;
import java.util.Map;

import static com.example.android.xyztouristattractions.provider.Shops.SHOPS;

/**
 * The shop detail fragment which contains the details of a
 * a single shop (contained inside
 * {@link com.example.android.xyztouristattractions.ui.DetailActivity}).
 */
public class DetailFragment extends Fragment {

    private static final String EXTRA_SHOP = "shop";
    private Shop mShop;

    public static DetailFragment createInstance(String shopName) {
        DetailFragment detailFragment = new DetailFragment();
        Bundle bundle = new Bundle();
        bundle.putString(EXTRA_SHOP, shopName);
        detailFragment.setArguments(bundle);
        return detailFragment;
    }

    public DetailFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        View view = inflater.inflate(R.layout.fragment_detail, container, false);
        final String shopName = getArguments().getString(EXTRA_SHOP);
        mShop = findShop(shopName);

        if (mShop == null) {
            getActivity().finish();
            return null;
        }

        TextView nameTextView = (TextView) view.findViewById(R.id.nameTextView);
        TextView descTextView = (TextView) view.findViewById(R.id.descriptionTextView);
        TextView distanceTextView = (TextView) view.findViewById(R.id.distanceTextView);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
        FloatingActionButton mapFab = (FloatingActionButton) view.findViewById(R.id.mapFab);
        FloatingActionButton mapFab2 = (FloatingActionButton) view.findViewById(R.id.mapFab2);
        FloatingActionButton mapFab3 = (FloatingActionButton) view.findViewById(R.id.mapFab3);

        LatLng location = Utils.getLocation(getActivity());
        String distance = Utils.formatDistanceBetween(location, mShop.location);
        if (TextUtils.isEmpty(distance)) {
            distanceTextView.setVisibility(View.GONE);
        }

        nameTextView.setText(shopName);
        distanceTextView.setText(distance);
        descTextView.setText(mShop.longDescription);

        int imageSize = getResources().getDimensionPixelSize(R.dimen.image_size)
                * Constants.IMAGE_ANIM_MULTIPLIER;
        Glide.with(getActivity())
                .load(mShop.imageUrl)
                .diskCacheStrategy(DiskCacheStrategy.SOURCE)
                .placeholder(R.color.lighter_gray)
                .override(imageSize, imageSize)
                .into(imageView);

        mapFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(Constants.MAPS_INTENT_URI +
                        Uri.encode(mShop.name + ", " + mShop.street + ", " + mShop.city)));
                startActivity(intent);
            }
        });

        mapFab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ProductsActivity.class);
                intent.setData(Uri.parse(mShop.name));
                startActivity(intent);
            }
        });

        mapFab3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String phoneNo = mShop.phoneNo;
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + phoneNo));
                    startActivity(intent);
                }
                catch (Exception e){
                    askPermission();
                }
            }
        });
        return view;
    }

    public void askPermission(){
        int MY_PERMISSIONS_REQUEST_MAKE_CALLS=0;
        if (ContextCompat.checkSelfPermission(getContext(),
                Manifest.permission.CALL_PHONE)
                != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                    Manifest.permission.CALL_PHONE)) {

                // Show an expanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.

            } else {

                // No explanation needed, we can request the permission.

                ActivityCompat.requestPermissions(getActivity(),
                        new String[]{Manifest.permission.CALL_PHONE},
                        MY_PERMISSIONS_REQUEST_MAKE_CALLS);

                // MY_PERMISSIONS_REQUEST_READ_CONTACTS is an
                // app-defined int constant. The callback method gets the
                // result of the request.
            }
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                // Some small additions to handle "up" navigation correctly
                Intent upIntent = NavUtils.getParentActivityIntent(getActivity());
                upIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                // Check if up activity needs to be created (usually when
                // detail screen is opened from a notification or from the
                // Wearable app
                if (NavUtils.shouldUpRecreateTask(getActivity(), upIntent)
                        || getActivity().isTaskRoot()) {

                    // Synthesize parent stack
                    TaskStackBuilder.create(getActivity())
                            .addNextIntentWithParentStack(upIntent)
                            .startActivities();
                }

                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    // On Lollipop+ we finish so to run the nice animation
                    getActivity().finishAfterTransition();
                    return true;
                }

                // Otherwise let the system handle navigating "up"
                return false;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * Really hacky loop for finding shop in our static content provider.
     * Obviously would not be used in a production app.
     */
    private Shop findShop(String shopName) {
        for (Map.Entry<String, List<Shop>> shopsList : SHOPS.entrySet()) {
            List<Shop> shops = shopsList.getValue();
            for (Shop shop : shops) {
                if (shopName.equals(shop.name)) {
                    return shop;
                }
            }
        }
        return null;
    }
}
