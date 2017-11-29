/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author PCD
 */
public class Triangulo {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura, double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        System.out.println("-----------Construyendo triangulo------------");
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    
    

    public double area() {
        double area=(base*altura)/2;
        return area;
    }

    public double perimetro() {
        double perimetro=lado1+lado2+base;
        return perimetro;
    }
  
}
