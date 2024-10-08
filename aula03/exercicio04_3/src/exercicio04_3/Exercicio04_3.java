/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio04_3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio04_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double valor_prest, juros, valor_atraso;
        int tempo;
        
        Scanner leia = new Scanner(System.in);
        
        DecimalFormat conv = new DecimalFormat ("0.00");
        
        System.out.println("Insira o valor da parcela: ");
        valor_prest = leia.nextDouble();
        
        System.out.println("Insira a taxa de juros: ");
        juros = leia.nextDouble();
        
        System.out.println("Insira o tempo de atraso: ");
        tempo = leia.nextInt();
        
        valor_atraso = valor_prest + (valor_prest * (juros/100)* tempo);
        
        System.out.println("O valor total da parcela com o atraso é de: "+ conv.format(valor_atraso));
 
    }
    
}
