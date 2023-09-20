/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.e23;

/**
 *
 * @author Kooe
 */
public class Ecuacion {
    public double CoeficienteA;
    public double CoeficienteB;
    public double CoeficienteC;

    public Ecuacion(double a, double b, double c) {
        this.CoeficienteA = a;
        this.CoeficienteB = b;
        this.CoeficienteC = c;
    }

    public double calcDiscri() {
        return CoeficienteB * CoeficienteB - (4 * CoeficienteA * CoeficienteC);
    }

    public String findSolutions() {
        String noRealSolutions = "No tiene solucion";
        double discriminant = calcDiscri();

        if (discriminant < 0) {
            return noRealSolutions;
        } else if (discriminant == 0) {
            double x = -CoeficienteB / (2 * CoeficienteA);
            return "Su unica solucion es " + x;
        } else {
            double x1 = (-CoeficienteB + Math.sqrt(discriminant)) / (2 * CoeficienteA);
            double x2 = (-CoeficienteB - Math.sqrt(discriminant)) / (2 * CoeficienteA);
            return "Las soluciones son " + x1 + " y " + x2;
        }
    }
}
