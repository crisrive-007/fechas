/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica;

/**
 *
 * @author river
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FiguraGeometrica[] figuras = new FiguraGeometrica[4];
        
        FiguraGeometrica figura = new FiguraGeometrica("");
        
        figuras[0] = new Rectangulo("Rectangulo1", 5, 3);
        figuras[1] = new Circulo("Circulo1", 4);
        figuras[2] = new Rectangulo("Rectangulo2", 6, 2);
        figuras[3] = new Circulo("Circulo2", 3);
        
        System.out.println("Area total: " + figura.sumarAreas(figuras, 0));
    }
    
}
