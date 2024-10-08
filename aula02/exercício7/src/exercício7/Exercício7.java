/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício7;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercício7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       String objeto;
       double qtd, preco, total;
       
       DecimalFormat conv = new DecimalFormat("0.00");
       
       Scanner leia = new Scanner (System.in);
       
       System.out.println ("Insira a descrição do produto: ");
       objeto = leia.next();
       
       System.out.println("Insira a quantidade comprada: ");
       qtd = leia.nextDouble();
       
       System.out.println("Insira o preço unitário do produto: ");
       preco = leia.nextDouble();
       
       total = qtd*preco;
       System.out.println("O produto comprado é "+objeto+ " e o total da compra é "+ conv.format(total)+ " reais");
    }
    
}
