/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio1_5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio1_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double raio, area, quadrado;
        
        DecimalFormat conv = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o raio da circunferência: ");
        raio = leia.nextDouble();
        
        quadrado = Math.pow(raio, 2);
        
        area = (3.14*(quadrado));
        
        System.out.println("A área é igual a: "+ conv.format(area));
    }
    
}
