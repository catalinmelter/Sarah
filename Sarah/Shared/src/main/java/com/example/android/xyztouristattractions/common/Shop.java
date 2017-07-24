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

package com.example.android.xyztouristattractions.common;

import android.graphics.Bitmap;
import android.net.Uri;

import com.google.android.gms.maps.model.LatLng;

/**
 * A simple shared tourist attraction class to easily pass data around. Used
 * in both the mobile app and wearable app.
 */
public class Shop {
    public String name;
    public String street;
    public String description;
    public String longDescription;
    public int imageUrl;
    public int secondaryImageUrl;
    public LatLng location;
    public String city;
    public String phoneNo;

    public String distance;

    public Shop() {}

    public Shop(String name, String street, String description, String longDescription, String phoneNo, int imageUrl, int secondaryImageUrl, LatLng location, String city) {
        this.name = name;
        this.street = street;
        this.description = description;
        this.longDescription = longDescription;
        this.imageUrl = imageUrl;
        this.secondaryImageUrl = secondaryImageUrl;
        this.location = location;
        this.city = city;
        this.phoneNo = phoneNo;
    }
}