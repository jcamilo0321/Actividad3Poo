/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e10;

/**
 *
 * @author Kooe
 */
public class Datos {
    public int inscripcion;
    public String nombre;
    public double patrimonio;
    public double estrato;
    public Datos (int inscripcion, String nombre, double patrimonio, double estrato) {
        this.estrato = estrato;
        this.inscripcion = inscripcion;
        this.nombre = nombre;
        this.patrimonio = patrimonio;
    }
    
    public String pago(){
        if (estrato>3 && patrimonio>2000000){
            double incremento= (patrimonio*3)/100;
            double pago = 50000+incremento;
            return  "Estudiante" + nombre + ", con numero de inscripcion " + inscripcion + ", debe pagar:" + pago;
        } else {
           return "Estudiante " + nombre + ", con numero de inscripcion " + inscripcion + ", debera pagar: 50000";
        }
    }
    
}
