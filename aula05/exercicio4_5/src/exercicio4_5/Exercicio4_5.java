/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio4_5;

import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercicio4_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nome;
        int qtd_max, qtd_est, qtd_comprar;
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Insira o nome do produto: ");
        nome = leia.next();
        
        System.out.println("Insira a quantidade máxima do produto: ");
        qtd_max = leia.nextInt();
        
        System.out.println("Insira a quantidade em estoque do produto: ");
        qtd_est = leia.nextInt();
        
        qtd_comprar = qtd_max*qtd_est;
        
        System.out.println("O produto que deve ser comprado é "+ nome + " e a quantidade a ser comprada é de  "+ qtd_comprar);
        
    }
    
}
