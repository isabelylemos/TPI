/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double salfunc, salminimo, qtdsal;
        
        DecimalFormat conv = new DecimalFormat ("0.0");
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite o valor do seu salário: ");
        salfunc = leia.nextDouble();
        
        salminimo = 1412;
        
        qtdsal = salfunc/salminimo;
        System.out.println("Esta é a quantdidade de salários mínimos que contém no seu salário: " + conv.format(qtdsal));
    }
    
}
