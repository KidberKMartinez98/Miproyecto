package com.example.streaming;

public class Peliculas {
    private String Nombrepelicula;
    private int precio;
    private String genero;
    private int año;
    private String descripcion;
    private int poster;

    public Peliculas(String nombrepelicula, int precio, String genero, int año, String descripcion, int poster) {
        Nombrepelicula = nombrepelicula;
        this.precio = precio;
        this.genero = genero;
        this.año = año;
        this.descripcion = descripcion;
        this.poster = poster;
    }

    public String getNombrepelicula() {
        return Nombrepelicula;
    }

    public void setNombrepelicula(String nombrepelicula) {
        Nombrepelicula = nombrepelicula;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPoster() {
        return poster;
    }

    public void setPoster(int poster) {
        this.poster = poster;
    }
}




