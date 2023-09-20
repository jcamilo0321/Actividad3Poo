package com.mycompany.figurasgeometricas;

public class circulo {
    public double radio;
    
    public circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI*Math.pow(radio,2);
    }

    public double calcularPerimetro() {
    return 2*Math.PI*radio;
    }
        public String areaPeri(){
        double area = calcularArea();
        double perimetro = calcularPerimetro();
        return "su area es " + area + ", y su perimetro es " + perimetro;
    }
}
