package com.example.splash_nata;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import android.widget.Toolbar;

public class pantallaprincipal extends AppCompatActivity {
    Button btnruta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantallaprincipal);
        btnruta = findViewById(R.id.button2);
        btnruta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent
                        (pantallaprincipal.this, Activity_scroll.class);

                startActivity(intent2);



            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {


            case R.id.item3:
                Toast.makeText(this, "seleccionar Servicios", Toast.LENGTH_SHORT).show();

            case R.id.item5:
                Toast.makeText(this, "seleccionar Cerrar Sesion", Toast.LENGTH_SHORT).show();

            case R.id.item6:
                Intent intent1 = new Intent(pantallaprincipal.this, map_activity.class);
                startActivity(intent1);
                Toast.makeText(this, "seleccionar Cerrar Sesion", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }




}

