package Areas;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Figura> listaFiguras = new  ArrayList<>(); 
    public static void main(String[] args) {
        Circulo c = new Circulo(5); 
        c.calcularArea();
        c.calcularPerimetro();
        
        Triangulo t  = new Triangulo(4, 3, 5); 
        t.calcularArea();
        t.calcularPerimetro();
        
        Rectangulo r = new Rectangulo(4, 7);
        r.calcularArea();
        r.calcularPerimetro();

        listaFiguras.add(c); 
        listaFiguras.add(t); 
        listaFiguras.add(r);

        System.out.println(c);
        System.out.println(t);
        System.out.println(r);
    }
}
