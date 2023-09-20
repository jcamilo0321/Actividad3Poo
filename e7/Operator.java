
package com.mycompany.e7;

public class Operator {
    public  double valorA;
    public double valorB;
    
    
    public Operator (double valorA, double valorB){
        this.valorA = valorA;
        this.valorB = valorB;
    }
    public String mayoromenor(){
        if(valorA<valorB){
            return "A es menor que B";
        } else if (valorA>valorB){
            return "A es mayor que B"; 
        } else {
            return "A es igual que B";
        }
    }
}