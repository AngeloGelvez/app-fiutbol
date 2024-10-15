package com.club_deportivo.app.Entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "asociaciones")
public class Asociacion {
    @Id
    private String asociacion_id;
    private String nombre;
    private String presidente;
    private String pais;
    private String siglas;

    //Constructores
    public Asociacion() {
    }

    public Asociacion(String asociacion_id, String nombre, String presidente, String pais, String siglas) {
        this.asociacion_id = asociacion_id;
        this.nombre = nombre;
        this.presidente = presidente;
        this.pais = pais;
        this.siglas = siglas;
    }

    //Getters and Setters

    public String getAsociacion_id() {
        return asociacion_id;
    }

    public void setAsociacion_id(String asociacion_id) {
        this.asociacion_id = asociacion_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
}
