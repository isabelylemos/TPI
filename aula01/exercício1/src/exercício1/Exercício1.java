/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercício1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num1, num2, soma, sub, divisao, mult;
        
        DecimalFormat conv = new DecimalFormat ("0.0");
        
        Scanner leia = new Scanner (System.in);
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextDouble();
        
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextDouble();
        
        soma = num1 + num2;
        sub = num1 - num2;
        divisao = num1/num2;
        mult = num1 * num2;
        
        System.out.println("A soma dos números é igual a: "+ conv.format(soma));
        System.out.println("A subtração dos números é igual a: "+ conv.format(sub));
        System.out.println("A divisão dos números é igual a: "+ conv.format(divisao));
        System.out.println("A multiplicação dos números é igual a: "+ conv.format(mult));
    }
    
}
