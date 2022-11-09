package com.example.streaming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3, et4;
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Peliculas> peliculas = new ArrayList<>();
        peliculas.add(new Peliculas("1. La Huerfana-El Origen", 10, "Terror", 2022, "La madre de la niña que trataba\n de ocultar que fue asesinada", R.drawable.img1));
        peliculas.add(new Peliculas("2.El hombre de Acero", 12, "Accion", 2016, "Un niño llamado Kaleb fue\n enviado a la tierra para salvar su planeta", R.drawable.img1));
        peliculas.add(new Peliculas("3. Ataque a los titanes", 13, "Drama", 2018, "Inicia con la destruccion del muro del pueblo\n que fueron bases de gigantes",R.drawable.img1));
        peliculas.add(new Peliculas("4. Megaboa", 12, "Terror", 2020, "Unos jovenes que viajan a Colombia\n les surge algo inesperado en el bosque",R.drawable.img1));
        peliculas.add(new Peliculas("5. Shang-Chi", 11, "Accion" , 2020, "Se desarrolla en china donde un rey\n que poseia anillos para gobernar la antigua china",R.drawable.img1));

        PeliculasAdapter adapter = new PeliculasAdapter(peliculas,this);
        RecyclerView recyclerView = findViewById(R.id.recyclerPeliculas);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        et1 = findViewById(R.id.etUsername);
        et2 = findViewById(R.id.etPassword);
        et3 = findViewById(R.id.etCorreo);
        et4 = findViewById(R.id.etTarjeta);
        btn1 = findViewById(R.id.btnLogin);
        btn2 = findViewById(R.id.btnRegistrarse);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = et1.getText().toString();
                Intent ob1 = new Intent(MainActivity.this, catalogo.class);
                ob1.putExtra("username", username);
                startActivity(ob1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ob1 = new Intent(MainActivity.this, registro.class);
                startActivity(ob1);
            }
        });

    }
}