package com.club_deportivo.app.Entities;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "jugadores")
public class Jugador {
    @Id
    private String jugador_id;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private int dorsal;
    private String posicion;

    public Jugador() {
    }

    public Jugador(String jugador_id, String nombre, String apellido, int edad, String nacionalidad, int dorsal, String posicion) {
        this.jugador_id = jugador_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public String getJugador_id() {
        return jugador_id;
    }

    public void setJugador_id(String jugador_id) {
        this.jugador_id = jugador_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
