/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author river
 */
public class Circulo extends FiguraGeometrica{
    
    private double radio;
    
    public Circulo(String name, double radio) {
        super(name);
        this.nombre = name;
        this.radio = radio;
    }
    
    public void calcularArea() {
        System.out.println("Area del circulo: " + calcularArea(radio));
    }
    
    public double calcularArea(double radio) {
        return Math.PI*radio*radio;
    }
}
