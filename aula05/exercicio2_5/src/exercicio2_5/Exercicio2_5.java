/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2_5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio2_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome1, nome2, nome3;
        double valor1, valor2, valor3, valor_produto1, valor_produto2, valor_produto3, valor_total, qtd1, qtd2, qtd3;
       
        
        DecimalFormat conv = new DecimalFormat("0.00");
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o nome do produto 1: ");
        nome1 = leia.next();
        System.out.println("Insira o valor do produto 1: ");
        valor1 = leia.nextDouble();
        System.out.println("Insira a quantidade vendida do produto 1: ");
        qtd1 = leia.nextDouble();
        
        System.out.println("Insira o nome do produto 2: ");
        nome2 = leia.next();
        System.out.println("Insira o valor do produto 2: ");
        valor2 = leia.nextDouble();
        System.out.println("Insira a quantidade vendida do produto 2: ");
        qtd2 = leia.nextDouble();
        
        System.out.println("Insira o nome do produto 3: ");
        nome3 = leia.next();
        System.out.println("Insira o valor do produto 3: ");
        valor3 = leia.nextDouble();
        System.out.println("Insira a quantidade vendida do produto 3: ");
        qtd3 = leia.nextDouble();
        
        valor_produto1 = valor1*qtd1;
        valor_produto2 = valor2*qtd2;
        valor_produto3 = valor3*qtd3;
        
        valor_total = valor_produto1 + valor_produto2 + valor_produto3;
        
        System.out.println("O valor total da compra foi de: "+conv.format(valor_total));
        System.out.println("O valor total da compra do produto 1 foi de: "+ conv.format(valor_produto1));
        System.out.println("O valor total da compra do produto 2 foi de: "+ conv.format(valor_produto2));
        System.out.println("O valor total da compra do produto 3 foi de: "+ conv.format(valor_produto3));
    }
    
}
  

