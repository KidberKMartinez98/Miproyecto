package com.example.streaming;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeliculasAdapter extends RecyclerView.Adapter<PeliculasAdapter.ViewHolder> {
    List<Peliculas> datos;
    Context context;
    LayoutInflater layoutInflater;

    public PeliculasAdapter(List<Peliculas> datos, Context context) {
        this.datos = datos;
        this.layoutInflater = LayoutInflater.from(context);
        this.context = context;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = layoutInflater.inflate(R.layout.activity_catalogo, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.juntardatos(datos.get(position));
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView Pelicula, Precio, Genero, Año2, Descripcion;
        ImageView Poster;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            Pelicula = itemView.findViewById(R.id.tvPelicula);
            Precio = itemView.findViewById(R.id.tvPrecio);
            Genero = itemView.findViewById(R.id.tvGenero);
            Año2 = itemView.findViewById(R.id.tvAño2);
            Descripcion = itemView.findViewById(R.id.tvDescripcion);
            Poster = itemView.findViewById(R.id.ivPelicula);
        }

        public void juntardatos(Peliculas pelicula) {
            String titulo = pelicula.getNombrepelicula();
            Pelicula.setText(titulo);
            Precio.setText("S/."+String.valueOf(pelicula.getPrecio()));
            Genero.setText(pelicula.getGenero());
            Año2.setText(pelicula.getAño());
            Descripcion.setText(pelicula.getDescripcion());
            Poster.setImageResource(pelicula.getPoster());
        }
    }
}
