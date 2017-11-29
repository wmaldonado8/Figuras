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
public class Rectangulo extends Figura{

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
            private double largo;
            private double ancho;
           
 
            public double area(){
                double area=largo*ancho;
                return area;
            }
            public double perimetro(){
                double perimetro=(largo+ancho+largo+ancho);
                return perimetro;
            }
      }