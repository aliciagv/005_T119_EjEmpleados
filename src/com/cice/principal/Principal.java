/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.principal;

import com.cice.dto.Departamento;
import com.cice.dto.Director;
import com.cice.dto.Empleados;
import com.cice.dto.Gerente;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author cice
 */
public class Principal {

    public static void main(String[] args) {
        ArrayList<Empleados> listaEmpleados = new ArrayList<Empleados>();

        Empleados e1 = new Empleados("Juan", 1110.10, "01/01/1980");
        listaEmpleados.add(e1);
        Empleados e2 = new Empleados("Pedro", 1210.10, "01/02/1982");
        listaEmpleados.add(e2);
        Empleados e3 = new Empleados("Sara", 1300, "31/12/1976");
        listaEmpleados.add(e3);
        Gerente g1 = new Gerente("Luisa", 1200, "09/09/1968", new Departamento("Departamento1"));
        listaEmpleados.add(g1);
        g1.incentivo();
        System.out.println("El salario del gerente es: " + g1.getSalario());
        Director d1 = new Director("Jorge", 1200, "02/03/1974", new Departamento("Departamento2"), "1234BBB");
        listaEmpleados.add(d1);
        d1.incentivo();
        System.out.println("El salario del director es: " + d1.getSalario());
        
        
        for (Empleados listaEmpleado : listaEmpleados) {
            System.out.println(listaEmpleado.getNombre());
            System.out.println(listaEmpleado.getFechaNacimiento());
            System.out.println(listaEmpleado.getSalario());
            if (listaEmpleado instanceof Gerente){
                System.out.println((((Gerente) listaEmpleado).getD().getNombre()));
            }
            if (listaEmpleado instanceof Director){
                System.out.println(((Director) listaEmpleado).getCoche().getMatricula());
            }
            
        }
        Gerente gerente = (Gerente) listaEmpleados.get(3);
        System.out.println(gerente.getD().getNombre());
       
        
        //padre contiene un hijo pero un hijo no contiene un padre.
        
        Empleados emp1 = new Gerente("Luisa", 1200, "09/09/1968", new Departamento("Departamento1"));
        Gerente ger= new Director("Jorge", 1200, "01/01/1973", new Departamento("Departamento2"), "1234BBB");
        Director dir= new Director("Jorge", 1200, "02/03/1974", new Departamento("Departamento3"), "1234CCC");
        emp1 =ger;
        
        
        
        

        /* for (Empleados e: listaEmpleados) {
         
         
     }*/
    }

}
