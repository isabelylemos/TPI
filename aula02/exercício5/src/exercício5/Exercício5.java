/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercício5;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author fatec-dsm2
 */
public class Exercício5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double salfunc, perc, salnovo;
        
        DecimalFormat conv = new DecimalFormat("0.0");
        
        Scanner leia = new Scanner(System.in);
        
        System.out.println("Digite o seu salário atual: ");
        salfunc = leia.nextDouble();
        
        System.out.println("Digite o percentual de reajuste: ");
        perc = leia.nextDouble();
        
        salnovo = salfunc+(salfunc*perc)/100;
        System.out.println("Este é seu novo salário: "+ conv.format(salnovo));
    }
    
}
