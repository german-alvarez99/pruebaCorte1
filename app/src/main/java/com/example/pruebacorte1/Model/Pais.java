package com.example.pruebacorte1.Model;

public class Pais {
    private String nombre;
    private String codBand;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodBand() {
        return codBand;
    }

    public void setCodBand(String codBand) {
        this.codBand = codBand;
    }

    public Pais(String nombre, String codBand) {
        this.nombre = nombre;
        this.codBand = codBand;
    }
}
