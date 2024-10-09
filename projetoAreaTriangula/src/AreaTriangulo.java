
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
public class AreaTriangulo {
    private double area;
    private double base;
    private double altura;

    public AreaTriangulo() {
        this(0.0,0.0,0.0);
    }

    public AreaTriangulo(double area, double base, double altura) {
        this.area = area;
        this.base = base;
        this.altura = altura;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void inserirdadosTriangulo(){
        setAltura(Double.parseDouble(JOptionPane.showInputDialog("Insira a altura do triângulo:")));
        setBase(Double.parseDouble(JOptionPane.showInputDialog("Insira o tamanho da base do triângulo: ")));
    }   
    
    public void calcularArea(){
        setArea ((getBase()*getAltura())/2);
    }
    
    public double mostrarAreatriagulo(){
        JOptionPane.showMessageDialog(null, "A área do triângulo é: "+getArea());
        return getArea();
    }
}
