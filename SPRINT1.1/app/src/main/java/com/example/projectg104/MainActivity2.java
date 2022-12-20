package com.example.projectg104;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private Button btnAudifonos, btnMonitor, btnTeclado;
    private TextView textAudifonos, textMonitor, textTeclado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnAudifonos = (Button) findViewById(R.id.btnAudifonos);
        btnMonitor = (Button) findViewById(R.id.btnMonitor);
        btnTeclado = (Button) findViewById(R.id.btnTeclado);

        textAudifonos = (TextView) findViewById(R.id.textAudifonos);
        textMonitor = (TextView) findViewById(R.id.textMonitor);
        textTeclado = (TextView) findViewById(R.id.textTeclado);

        btnAudifonos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                intent.putExtra("title", textAudifonos.getText().toString());
                intent.putExtra("description", "Calidad-Precio");
                intent.putExtra("imageCode",R.drawable.audifonos);
                startActivity(intent);
            }
        });

        btnMonitor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                intent.putExtra("title", textMonitor.getText().toString());
                intent.putExtra("description", "Calidad-Precio");
                intent.putExtra("imageCode",R.drawable.monitor);
                startActivity(intent);
            }
        });

        btnTeclado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                intent.putExtra("title", textTeclado.getText().toString());
                intent.putExtra("description", "Calidad-Precio");
                intent.putExtra("imageCode",R.drawable.teclado);
                startActivity(intent);
            }
        });
    }
}