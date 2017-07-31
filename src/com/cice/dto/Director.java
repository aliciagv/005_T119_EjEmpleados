/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.dto;

import java.util.Date;

/**
 *
 * @author cice
 */
public class Director extends Gerente {
    
    private Coche coche;
    final double incentivo=1.10;
    final int incrementa=100;

    public Director() {
    }

    public Director(String nombre, double salario, String fechaNacimiento,Departamento d, String matricula) {
        super(nombre, salario, fechaNacimiento,d);
        Coche coche=new Coche(matricula);
    }

    @Override
    public void incentivo() {
        super.incentivo(); 
        double salarioincentivado=(this.getSalario()*incentivo) + incrementa;
        this.setSalario(salarioincentivado);
    }
    
   
    
}
