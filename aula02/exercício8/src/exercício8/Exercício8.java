/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício8;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercício8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double ladoA, ladoB, area, perimetro;
        
        DecimalFormat conv = new DecimalFormat("0.00");
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Insira a medida do lado A em centímetros: ");
        ladoA = leia.nextDouble();
        
        System.out.println("Insira a medida do lado B em centímetros: ");
        ladoB = leia.nextDouble();
        
        area = ladoA*ladoB;
        System.out.println("A área desse retângulo é igual a: "+ conv.format(area)+ " centímetros");
        
        perimetro = (2*ladoA)+(2*ladoB);
        System.out.println("E o perímetro é igual a: "+ conv.format(perimetro)+ " centímetros");
  
    }
    
}
