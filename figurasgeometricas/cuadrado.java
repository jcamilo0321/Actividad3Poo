package com.mycompany.figurasgeometricas;

public class cuadrado {
    public double lado;
    public cuadrado (double lado) {
        this.lado = lado;
    }
    public double CalcularArea (){
        return lado*lado;
    }
    public double Calcularperimetro () {
        return (4*lado);
    }
    public String AreaPeri(){
        double area = CalcularArea();
        double perimetro = Calcularperimetro();
        return "su area es " + area + ", y su perimetro es " + perimetro;
    }
}