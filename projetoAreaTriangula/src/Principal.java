
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
        // TODO code application logic here
        
        AreaTriangulo area = new AreaTriangulo();
        
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("1 - Insira os dados do triângulo \n 2 - Calcular área do triângulo \n 3 - Mostrar área do triângulo \n 0 - Sair"));
            
            switch(op){
                case 1:
                    area.inserirdadosTriangulo();
                break;
                case 2:
                    area.calcularArea();
                break;
                case 3:
                    area.mostrarAreatriagulo();
                break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Finalizando...");
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                break;      
            }
        }while(op!=0);
    }
    
}
