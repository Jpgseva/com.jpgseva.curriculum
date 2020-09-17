/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpgseva.curriculum.categorias;

import java.util.List;

/**
 * Clase objecto trabajo
 * @author Jorge
 */
public class Trabajo {
    
    private String puesto;
    private String empresa;
    private int anhoInicio;
    private int duracion;
    private String descripcion;
    private List<Aptitud> aptitudes;

    public Trabajo(String puesto, String empresa, int anhoInicio, int duracion, String descripcion, List<Aptitud> aptitudes) {
        this.puesto = puesto;
        this.empresa = empresa;
        this.anhoInicio = anhoInicio;
        this.duracion = duracion;
        this.descripcion = descripcion;
        this.aptitudes = aptitudes;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
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
        return "Trabajo{" + "puesto=" + puesto + ", empresa=" + empresa + ", anhoInicio=" + anhoInicio + ", duracion=" + duracion + ", descripcion=" + descripcion + ", aptitudes=" + aptitudes + '}';
    }

       
    
}
