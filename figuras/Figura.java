/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author PCD
 */
public class Figura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double altura=6.7;
        double base=10.5;
        
        Triangulo t=new Triangulo(base,altura);
        double areat=t.area();
        JOptionPane.showMessageDialog(null,"El area del triangulo es:\n"+areat);
       
        double radio=5.25;
        double radio2=7.38;
        double largo=13.27;
        double ancho=4.32;
        
        Rectangulo r=new Rectangulo(largo,ancho);
        double area1=r.area();
        JOptionPane.showMessageDialog(null,"Su area del Rectangulo es:\n"+area1);
        Circulo c=new Circulo(radio);
        double area2=c.area();
        JOptionPane.showMessageDialog(null,"Su area del Circulo1 es:\n"+area2);
        Circulo cir=new Circulo(radio2);
        double area3=cir.area();
        JOptionPane.showMessageDialog(null,"Su area del Circulo2 es:\n"+area3);
        
        double suma_areas=area1+area2+area3;
        JOptionPane.showMessageDialog(null,"Suma total de las areas es:\n"+suma_areas);
        
        double perimetro=t.perimetro();
        JOptionPane.showMessageDialog(null,"Su perimetro del Triangulo es:\n"+perimetro);
        
        double perimetro1=r.perimetro();
        JOptionPane.showMessageDialog(null,"Su perimetro del Rectangulo es:\n"+perimetro1);
        
        double perimetro2=c.perimetro();
        JOptionPane.showMessageDialog(null,"Su perimetro del Circulo es:\n"+perimetro2);    
    }    
            
}

