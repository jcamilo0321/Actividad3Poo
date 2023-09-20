package com.mycompany.figurasgeometricas;

public class triangulorectangulo {
    public double base;
    public double altura;
    public triangulorectangulo(double base, double altura){
        this.altura = altura;
        this.base = base;
    }
    public double Calculararea() {
        return (base * altura / 2);
    }
    public double Calcularhipotenusa (){
        return Math.pow(base*base + altura*altura, 0.5);
    }
    public double Calcularperimetro (){
        return (base + altura + Calcularhipotenusa()); 
    }
    public String tipoTriangulo() {
        if ((base == altura) && (base == Calcularhipotenusa()) && (altura == Calcularhipotenusa())){
           return "Es un triángulo equilátero";
        }
        else if ((base != altura) && (base != Calcularhipotenusa()) && (altura != Calcularhipotenusa())){
            return "Es un triángulo escaleno";
        }
        else {
            return "Es un triángulo isósceles";
        }     
    }
    public String areaPeri(){
        double area = Calculararea();
        double perimetro = Calcularperimetro();
        String tipo = tipoTriangulo();
        double hipo = Calcularhipotenusa();
        return "su area es " + area + ", su perimetro es " + perimetro +", su hipotenusa es " + hipo + ", y " + tipo;
    }
    
}