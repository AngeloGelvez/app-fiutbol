package com.club_deportivo.app.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "competicion")
public class Competicion {

    @Id
    private String competicion_id;  // MongoDB usa String para los identificadores.

    private String nombre;
    private int monto_premio;
    private String pais;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    // Constructor vacío
    public Competicion() {
    }

    // Constructor con parámetros
    public Competicion(String competicion_id, String nombre, int monto_premio, String pais, LocalDate fechaInicio, LocalDate fechaFin) {
        this.competicion_id = competicion_id;
        this.nombre = nombre;
        this.monto_premio = monto_premio;
        this.pais = pais;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    // Getters y Setters
    public String getCompeticion_id() {
        return competicion_id;
    }

    public void setCompeticion_id(String competicion_id) {
        this.competicion_id = competicion_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto_premio() {
        return monto_premio;
    }

    public void setMonto_premio(int monto_premio) {
        this.monto_premio = monto_premio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }
}
