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
public class Gerente extends Empleados {
    
    
    final double incentivo=1.05;
    Departamento d;

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
    }
    
    public Gerente() {
        //super();
    }

    public Gerente(String nombre, double salario, String fechaNacimiento,Departamento d) {
        super(nombre, salario, fechaNacimiento);
        this.d=d;
    }

    public void incentivo() {
        double salarioincentivado= this.getSalario() * incentivo;
        this.setSalario(salarioincentivado);
    }


}
