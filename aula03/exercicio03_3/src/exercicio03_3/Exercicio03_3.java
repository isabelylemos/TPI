/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio03_3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio03_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double bonus, total;
        int qtd;
        
        Scanner leia = new Scanner(System.in);
        
        DecimalFormat conv = new DecimalFormat("0.00");
        
        System.out.println("Insira a quantidade de móveis vendidos: ");
        qtd = leia.nextInt();
        
        total = 1000 + (qtd*50);
        
        System.out.println("A quantidade de móveis vendidos foi de " + qtd + " e o seu salário total é de  "+ conv.format(total)+" reais");
        
    }
    
}
