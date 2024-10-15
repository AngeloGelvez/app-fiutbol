package com.club_deportivo.app.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "entrenador")
public class Entrenador {

    @Id
    private String entrenador_id;
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;

    // Constructor vacío
    public Entrenador() {
    }

    // Constructor con parámetros
    public Entrenador(String entrenador_id, String nombre, String apellido, int edad, String nacionalidad) {
        this.entrenador_id = entrenador_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    // Getters y Setters
    public String getEntrenador_id() {
        return entrenador_id;
    }

    public void setEntrenador_id(String entrenador_id) {
        this.entrenador_id = entrenador_id;
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
}
