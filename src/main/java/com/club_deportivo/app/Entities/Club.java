package com.club_deportivo.app.Entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "clubes")
public class Club {

    @Id
    private String club_id;
    private String nombre;
    private String ciudad;
    private String pais;
    private String presidente;

    @DocumentReference
    private Entrenador entrenador;

    @DocumentReference
    private List<Jugador> jugadores;

    @DocumentReference
    private Asociacion asociacionId;

    @DocumentReference
    private List<Competicion> competicionIds;

    // Getters y Setters
    public String getClub_id() {
        return club_id;
    }

    public void setClub_id(String club_id) {
        this.club_id = club_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Asociacion getAsociacionId() {
        return asociacionId;
    }

    public void setAsociacionId(Asociacion asociacionId) {
        this.asociacionId = asociacionId;
    }

    public List<Competicion> getCompeticionIds() {
        return competicionIds;
    }

    public void setCompeticionIds(List<Competicion> competicionIds) {
        this.competicionIds = competicionIds;
    }
}
