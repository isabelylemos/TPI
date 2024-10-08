/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício6;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercício6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double litros, total;
        
        DecimalFormat conv = new DecimalFormat ("0.00");
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de litros que deseja abastecer: ");
        litros = leia.nextDouble();
        
        total = litros*5.89;
        System.out.println("O valor a ser pago é: "+ conv.format(total));
    }
    
}
