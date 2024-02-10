/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica;

/**
 *
 * @author river
 */
public class FiguraGeometrica {
    
    protected String nombre;
    
    public FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    public void calcularArea() {
        System.out.println("Area no definida para figura geometrica.");
    }
    
    public double sumarAreas(FiguraGeometrica[] figuras, int index) {
        if(index < figuras.length) {
            figuras[index].calcularArea();
            return sumarAreas(figuras, index + 1) + 1;
        }
        return 0.0;
    }
}
