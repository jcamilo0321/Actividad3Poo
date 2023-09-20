/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e22;

public class Trabajador {
    public String nombre;
    public double valorhora;
    public double horas;
    public double salarioTotal; 

    public Trabajador(double valorhora, double horas, String nombre) {
        this.nombre = nombre;
        this.horas = horas;
        this.valorhora = valorhora;        
    } 

    public String calcularSalario() { 
        salarioTotal = horas * valorhora; 
        if (salarioTotal < 450000) {
            return nombre;    
        } else {
            return String.valueOf(salarioTotal) + "$ Nombre: " + nombre;
         
        }   
    }
}


