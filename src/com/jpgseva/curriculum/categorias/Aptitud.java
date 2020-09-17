/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpgseva.curriculum.categorias;

/**
 * Clase objecto Aptitud
 * @author Jorge
 */
public class Aptitud {
    
    private String aptitud;

    public Aptitud(String aptitud) {
        this.aptitud = aptitud;
    }

    public String getAptitud() {
        return aptitud;
    }

    public void setAptitud(String aptitud) {
        this.aptitud = aptitud;
    }

    @Override
    public String toString() {
        return  aptitud;
    }
    
    
    
}
