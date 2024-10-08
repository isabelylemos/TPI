/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3_5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio3_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double volume, raio, quadrado, altura;
        
        DecimalFormat conv = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o raio do cilindro: ");
        raio = leia.nextDouble();
        
        System.out.println("Insira a altura do cilindro: ");
        altura = leia.nextDouble();
        
        quadrado = Math.pow(raio, 2);
        
        volume = 3.14159*quadrado*altura;
        
        System.out.println("O volume do cilindro é de: "+ conv.format(volume));
        
    }
    
}
