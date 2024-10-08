
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fatec-dsm2
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instanciar o objeto da classe Caixa
        Caixa cx = new Caixa();
        int op;
        
        //comando do-while, repetição para o menu
        do{
           // JOptionPane.showInputDialog = caixa para entrada de valores
           op = Integer.parseInt(JOptionPane.showInputDialog("Digite: \n 1-Depositar \n 2-Sacar \n 3-Consultar Saldo \n 0-Sair"));
           
           // comando de condição switch-case para verificar qual opção selecionada
           switch (op){
               case 1:
                   cx.depositar();
                   break;
               case 2:
                   cx.sacar();
               case 3:
                   // JOptionPane.showMessageDialog = caixa de mensagem para mostrar valores
                   JOptionPane.showMessageDialog(null, "Saldo Atual: "+cx.mostrarSaldo());
                   break;
               case 0:
                   JOptionPane.showMessageDialog(null, "Finalizando...");
                   break;
               default:
                   JOptionPane.showMessageDialog(null, "Opção Inválida");
                   break;
           }
        } while(op != 0);
    }
    
}
