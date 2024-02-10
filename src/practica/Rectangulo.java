/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author river
 */
public class Rectangulo extends FiguraGeometrica{
    
    private double base;
    private double altura;
    
    public Rectangulo(String name, double base, double altura) {
        super(name);
        this.nombre = name;
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public void calcularArea() {
        System.out.println("Area del rectangulo: " + calcularArea(base, altura));
    }
    
    public double calcularArea(double base, double altura) {
        return base*altura;
    }
}
