package com.example.splash_nata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn1).setOnClickListener(this);
        findViewById(R.id.btnregistro).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btn1:
                Intent intent = new Intent(
                        MainActivity.this,pantallaprincipal.class);
                startActivity(intent);
                Toast.makeText(this,"Inicio de Sesion", Toast.LENGTH_SHORT).show();
                break;

            case R.id.btnregistro:
                Intent intent1 = new Intent(
                        MainActivity.this,Registro.class);
                startActivity(intent1);
                Toast.makeText(this,"Registrate ", Toast.LENGTH_SHORT).show();
                break;
            case R.id.botton4:
                Intent intent2 = new Intent(
                        MainActivity.this,Activity_scroll.class);
                startActivity(intent2);
                Toast.makeText(this,"Inicio de Sesion", Toast.LENGTH_SHORT).show();
                break;


        }
        }
    }

