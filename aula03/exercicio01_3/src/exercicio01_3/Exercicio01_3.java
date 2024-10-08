/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio01_3;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio01_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, dobro, triplo;
        
        Scanner leia = new Scanner (System.in);
        
        System.out.println("Digite o primeiro número: ");
        num1 = leia.nextInt();
        
        System.out.println("Digite o segundo número: ");
        num2 = leia.nextInt();
        
        dobro = num1 + num1;
        triplo = (int) Math.pow(num2, 3);
        
        System.out.println("O primeiro número é "+num1 +" e esse é o dobro do número: "+ dobro);
        System.out.println("O segundo número é "+num2+" e esse é o triplo do número: "+ triplo);
    }
    
}
