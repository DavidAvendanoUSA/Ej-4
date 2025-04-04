package Areas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Figura> listaFiguras = new ArrayList<>(); 
    
    public static void main(String[] args) {
        
        Circulo c = new Circulo(5); 
        Triangulo t = new Triangulo(4, 3, 5); 
        Rectangulo r = new Rectangulo(4, 7);

        
        listaFiguras.add(c); 
        listaFiguras.add(t); 
        listaFiguras.add(r);

        
        for (Figura figura : listaFiguras) {
            System.out.println(figura); 
            System.out.println("Área: " + figura.calcularArea()); 
            System.out.println("Perímetro: " + figura.calcularPerimetro()); 
        }
    }
}
