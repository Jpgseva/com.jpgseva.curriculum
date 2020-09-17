/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpgseva.curriculum.categorias;

import java.util.List;

/**
 * Clase objecto Estudio
 * @author Jorge
 */
public class Estudio {
    
    private String nombre;
    private String centro;
    private int anhoInicio;
    private int duracion;
    private String descripcion;
    private List<Aptitud> aptitudes;

    public Estudio(String nombre, String centro, int anhoInicio, int duracion, String descripcion, List<Aptitud> aptitudes) {
        this.nombre = nombre;
        this.centro = centro;
        this.anhoInicio = anhoInicio;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.aptitudes = aptitudes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCentro() {
        return centro;
    }

    public void setCentro(String centro) {
        this.centro = centro;
    }

    public int getAnhoInicio() {
        return anhoInicio;
    }

    public void setAnhoInicio(int anhoInicio) {
        this.anhoInicio = anhoInicio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Aptitud> getAptitudes() {
        return aptitudes;
    }

    public void setAptitudes(List<Aptitud> aptitudes) {
        this.aptitudes = aptitudes;
    }

    @Override
    public String toString() {
        return "Estudio{" + "nombre=" + nombre + ", centro=" + centro + ", anhoInicio=" + anhoInicio + ", duracion=" + duracion + ", descripcion=" + descripcion + ", aptitudes=" + aptitudes + '}';
    }

   
    
}
