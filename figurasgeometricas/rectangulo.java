package com.mycompany.figurasgeometricas;

public class rectangulo {
    public double base;
    public double altura;
    public rectangulo (double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    public double Calculararea(){
        return base * altura;
    }
    public double Calcularperimetro (){
        return (2 * base) + (2 * altura);
    }
    public String AreaPeri(){
        double area = Calculararea();
        double perimetro = Calcularperimetro();
        return "su area es " + area + ", y su perimetro es " + perimetro;
    }
    
    
}