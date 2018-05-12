package com.cidenet.json;

public class Persona {

    private String nombre;
    private int id;
    private String carrera;
    private String barrio;
    private int edad;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getCiudadania() {
        return ciudadania;
    }

    public void setCiudadania(String ciudadania) {
        this.ciudadania = ciudadania;
    }

    private String ciudadania;

    public Persona(String nombre, int id, String carrera, String barrio, String ciudadania, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.carrera = carrera;
        this.barrio = barrio;
        this.ciudadania = ciudadania;
        this.edad = edad;
    }
}
