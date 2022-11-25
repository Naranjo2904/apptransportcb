package com.example.splash_nata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Activity_scroll extends AppCompatActivity {

    private RecyclerView recycler;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager lManager;
    ApiService cliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        cliente = ApiAdapter.getApiService();
        List items = new ArrayList();

        Call<List<Object>> rutas = cliente.rutasapi();
        rutas.enqueue(new Callback<List<Object>>() {
            @Override
            public void onResponse(Call<List<Object>> call, Response<List<Object>> response) {
                items.add(new Anime(R.drawable.paradero, "Rutas", 230));

                System.out.println(response.body());
                Toast.makeText(Activity_scroll.this, response.body().toString(),Toast.LENGTH_LONG).show();




            }

            @Override
            public void onFailure(Call<List<Object>> call, Throwable t) {
                System.out.println("error: " + t.getMessage());

            }
        });




        items.add(new Anime(R.drawable.paradero, "Rutas", 230));
        items.add(new Anime(R.drawable.ubicacion, "Paraderos", 456));
        items.add(new Anime(R.drawable.intermunicipal1, "Ubicacion", 3));
        items.add(new Anime(R.drawable.conductor, "conductor",5154));

// Obtener el Recycler
        recycler = (RecyclerView) findViewById(R.id.reciclador2);
        recycler.setHasFixedSize(true);
// Usar un administrador para LinearLayout
        lManager = new LinearLayoutManager(this);
        recycler.setLayoutManager(lManager);
// Crear un nuevo adaptador adapter =
        adapter = new AnimeAdapter(items);
        recycler.setAdapter(adapter);
    }
}