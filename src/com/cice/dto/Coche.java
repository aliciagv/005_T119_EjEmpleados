/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

/**
 *
 * @author cice
 */
public class Coche {
    private String matricula;

    public Coche() {
    }

    
    public Coche(String matricula) {
        this.matricula = matricula;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    
}
