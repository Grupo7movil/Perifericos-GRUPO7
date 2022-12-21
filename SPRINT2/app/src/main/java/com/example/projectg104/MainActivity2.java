package com.example.projectg104;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.widget.ListView;


import com.example.projectg104.Adapters.ProductAdapter;
import com.example.projectg104.Entities.Product;


import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ListView listViewProducts;
    private ProductAdapter productAdapter;
    private ArrayList<Product> arrayProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listViewProducts = (ListView) findViewById(R.id.listViewProducts);
        arrayProducts = new ArrayList<>();

        Product product1 = new Product(R.drawable.audifonos, "Audifonos", "Sonido Envolvente", 80000);
        Product product2 = new Product(R.drawable.monitor, "Monitor", "FULL HD", 180000);
        Product product3 = new Product(R.drawable.teclado, "Teclado", "Mecánico RBG", 120000);

        arrayProducts.add(product1);
        arrayProducts.add(product2);
        arrayProducts.add(product3);

        productAdapter = new ProductAdapter(this, arrayProducts);
        listViewProducts.setAdapter(productAdapter);
    }
}