package com.example.andreyko0.myapplication;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.RandomAccess;
import java.util.SortedMap;
import java.util.UUID;

/**
 * Created by Andreyko0 on 30/09/2017.
 */

public class ProductStorage {
    static Map<String, SendableProduct> storage = new LinkedHashMap<>();
    private static Random random = new Random();

    public static void addProduct(SendableProduct p) {
        String id = UUID.randomUUID().toString();
        p.setId(id);
        storage.put(id, p);
    }

    public static SendableProduct getProduct(String id) {
        return storage.get(id);
    }

    public static ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        for(SendableProduct sp: storage.values()) {
            products.add(sp.toProduct());
        }
        return products;
    }
}
