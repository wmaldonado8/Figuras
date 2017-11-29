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
public class Circulo extends Figura{

    public Circulo(double radio) {
        this.radio = radio;
    }
            private double radio;
             public double area(){
                double area=3.14259 * (radio*radio);;
                return area;
            }
            public double perimetro(){
                double perimetro=3.14159 * 2 * radio;
                return perimetro;
            }
            }